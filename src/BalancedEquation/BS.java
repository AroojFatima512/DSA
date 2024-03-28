package BalancedEquation;

import java.util.Scanner;

public class BS {

        public static boolean isBalanced(String equation) {
            int openCount = 0;
            int closedCount = 0;

            for (int i = 0; i < equation.length(); i++) {
                char ch = equation.charAt(i);

                if (ch == '(') {
                    openCount++;
                } else if (ch == ')') {
                    closedCount++;
                }

                // If closed parentheses count exceeds open parentheses count, return false immediately
                if (closedCount > openCount) {
                    return false;
                }
            }

            // Check if both counts are equal
            return openCount == closedCount;
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
