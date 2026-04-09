class Node {
    int first;
    int second;
    Node(int k, int v) {
        first = k;
        second = v;
    }
}

class MyHashMap {
    private final int SIZE=769;
    private List<Node>[] table;

    public MyHashMap() {
        table=(List<Node>[])new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            this.table[i]=new LinkedList<Node>();
        }
    }
    
    public void put(int key, int value) {
        int idx=key%SIZE;
        List<Node> q=table[idx];
        for(Node p:q)
            if(p.first==key){
                p.second=value;
                return;
            }
        q.add(new Node (key,value));
    }
    
    public int get(int key) {
        int idx=key%SIZE;
        List<Node> q=table[idx];
        for(Node p:q){
            if(p.first==key)
                return p.second;
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx=key%SIZE;
        List<Node> q=table[idx];
        for(Node p:q){
            if(p.first==key){
                q.remove(p);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */