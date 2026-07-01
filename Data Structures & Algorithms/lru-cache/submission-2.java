class LRUCache {
    private HashMap<Integer,DoublyLinkedListNode> cache = new HashMap<>();
    private int capacity = 0;
    private DoublyLinkedList linkedList = new DoublyLinkedList();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        DoublyLinkedListNode node = cache.get(key);
        if (node == null)
            return -1;
        
        removeNodeRef(node);
        insertMostRecentNode(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        DoublyLinkedListNode node;
        if (cache.containsKey(key)){
            node = cache.get(key);
            node.val = value;
            removeNodeRef(node);
        }else{
            node = new DoublyLinkedListNode(key,value);
            cache.put(key, node);
        } 
        insertMostRecentNode(node);

        if (cache.size() > capacity){
            removeLastRecentUsed();
        }
    }

    private void removeNodeRef(DoublyLinkedListNode node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void insertMostRecentNode(DoublyLinkedListNode node){
        linkedList.insertEnd(node);
    }

    private void removeLastRecentUsed(){
        cache.remove(linkedList.removeFront().key);
    }
    
}

public class DoublyLinkedListNode{
    int val;
    int key;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int key,int val){
        this.val = val;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}


public class DoublyLinkedList{
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public DoublyLinkedList(){
        head = new DoublyLinkedListNode(-1,-1);
        tail = new DoublyLinkedListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public DoublyLinkedListNode removeFront(){
        DoublyLinkedListNode node = head.next; 
        head.next.next.prev = head;
        head.next = head.next.next;
        return node;
    }

    public void insertEnd(DoublyLinkedListNode newNode){
        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev.next = newNode;
        tail.prev = newNode;
    }




}
