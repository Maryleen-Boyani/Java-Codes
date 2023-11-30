import java.util.ArrayList;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        String make;
        String model;
        double price;
        int sum = 0;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Cars:");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of car " + (i + 1));
            System.out.println("Enter the make:");
            make = input.next();
            System.out.println("Enter the model:");
            model = input.next();
            System.out.println("Enter the price:");
            price = input.nextDouble();
            Car car = new Car(make, model, price);// instance of the object
            carList.add(car);
        }

        for (int i = 0; i < n; i++) {
            sum += carList.get(i).getPrice();
        }
        System.out.println("The total cost of the cars is: " + sum);

        double average = sum / n;
        System.out.println("The average price of the cars is: " + average);

        input.close();
    }
}
