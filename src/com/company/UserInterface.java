package com.company;

import java.util.Scanner;

public class UserInterface implements AutoCloseable {

    public UserInterface ()  {
        scanner = new Scanner (System.in);
    }

    // needed for implementation of AutoCloseable
    public void close () {
        if (scanner != null)
            scanner.close ();
    }

    public Expression readExpression() {

        String arr[] = new String[3];
        System.out.println("Enter the first symbol...");
        arr[0] = scanner.nextLine();
        System.out.println("Enter the operation...");
        arr[1] = scanner.nextLine();
        System.out.println("Enter the second symbol...");
        arr[2] = scanner.nextLine();

        return new Expression(arr);
    }

    public void showValue(int value) {
        System.out.println("Result: " + value);
    }

    private Scanner scanner;
}
