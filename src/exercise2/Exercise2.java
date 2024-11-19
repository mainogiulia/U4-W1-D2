package exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void switchMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number between 0 and 3");
        int num = scanner.nextInt();

        String digit = switch (num) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "The number is not valid";
        };
        System.out.println("The number is: " + digit);
    }

    public static void main(String[] args) {
        switchMethod();
    }
}

