package Stack;

import java.util.Stack;
public class RecursiveReverse {
    public static void PushAtBottom(int data, Stack <Integer> s){
       if (s.isEmpty()){
           s.push(data);
           return;
       }
       int top = s.pop();
       PushAtBottom(data, s);
       s.push(top);
    }

    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        PushAtBottom(top, s);
    }
    public static void main(String[] args) {
    Stack <Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
//    PushAtBottom(4, stack);
    Reverse(stack);
    while (!stack.isEmpty()){
        System.out.println(stack.peek());
        stack.pop();
    }
  }
}
