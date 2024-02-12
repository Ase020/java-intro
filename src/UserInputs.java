import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String inputStr = scanner.nextLine();
        System.out.printf("Hello %s. How old are you? \n", inputStr);

        int age = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();

        System.out.printf("%d is an excellent age.",age );
        System.out.printf("%f", doubleNumber);

        scanner.close();
    }
}
