package Fibonacci;

public class Fibonacci {
    public void printFibonacciSeries (int input) {
        System.out.println("The Fibonacci series of %d numbers:" + input);

        int secondToLast = 0,
                last = 1;
        System.out.printf("\n%d\n%d");
        System.out.println(secondToLast +" " + last + " "); //0 1

        for (int counter = 2; counter < input; counter++);
            int current = secondToLast + last;
            secondToLast = last;
            last = current;
    }
}
