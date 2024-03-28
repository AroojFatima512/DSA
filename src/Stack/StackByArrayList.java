package Stack;

import java.util.ArrayList;

public class StackByArrayList {
    ArrayList <Integer> list = new ArrayList<>();
    int top = -1;

    boolean isEmpty(){
        return list.size() == 0;
    }

    void push(int data){
        list.add(data);
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        StackByArrayList arrayList = new StackByArrayList();
        arrayList.push(1);
        arrayList.push(2);
        arrayList.push(3);
        while (!arrayList.isEmpty()){
            System.out.println(arrayList.peek());
            arrayList.pop();
        }
    }
}
