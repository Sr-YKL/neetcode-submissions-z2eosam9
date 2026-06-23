class LRUCache {
    LinkedHashMap<Integer,Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
        this.capacity =capacity;
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
        if (cache.size() > capacity) {
            int lru = cache.keySet().iterator().next();
            cache.remove(lru);
        }
    }
}
