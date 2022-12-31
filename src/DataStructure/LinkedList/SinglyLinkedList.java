package DataStructure.LinkedList;

public class SinglyLinkedList {
    // FIXME : make generic and add other functions needed
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    /**
     * Insert Element at any index.If the index is more than the size of the
     * linkedlist it will be added ata last.
     * 
     * @param val
     * @param index starts from 0
     */
    public void insert(int val, int index) {
        if (index == 0) {
            insertLast(val);
            return;
        }
        if (index >= size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int removeFirst() throws Exception {
        if (head == null)
            throw new Exception("Empty LinkedList");
        int val = head.value;
        head = head.next;
        if (head.next == null) {
            tail = null;
        }
        size -= 1;
        return val;
    }

    public int remove(int index) throws Exception {
        if (index <= 1) {
            return removeFirst();
        }
        if (index >= size - 1) {
            return removeLast();
        }
        Node pre = get(index - 1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        size -= 1;
        return val;
    }

    public int removeLast() throws Exception {
        if (size <= 1) {
            return removeFirst();
        }
        int val = tail.value;
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size -= 1;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
