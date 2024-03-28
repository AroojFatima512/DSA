package Stack;

import java.util.Stack;

public class StackReverse {
    Stack <String> stack1 = new Stack<>();
    Stack <String> stack2 = new Stack<>();
    void add(String data){
//        while (!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        stack1.push(data);

        stack1.push(data);
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
    }

    void print(){
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("h");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
//        Stack.StackReverse s = new Stack.StackReverse();
//        s.add("h");
//        s.add("e");
//        s.add("l");
//        s.add("l");
//        s.add("o");
//        s.print();
    }
}
