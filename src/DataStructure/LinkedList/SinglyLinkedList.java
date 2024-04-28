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

    private Node find(int value) {
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
            insertFirst(val);
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

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size += 1;
            return temp;
        }
        node.next = insertRec(value, index - 1, node.next);
        return node;
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

    public boolean hasCycle(Node head) {
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
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

    /**
     * Reversal of the List
     * Using Recursion
     */
    public void reverse(Node node) {
        if (node == head) {
            head = node;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    /**
     * In place reversal of the list
     * WITHOUT Recursion
     */
    public void reverse() {
        // if(head == null){
        //     return head;
        // }
        if (size < 2) {
            return;
        }
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
        // return prev;
    }

}
