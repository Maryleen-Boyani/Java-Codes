import java.util.NoSuchElementException;
import java.util.Scanner;

public class Customer {
    private String firstname;
    private String lastname;
    private int phone;

    Customer() {
    }

    public Customer(String firstname, String lastname, int phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    public void getName() {
        System.out.println("Enter customers first name:");
        Scanner sc = new Scanner(System.in);
        firstname = sc.next();
        System.out.println("Enter customers last name: ");
        lastname = sc.next();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Names: " + firstname + " " + lastname);
        System.out.println("Phone: " + phone);
    }
}