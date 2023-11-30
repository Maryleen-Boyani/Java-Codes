public class Functions {
    public static void main(String[] args) {
        int a = 89;// local variables
        int b = 45;
        int c = sum(a, b);
        System.out.println("Sum: " + c);
    }

    public static int sum(int a, int b) { // the int is for what we want to return....the a and b are only local to the
                                          // sum function. they aren't the same to what is up there
        int ans = a + b;
        return ans;
    }
}
