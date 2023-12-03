import java.util.Scanner;

public class GroupBasic {
    public static void main(String[] args) {
        String password = "Zenith";
        String username = "employee";
        String newPassword;
        int phone;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter username:");
        username = userInput.next();
        System.out.println("Enter password:");
        newPassword = userInput.next();

        if (username.compareTo(username) == 0 && password.compareTo(newPassword) == 0) {
            System.out.println("-------------------------------------------------------");
            System.out.println("       " + "Welcome to Zenith real Estate");
            System.out.println();
            Customer customer = new Customer();
            customer.getName();
            System.out.println("Enter phone number");
            phone = userInput.nextInt();
            customer.displayDetails();

        } else {
            System.out.println("Wrong password or username");
        }

        userInput.close();

    }

}