import java.util.Stack;

    class QueueUsingStacks {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Enqueue an element to the queue
        public void enqueue(int x) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            // Push the new element to stack1
            stack1.push(x);

            // Move all elements back to stack1 from stack2
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        // Dequeue an element from the queue
        public int dequeue() {
            // If queue is empty
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
            }

            // Return top of stack1 (front of queue)
            return stack1.pop();
        }


    }




