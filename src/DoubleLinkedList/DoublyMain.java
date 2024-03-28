package DoubleLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        doublyLL.print();
        doublyLL.insert(1);
        doublyLL.insert(3);
        doublyLL.insert(46);
        doublyLL.insertionAtMiddle(2,3);
        doublyLL.print();
    }
}
