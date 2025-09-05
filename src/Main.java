public class Main {
    public static void main(String[] args) {
        PostfixCalculator postfixCalculator = new PostfixCalculator();

        //Valid expressions
        System.out.println(postfixCalculator.calculate("10.8 19.2 +"));
        System.out.println(postfixCalculator.calculate("23.6 234 -"));
        System.out.println(postfixCalculator.calculate("56 12 *"));
        System.out.println(postfixCalculator.calculate("3 4 /"));
        System.out.println(postfixCalculator.calculate("12 7 %"));

        //Invalid expression
        System.out.println(postfixCalculator.calculate("12 7 % %"));
    }
}