package exercise1;

public class Exercise1 {

    public static boolean pariDispari(String string) {
        if (string.length() % 2 == 0) {
            System.out.println("The number of characters in " + string + " is even.");
            return true;
        } else {
            System.out.println("The number of characters in " + string + " is even.");
            return false;

        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
            return true;
        } else {
            System.out.println("The year " + year + " is not a leap year.");
            return false;
        }
    }

    public static void main(String[] args) {
        pariDispari("supercalifragi");
        annoBisestile(2024);
    }
}

