import java.util.Stack;

public class queue_a {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();

    public void enqueue(int element){
        if(stack1.isEmpty() && stack.isEmpty()){
            stack.push(element);
        } else if (stack.isEmpty() && !(stack1.isEmpty())) {
            for (int i = 0; i < stack1.size(); i++) {
                stack.push(stack1.pop());
            }
            stack.push(element);
        } else if (!(stack.isEmpty())&& stack1.isEmpty()) {
            stack.push(element);
        }
    }
    public void random(){
        System.out.println(stack.pop());
    }

    public int dequeue(){
        int b=-2;
        if(stack.isEmpty() && stack1.isEmpty()){
            b=-1;
        }
        if (stack1.isEmpty() && !(stack.isEmpty())){
            for (int i = 0; i < stack.size(); i++) {
                stack1.push(stack.pop());
            }
            b=stack1.pop();
        }
        if(!(stack1.isEmpty()) && stack.isEmpty()){
            b= stack1.pop();
        }
        return b;
    }


}
