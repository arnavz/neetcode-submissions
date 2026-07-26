class LRUCache {

    private static class Node{
        int key;
        int value;
        Node next;
        Node prev;

        Node(){}
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }

    }

    private final int capacity;
    private final Map<Integer, Node> cache;

    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        head = new Node();
        tail = new Node(); 
        head.next = tail;
        tail.prev = head;

    }
    
    public int get(int key) {
        Node node = cache.get(key);
        if(node == null){
            return -1;
        }

        moveToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        if(node != null){
            node.value = value;
            cache.put(key, node);
            moveToFront(node);
            return;
        }
        
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        addToFront(newNode);
        if(cache.size() > capacity){
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToFront(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;


    }

    private void moveToFront(Node node){
        remove(node);
        addToFront(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */