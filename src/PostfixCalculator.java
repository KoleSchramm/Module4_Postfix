import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {
    public double calculate(String string) {
        String element;
        Scanner scan = new Scanner(string);
        Stack<Double> stack = new Stack<>();

        try {
            //check for each token of string
            while (scan.hasNext()) {
                element = scan.next();

                //If token can be parsed into a double, add double to stack
                try {
                    stack.push(Double.parseDouble(element));
                //If token is not a double, check for operator
                } catch (Exception e) {
                    if (element.equals("+")) {
                        stack.push(stack.pop() + stack.pop());
                    }
                    else if (element.equals("-")) {
                        double num1 = stack.pop();
                        double num2 = stack.pop();
                        stack.push(num2-num1);
                    }
                    else if (element.equals("*")) {
                        stack.push(stack.pop() * stack.pop());
                    }
                    else if (element.equals("/")) {
                        double num1 = stack.pop();
                        double num2 = stack.pop();
                        stack.push(num2/num1);
                    }
                    else if (element.equals("%")) {
                        double num1 = stack.pop();
                        double num2 = stack.pop();
                        stack.push(num2%num1);
                    }
                    else{
                        //If token is neither a double nor operator, print error message
                        System.out.println("Unknown characters.");
                        return 0;
                    }
                }
            }
            //Return last element in stack. If more than one element, print error message
            if(stack.size() == 1) {
                System.out.println("Result: " + stack.peek());
                return stack.peek();
            }
            else{
                System.out.println("Not enough operators or too many operands.");
                return 0;
            }
        }
        catch (Exception e){
            System.out.println("Too many operators or not enough operands.");
            return 0;
        }
    }
}
