public class TrieNode{
    boolean word = false;
    HashMap<Character, TrieNode> children = new HashMap<>(); 
}

public class WordDictionary {
    private TrieNode root; 

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = this.root;
        for (char c : word.toCharArray()){
            if(!curr.children.containsKey(c)){
                curr.children.put(c,new TrieNode());
            }
            curr = curr.children.get(c); 
        }
        curr.word = true;
    }

    public boolean search(String word) {
        TrieNode curr = this.root;
        return searchComplete(word,0,curr);
    }

    public boolean searchComplete(String word, int index, TrieNode curr) {
        char[] charArray = word.toCharArray();
        for(int i = index; i < charArray.length; i++){
            char c = charArray[i];
            System.out.println("seachWithDot char: " + c + " index: " + index);
            if (c == '.') {
                for (TrieNode child : curr.children.values()) {
                    if (searchComplete(word, i+1 ,child)) {
                        return true;
                    }
                }
                return false;
            }
            if(!curr.children.containsKey(c)){
                return false; 
            }
            curr = curr.children.get(c);
        }
        return curr.word; 
    }




}
