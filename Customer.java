import java.util.NoSuchElementException;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    private String firstname;
    private String lastname;
    private int phone;
    private String address;

    public Customer() {
    }

    /**
     * public Customer(String firstname, String lastname, int phone) {
     * this.firstname = firstname;
     * this.lastname = lastname;
     * this.phone = phone;
     * }
     */

    public void getInfo() {
        System.out.println("Enter customers first name:");
        firstname = sc.next();
        System.out.println("Enter customers last name: ");
        lastname = sc.next();
        System.out.println("Enter phone number");
        phone = sc.nextInt();
        System.out.println("Enter your home address(i.e. P. O. Box 17, Daystar University 90145, Athi-River )");
        address = sc.next();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Names: " + firstname + " " + lastname);
        System.out.println("Phone: +254" + phone);
        System.out.println("Address: " + address);
    }
}