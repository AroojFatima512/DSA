package Questions;

import java.util.Scanner;
public class sumOfOdd {
//    Write a function to print the sum of all odd numbers from 1 to n.
    public static void sum(int n){
        int num=0;
       for (int i=1; i<=n; i++){
          if(!(i%2==0)){
              num= num+i;
          }
       }
        System.out.println(num);
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    sum(n);
}
}
