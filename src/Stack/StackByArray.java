package Stack;

public class StackByArray {
    int[] arr;
    int top;
    StackByArray(){
        arr = new int[6];
        top = -1;
    }
    void add(int data){
        if (top == arr.length-1) {
            System.out.println("Array full");
            System.out.println(top);
            return;
        }
        arr[++top] = data;
        System.out.println(data);
    }

    void remove(){
        if (top == -1){
            System.out.println("Array is empty");
            System.out.println(top);
            return;
        }
        int item = arr[top--];
        System.out.println(item);
    }
    public static void main(String[] args) {
        StackByArray s = new StackByArray();
        s.add(1);
        s.add(2);
        s.add(3);
        s.remove();
        s.remove();
    }
}
