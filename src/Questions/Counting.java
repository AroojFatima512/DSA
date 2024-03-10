package Questions;

import java.util.Scanner;

public class Counting {
//    Write a program to enter the numbers till the user wants and at the end
//    it should display the count of positive, negative and zeros entered.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int zero=0;
        int negative = 0;
        int positive = 0;
        for (int i=1; i<=num; i++) {
            int b = s.nextInt();
            if (b==0){
                zero++;
            }
            if (b<0){
                negative++;
            }
            if (b>0){
                positive++;
            }
        }
        System.out.println("The zeros are: "+zero);
        System.out.println("The negative numbers are: "+negative);
        System.out.println("The positive numbers are: "+positive);
    }
}
