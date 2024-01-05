import java.util.Scanner;

public class RegularCalculator {

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.println("Hey, how are you doing?");
        String response = calculator.nextLine();

        System.out.println("Awesome! Are you willing to perform some calculations? \n Yes or No.");
        String numbers = calculator.nextLine();

        if (numbers.equalsIgnoreCase("Yes")) {
            System.out.println("Alright, Let's begin!");

            System.out.println("Choose an operation: \n addition(+), multiplication(*), subtraction(-), division (/)");

            String sign = calculator.nextLine();

            if (sign.equals("+")) {
                System.out.println("first number");
                int num1 = calculator.nextInt();
                System.out.println("second number: ");
                int num2 = calculator.nextInt();

                int result = num1 + num2;

                System.out.println("Result:" + result);

            } else if (sign.equals("-")) {
                System.out.println("first number");
                int num1 = calculator.nextInt();
                System.out.println("second number: ");
                int num2 = calculator.nextInt();

                int result = num1 - num2;

                System.out.println("Result: " + result);

            } else if (sign.equals("*")) {
                System.out.println("first number");
                int num1 = calculator.nextInt();
                System.out.println("second number: ");
                int num2 = calculator.nextInt();

                int result = num1 * num2;

                System.out.println("Result: " + result);

            } else if (sign.equals("/")) {
                System.out.println("first number");
                int num1 = calculator.nextInt();
                System.out.println("second number: ");
                int num2 = calculator.nextInt();

                int result = num1 / num2;

                System.out.println("Result: " + result);
            }

        } else if (numbers.equalsIgnoreCase("No")) {
            System.out.println("Okay, see ya!");
        }

        calculator.close();
    }
}
