import LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(11);
        list.add(22);
        list.add(3);
        list.add(4);

        list.sort();
        list.print();
    }
}
