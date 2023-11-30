import java.util.Scanner;

public class Continue {
    public static void arrays() {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values:");
        for (int index = 0; index < 4; index++) {
            System.out.println("Value " + (index));
            numbers[index] = input.nextInt();
        }
        input.close();
    }

    public static void array() {
        int size;
        double sum = 0.0;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        size = input.nextInt();
        double[] prices = new double[size];
        System.out.println("Enter the item prices:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Price of item " + (i + 1));
            prices[i] = input.nextDouble();
            sum = sum + prices[i];

        }
        avg = sum / prices.length;
        for (int i = 0; i < prices.length; i++) {
            prices[i] = 1.16 * prices[i];
        }
        System.out.println("Sum " + sum);
        System.out.println("Avg " + avg);
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        input.close();

    }

    public static void main(String[] args) {
        for (int m = 5; m < 10; m++) {
            if (m == 7) {
                continue;
            }
            System.out.print(m);
        }
        System.out.println();
        array();
        // arrays();

    }

}
