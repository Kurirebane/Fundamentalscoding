package Tasks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = scanner.nextFloat();
        System.out.print("Enter an operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        number2 = scanner.nextFloat();

        float output;

        switch (operator) {
            case '+' -> output = number1 + number2;
            case '-' -> output = number1 - number2;
            case '*' -> output = number1 * number2;
            case '/' -> output = number1 / number2;
            default -> {
                System.out.printf("Cannot calculate");
                return;
            }
        }
            System.out.println(number1 + " " + operator + " " + number2 + ": " + output);}
}


