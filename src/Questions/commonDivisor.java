package Questions;

import java.util.Scanner;

public class commonDivisor {
//    Write a function that calculates the Greatest Common Divisor of 2 numbers.

    public static int greatestCommonDivisor(int a, int b){
        int n=1,gcd =0;
        for (int i=1; i<a; i++){
            if(a/i==0 && b/i==0){
             gcd =  i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(greatestCommonDivisor(a,b));
    }
}
