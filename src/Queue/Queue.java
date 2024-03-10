package Queue;

public class Queue {
    int[] arr;
    int size;
    int rear = -1;
    public Queue(int size) {
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public void enqueue(int data){
         if(rear == size-1){
             System.out.println("Array is full");
             return ;
         }
         rear++;
         arr[rear] = data;
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        }
        else {
            int front = arr[0];
            for (int i=0; i<rear; i++){
                arr[i] = arr[i+1];
        }
        rear--;
        return front;
        }
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        }

        return arr[0];
    }
}

