public class Nested {
    public static void loops() {
        int num = 0;
        while (num < 100) {
            num += 2;
            System.out.println(num);
        }
    }

    public static void exp() {
        int j = 0;
        while (j <= 300) {
            j = j + 9;
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            System.out.print("\n");
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
        }
        loops();
        exp();
    }

}
