package Questions;

import java.util.Scanner;

public class power {
//    Two numbers are entered by the user, x and n. Write a function to find
//    the value of one number raised to the Questions.power of another i.e. xn.
  public static double pow(int a, int b){
      return Math.pow(a,b);
  }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(pow(x,n));
    }
}
