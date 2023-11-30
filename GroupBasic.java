import java.util.Scanner;

public class GroupBasic {
    public static void main(String[] args) {
        String password = "Zenith";
        String newPassword;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password:");
        newPassword = input.next();
        if (newPassword.compareTo(password) == 0) {
            System.out.println("Correct password");
        }
    }
}
