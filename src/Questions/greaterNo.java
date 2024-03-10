package Questions;

import java.util.Scanner;

public class greaterNo {
//    Write a function which takes in 2 numbers and returns the greater of those two.
    public  static void greaterNumber(int a, int b){
        int max=a;
        if(b>a){
            max=b;
        }
        System.out.println("The greater Number is: "+max);
    }

    public  static void smallerNumber(int a, int b){
        int min=a;
        if(b<a){
            min=b;
        }
        System.out.println("The Smaller Number is: "+min);
    }

    public static int getGreater(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(getGreater(a,b));
        greaterNumber(a, b);
        smallerNumber(a, b);

    }
}
