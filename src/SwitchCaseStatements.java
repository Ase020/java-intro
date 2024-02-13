import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double numberOne = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double numberTwo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter operator sign: ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum" -> System.out.printf("%f + %f = %f", numberOne, numberTwo, numberTwo + numberOne);
            case "sub" -> System.out.printf("%f - %f = %f", numberOne, numberTwo, numberOne - numberTwo);
            case "mul" -> System.out.printf("%f * %f = %f", numberOne, numberTwo, numberOne * numberTwo);
            case "div" -> {
                if (numberTwo == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.printf("%f / %f = %f", numberOne, numberTwo, numberOne / numberTwo);
                }
            }
            default -> System.out.printf("%s is not a supported operator!", operation);
        }

        scanner.close();
    }
}
