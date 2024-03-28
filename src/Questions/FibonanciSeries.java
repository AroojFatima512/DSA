package Questions;

import java.util.Scanner;

public class FibonanciSeries {
    public static int fac(int n){
        int fac = 1, a = 0;
        if (n<0){
            System.out.println("Invalid Number");

        }
        else {

            for (int i = n; i >= 1; i--) {
                a = fac *= i;
            }
        }
            return a;

    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(fac(n));
//        int b = s.nextInt();
//
//        System.out.println(sum(a,b));

//        int fac = 1;
//        int i,n=4;
//        for (i=n; i>=1; i--) {
//            fac *= i;
//        }
//        System.out.println(fac);
//
//        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//        int no = 10;
//        int firstNum = 0;
//        int secondNum = 1;
//
//        System.out.println("Fibonacci Series:");
//
//        for ( i = 1; i <= no; i++) {
//            System.out.print(firstNum + " ");
//
//            int nextNum = firstNum + secondNum;
//            firstNum = secondNum;
//            secondNum = nextNum;
//        }
//
//        int num = 10; // Change the value of n to determine how many Fibonacci numbers you want to generate
//
//        System.out.println("\nFibonacci Series by recursion :");
//        for ( i = 0; i < num; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
    }
}
