import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PostfixCalculator postfixCalculator = new PostfixCalculator();

        //Valid expressions
        System.out.println("Calculating postfix expressions: ");
        postfixCalculator.calculate("10.8 19.2 +");
        postfixCalculator.calculate("23.6 234 -");
        postfixCalculator.calculate("56 12 *");
        postfixCalculator.calculate("3 4 /");
        postfixCalculator.calculate("12 7 %");

        //Invalid expression
        postfixCalculator.calculate("12 7 % %");
        System.out.println();

        //Read file
        System.out.println("Calculating postfix expressions from file: ");
        File file = new File("src/postfix.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                postfixCalculator.calculate(scan.nextLine());
            }
        }
        catch (Exception e){
            System.out.println("File not found.");
        }

    }
}