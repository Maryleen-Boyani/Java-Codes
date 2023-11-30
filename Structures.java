import java.util.Scanner;

public class Structures {
    public static void main(Human[] args) {
        double mark;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Mark:");
        mark = myInput.nextDouble();

        if (mark >= 95)
            System.out.println("A");
        if (mark >= 80)
            System.out.println("A");
        if (mark >= 70)
            System.out.println("A");
        if (mark >= 60)
            System.out.println("A");
        if (mark > 95)
            System.out.println("A");
        myInput.close();
    }

}
