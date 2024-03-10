package Queue;

public class circular {
    int[] arr;
    int size;
    circular (int size){
        arr = new int[size];
        this.size = size;
    }
    int back = size-1;
    public void enqueue(int element){
        if(back < 0){
            back = arr.length-1;
            if(arr[back] != Integer.MIN_VALUE ){
                System.out.println("Array is Full");
            }
            else {
                arr[back] = element;
                back--;
            }
        }
//     public void show(){
//            return String.format();
//       }
    }
    public static void main(String[] args) {
        circular c = new circular(5);
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);
//       for (int i=0; i<=5; i++){
//           System.out.println(c);
//       }
    }
}






