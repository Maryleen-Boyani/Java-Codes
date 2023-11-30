import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = input.nextDouble();
        System.out.println("Double: " + ans(num));
        input.close();
    }

    public static double ans(double a) {
        double result = a * 2;
        return result;
    }

}
