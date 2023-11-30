import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        double r;
        Circle c = new Circle();
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        r = myInput.nextDouble();
        c.getRadius(r);
        System.out.println("The area is " + c.computeArea());
        myInput.close();
    }
}
