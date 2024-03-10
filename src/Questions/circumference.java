package Questions;

import java.util.Scanner;

public class circumference {
    //Write a function that takes in the radius as input and returns the Questions.circumference of a circle.
   public static double Circumference(float radius){
       return 2*3.14*radius;

   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        System.out.println(Circumference(a));
    }
}
