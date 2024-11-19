package exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void whileMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence, type :q to end the program");

        String string = "";

        while (!string.equals(":q")){
            string = scanner.nextLine();

            String sentence = String.join(",", string.split(""));
            System.out.println(sentence);

        }
    }

    public static void main(String[] args) {
        whileMethod();
    }
}
