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
                    if (element.equals("-")) {
                        stack.push(stack.pop() - stack.pop());
                    }
                    if (element.equals("*")) {
                        stack.push(stack.pop() * stack.pop());
                    }
                    if (element.equals("/")) {
                        stack.push(stack.pop() / stack.pop());
                    }
                    if (element.equals("%")) {
                        stack.push(stack.pop() % stack.pop());
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
