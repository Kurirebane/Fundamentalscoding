package Shopping;

import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to buy a Milk or Wine");
        String product = scanner.next();
        int age = 0;
        if (product.equals("Wine")) {
            System.out.println("How old are you?");
            age = scanner.nextInt();
        } if (product.equals("Milk")) {
                System.out.println("Milk costs 1.5 €");
        } else if (age >= 18)
            System.out.println("This Amarone will cost 40 € ");
            else
                System.out.println("Grow up and come back ");
        }
    }




