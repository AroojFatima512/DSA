public class queueMain {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Dequeued elemet: "+q.dequeue());
        System.out.println("Dequeued elemet: "+q.dequeue());
        System.out.println("Dequeued elemet: "+q.dequeue());
        System.out.println("Dequeued elemet: "+q.dequeue());
        System.out.println("Dequeued elemet: "+q.dequeue());
    }
}
