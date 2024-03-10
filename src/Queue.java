import java.util.Stack;

public class Queue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int element) {
        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(element);
        System.out.println(stack1.peek());

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    int dequeue(){
        if (stack1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return stack1.pop();

    }
}
