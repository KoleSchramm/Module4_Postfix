public class Main {
    public static void main(String[] args) {
        PostfixCalculator postfixCalculator = new PostfixCalculator();

        //Valid expressions
        postfixCalculator.calculate("10.8 19.2 +");
        postfixCalculator.calculate("23.6 234 -");
        postfixCalculator.calculate("56 12 *");
        postfixCalculator.calculate("3 4 /");
        postfixCalculator.calculate("12 7 %");

        //Invalid expression
        postfixCalculator.calculate("12 7 % %");
    }
}