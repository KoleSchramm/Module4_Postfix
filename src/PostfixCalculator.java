import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {
    public double calculate(String string) {
        String element;
        Scanner scan = new Scanner(string);
        Stack<Double> stack = new Stack<>();

        try {
            while (scan.hasNext()) {
                element = scan.next();

                try {
                    stack.push(Double.parseDouble(element));
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
                        System.out.println("Invalid input.");
                        return 0;
                    }
                }
            }
            if(stack.size() == 1) {
                return stack.peek();
            }
            else{
                System.out.println("Invalid input.");
                return 0;
            }
        }
        catch (Exception e){
            System.out.println("Invalid input.");
            return 0;
        }
    }
}
