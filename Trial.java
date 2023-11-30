import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        String password = "Maryleen";
        String newPassword;
        double radius;
        double height;
        double capacity;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your password:");
        newPassword = userInput.next();

        if (newPassword.compareTo(password) == 0) {
            System.out.println("You're in");
            System.out.println("Enter the radius in meters:");
            radius = userInput.nextDouble();
            System.out.println("Enter the height in meters:");
            height = userInput.nextDouble();

            capacity = (radius * radius * (3.14));
            double capacityLitres = capacity * 1000;
            System.out.println("Capacity: " + capacity);
            System.out.println("Capacity in litres: " + capacityLitres);

        } else {
            System.out.println("Incorrect password, you can't use the system");
        }
        userInput.close();
    }
}