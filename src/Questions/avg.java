package Questions;

import java.util.Scanner;

public class avg {

    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
//        Enter 3 numbers from the user & make a function to print their average.
        Scanner s= new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        System.out.println("The average of 3 Numbers is: " +avg(n1,n2,n3));
    }


}
