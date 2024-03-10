
    import java.util.Stack;

    public class que{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        void enqueue(int element) {
            stack1.push(element);

            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            System.out.println(stack2.peek());
        }

        int dequeue(){
            if (stack2.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return stack2.pop();
        }


        public static void main(String[] args) {
            que queue = new que();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);

            System.out.println(queue.dequeue()); // Should print 1
            System.out.println(queue.dequeue()); // Should print 2
            System.out.println(queue.dequeue()); // Should print 3
//            System.out.println(queue.dequeue()); // Should print "Queue is empty" and return -1
        }
    }


