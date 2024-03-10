package Questions;

import java.util.Scanner;

public class Voting {
//    Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void eligible(int age ){
        if(age>18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    eligible(a);
}
}
