public class Asterisk {
    public static void main(String[] args) {
        System.out.println("Good Morning Maryleen!");
        for (int col = 1; col <= 5; col++) {
            for (int row = 1; row <= col; row++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}