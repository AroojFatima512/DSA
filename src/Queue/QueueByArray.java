package Queue;

public class QueueByArray {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

    }
}
