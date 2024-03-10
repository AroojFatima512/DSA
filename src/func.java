import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class func {
    public static int evaluation(String postfix){
        Stack<Integer> stack = new Stack<>();
        for (String element: postfix.split(" ")){
            if(isInteger(element)){
                stack.push(Integer.parseInt(element));
            }
            else {
                int no1 = stack.pop();
                int no2 = stack.pop();
                switch (element){
                    case "+":
                        stack.push(no2 + no1);
                        break;
                    case "-":
                         stack.push(no2 - no1);
                         break;
                    case "*":
                         stack.push(no2 * no1);
                         break;
                    case "/":
                         stack.push(no2 / no1);
                         break;
                    case "%":
                        stack.push(no2 % no1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static boolean isInteger(String element){
        try {
            Integer.parseInt(element);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static String infixToPostfix(String infix){
        Stack<String> operators = new Stack<>();
        List<String> postfix = new ArrayList<>();
        for(String element: infix.split(" ")){
            if(isOperator(element)){
                while (!operators.empty() &&
                        hasLowerPrecedence(element, operators.peek())){
                    postfix.add(operators.pop());
                }
                operators.push(element);
            }
            else {
                postfix.add(element);
            }
        }
        while (!operators.empty()){
            postfix.add(operators.pop());
        }
        return String.join(" ", postfix);
    }

    public static boolean isOperator(String operator){
        return List.of("+", "-" , "*", "/" , "%").contains(operator);
    }

    public static boolean hasLowerPrecedence(String op1, String op2){
          return precedence(op1)< precedence(op2);
    }

    public static int precedence(String operator){
        return switch (operator) {
            case "+", "-" -> 1;
            case "%", "/", "*"-> 2;
            default -> 0;
        };
    }
}
