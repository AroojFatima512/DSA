package Stack;

public class StackByLinkedList {
   Node head;
   public boolean isEmpty(){
       return head == null;
   }
   void push(int data){
       Node node = new Node(data);
       if(isEmpty()){
           head = node;
           return;
       }
      node.next = head;
       head = node;
   }

   int pop(){
       if(isEmpty()){
           return -1;
       }
       int top = head.data;
       head = head.next;
       return top;
   }

   int peek(){
       if(isEmpty()){
           return -1;
       }
       return head.data;
   }

    public static void main(String[] args) {
        StackByLinkedList list = new StackByLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        while (!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
