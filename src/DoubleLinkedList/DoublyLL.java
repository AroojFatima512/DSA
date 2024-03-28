package DoubleLinkedList;

public class DoublyLL {
    Node head;
    Node tail;
    void insert(int data){
        Node newNode = new Node(data);
        if (head == null && tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    void insertionAtMiddle(int data, int loc){
        Node node = new Node(data);
        Node previous = null;
        Node current = head;

        if (head == null){
            head = node;
        }
        else if (loc == 1) {
            node.next=head;
            head.previous=node;
            head=node;
        }

    int coun = 0;
    while (current != null){
        coun++;
      if (coun == loc) {
          current.previous = node;
          node.next = current;
          current.previous.next = node;
          node.previous = current.previous;
      }
        current = current.next;
    }
    }

    void print(){
        if (head == null && tail == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
