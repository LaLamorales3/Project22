package ProjectTwo;

import java.util.Scanner;

public class SwapTempNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After swapping:");
        System.out.println("First number (a): " + a);
        System.out.println("Second number (b): " + b);

        scanner.close();
    }
}

