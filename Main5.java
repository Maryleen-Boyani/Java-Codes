import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Students> studentList = new ArrayList<Students>();
        Scanner myInput = new Scanner(System.in);
        String name;
        int age;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student " + (i + 1) + " details");
            System.out.println("Enter name:");
            name = myInput.next();
            System.out.println("Enter age:");
            age = myInput.nextInt();
            Students student = new Students(name, age);
            studentList.add(student);
        }

        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).getDetails();

        }
        for (int i = 0; i < studentList.size(); i++) {
            sum += studentList.get(i).getAge();
        }

        double averageAge = sum / studentList.size();

        System.out.println("The average age is :" + averageAge);
        myInput.close();

    }

}
