class MyHashSet {

    private boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1_000_001]; // Initialize array for keys in range [0, 1000000]
        
    }
    
    public void add(int key) {
        storage[key] = true; // Mark key as present
    }
    
    public void remove(int key) {
        storage[key] = false; // Mark key as absent
    }
    
    public boolean contains(int key) {
        return storage[key]; // Check if key is present
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */