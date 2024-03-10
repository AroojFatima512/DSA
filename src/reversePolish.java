import java.util.Scanner;

public class reversePolish{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String infix = s.nextLine();
        String postfix = func.infixToPostfix(infix);
        System.out.println(postfix);
        System.out.println(func.evaluation(postfix));
    }
}


