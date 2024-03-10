import java.util.Stack;

public class Conversion {
    StringBuilder output;
    String infixExpression;
    char[] tokens;

    public Conversion(String infixExpression) {
        this.infixExpression = infixExpression;
        this.output = new StringBuilder();
    }

    public void tokenizeExpression(String infixExpression) {
        tokens = infixExpression.toCharArray();
    }

    public int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return 0;
        }
    }

    public String convert() {
        Stack<Character> stack = new Stack<>();
        tokenizeExpression(infixExpression);

        for (int i = 0; i < tokens.length; i++) {
            char token = tokens[i];
            if (Character.isDigit(token)) {
                output.append(token);
            } else if (token == '(') {
                stack.push(token);
            } else if (token == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop(); // Pop the '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
                    output.append(stack.pop());
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Conversion c = new Conversion("(((5+5)-9)*2)");
        System.out.println(c.convert());
        System.out.println(c.operation(c.convert()));
    }

    public int operation(String postNotation) {
        char[] tokens = postNotation.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char token : tokens) {
            if (Character.isDigit(token)) {
                stack.push(token - '0');
            } else {
                if (!stack.isEmpty()) {
                    int b = stack.pop();
                    int a = stack.pop();
                    int result = unitOperation(a, b, token);
                    stack.push(result);
                }
            }
        }
        return stack.pop();
    }

    public int unitOperation(int a, int b, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    throw new ArithmeticException("divide by zero exception");
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    throw new ArithmeticException("divide by zero exception");
                }
                break;
        }
        return result;
    }
}
