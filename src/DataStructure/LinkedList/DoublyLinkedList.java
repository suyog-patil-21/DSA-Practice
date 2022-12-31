package DataStructure.LinkedList;

public class DoublyLinkedList {
    // FIXME : make generic and add other functions needed
    private Node head;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
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

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insert(int after, int value) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value,p.next,p);
        p.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        Node node = new Node(value);
        node.prev = last;
        node.next = null;
        last.next = node;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        System.out.println("Forward Print:");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Reverse Print:");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START\n");
    }

}
