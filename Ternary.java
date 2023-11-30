import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        number = input.nextDouble();
        number = number > 50 ? number * 2 : number / 2;
        System.out.println(number);
        input.close();
    }

}
