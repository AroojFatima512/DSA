package BalancedEquation;
import java.util.Scanner;
import java.util.Stack;
public class Balance {
     public static boolean isBalanced(String equation) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < equation.length(); i++) {
                char ch = equation.charAt(i);

                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']' || ch == '}') {
                    if (stack.isEmpty()) {
                        return false; // Unbalanced parentheses
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||
                            (ch == ']' && top != '[') ||
                            (ch == '}' && top != '{')) {
                        return false; // Mismatched parentheses
                    }
                }
            }

            return stack.isEmpty(); // True if all parentheses are balanced
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Equation1: ");
            String equation1 = s.nextLine();

            System.out.println("Enter Equation2: ");
            String equation2 = s.nextLine();

            System.out.println("Equation 1 is balanced: " + isBalanced(equation1));
            System.out.println("Equation 2 is balanced: " + isBalanced(equation2));
        }
    }



