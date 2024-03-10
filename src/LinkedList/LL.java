package LinkedList;

import java.util.Scanner;

public class LL {
   Node head;
   private int size;
   LL(){
       this.size=0;
   }

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data){
        if(data>=1 && data <=50 ) {
           Node newNode = new Node(data);

           if (head == null) {
               head = newNode;
               return;
           }
           newNode.next = head;
           head = newNode;
       }
        else {
            System.out.println("Number should be in between 1 to 50");
        }
    }

    public void addLast(int data) {
       if(data>=1 && data <=50 ) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }
       else {
           System.out.println("Number should be in between 1 to 50");
       }

    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node previous = head;
        Node current = head.next;
        while (current.next != null){
            previous = previous.next;
            current = current.next;
        }

        previous.next = null;
    }

    public void delete(){

        Node current= head;
        while(current.next != null){
            if(current.data > 25){
                current.data = current.next.data;
              return;
            }
        }
    }
    public int searchNumber(int number){
       if (head == null){
           System.out.println("List is empty");
           return -1;
       }
       int index = 0;
       Node last = head;
       while (last != null) {
           if (last.data == number)
               return index;

           last = last.next;
           index++;
       }
           return -1;
    }

    public int getSize(){
       return size;
    }

    public static void main(String[] args) {
     LL list = new LL();
//     list.print();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        int g = s.nextInt();
        int num = s.nextInt();
     list.addFirst(a);
     list.addFirst(b);
     list.addFirst(c);
     list.addFirst(d);
     list.addLast(e);
     list.addLast(f);
     list.addLast(g);
     list.print();
     int index = list.searchNumber(num);
        System.out.println(index);

        list.delete();
        list.print();
//     list.addFirst("am");
//     list.addFirst("I");
//     list.print();
//     list.addLast("Arooj");
//     list.print();
//        System.out.println(list.getSize());
//     list.deletefirst();
//     list.print();
//     list.deleteLast();
//     list.print();
//        System.out.println(list.getSize());
    }
}
