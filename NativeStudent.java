public class NativeStudent extends Student2 {
    private String county;

    public NativeStudent(String name, String county) {
        super(name);
        this.county = county;
    }

    void displayCounty() {
        System.out.println("County: " + county);

    }
}
