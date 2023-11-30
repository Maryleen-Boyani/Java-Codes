import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        int num;

        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of items: ");
        num = input.nextInt();
        double[] prices = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the price of item " + (i + 1));
            prices[i] = input.nextDouble();
            sum = sum + prices[i];
        }

        System.out.println("Sum: " + sum);

        double average = sum / (double) num;
        System.out.println(" The average: " + average);

        input.close();
    }
}
