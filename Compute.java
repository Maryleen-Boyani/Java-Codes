import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {

        int num;
        double price;
        double sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Value of " + i);
            price = input.nextDouble();
        }
        for (int i = 1; i <= num; i++) {

        }

        input.close();
    }

}
