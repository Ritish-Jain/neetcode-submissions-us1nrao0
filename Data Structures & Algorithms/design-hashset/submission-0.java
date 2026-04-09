class MyHashSet {
    private List<Integer>[] container;
    private final int bucket=769;
    public MyHashSet() {
        container=new LinkedList[bucket];
        for(int i=0;i<bucket;i++){
            container[i]=new LinkedList<>();
        }
    }

    private int hash(int key){
        return key%bucket;
    }
    
    public void add(int key) {
        int ind=hash(key);
        if(!container[ind].contains(key)){
            container[ind].add(key);
        }
    }
    
    public void remove(int key) {
        int ind=hash(key);
        container[ind].remove(Integer.valueOf(key));   
    }
    
    public boolean contains(int key) {
        int ind=hash(key);
        return container[ind].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */