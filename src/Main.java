// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//      func f = new func();
//      f.pop();
//      f.push(1);
//      f.push(5);
//      f.push(3);
//      f.push(2);
//      f.push(7);
//      f.push(6);
//      f.pop();

      QueueUsingStacks queue = new QueueUsingStacks();
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);

//      System.out.println("Front element: " + queue.peek()); // Output: 1

      System.out.println("Dequeued element: " + queue.dequeue()); // Output: 1
      System.out.println("Dequeued element: " + queue.dequeue()); // Output: 2
      System.out.println("Dequeued element: " + queue.dequeue()); // Output:

      queue.enqueue(4);
      queue.enqueue(5);

    }
}