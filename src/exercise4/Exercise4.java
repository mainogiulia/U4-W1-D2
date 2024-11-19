package exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        System.out.println("Countdown:");
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        countdown();
    }
}