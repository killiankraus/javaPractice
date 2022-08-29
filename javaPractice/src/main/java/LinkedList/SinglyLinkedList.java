package LinkedList;

public class SinglyLinkedList {
    public Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public void add(int index, int data) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        } else {
            Node current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
            this.size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            this.head = this.head.next;
            this.size--;
        } else {
            Node current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            this.size--;
        }
    }

    public int get(int index) throws Exception {
        if (index < 0 || index >= this.size) {
            throw new Exception("Index out of bounds");
        }
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = this.head;
        Node previous = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    // reverse using recursive
    public void reverseRecursive(Node current) {
        if (current == null) {
            return;
        }
        if (current.next == null) {
            this.head = current;
            return;
        }
        reverseRecursive(current.next);
        Node next = current.next;
        next.next = current;
        current.next = null;
    }

    public void sort() {
        Node current = this.head;
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                if (current.data > next.data) {
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }

}
