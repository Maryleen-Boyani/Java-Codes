import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "Maryleen";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your password:");
        String newPassword = userInput.next();
        if (newPassword.compareTo(password) == 0) {
            System.out.println("Correct password");
            double radius, height;
            double capacity;
            System.out.println("Enter the radius in meters:");
            radius = userInput.nextInt();
            System.out.println("Enter the height in meters:");
            height = userInput.nextInt();
            capacity = radius * radius * height * (22 / 7);
            double capacityLitres = capacity * (1000);
            System.out.println("The capacity in meters is " + capacity);
            System.out.println("The capacity in litres is " + capacityLitres);
        } else {
            System.out.println("Incorrect password, your password has " + password.length() + " characters");

        }

        userInput.close();

    }
}
