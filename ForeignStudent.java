public class ForeignStudent extends Student2 {

    private String passport;

    public ForeignStudent(String name, String passport) {
        super(name);
        this.passport = passport;
    }

    void displayPassport() {
        System.out.println("Passport: " + passport);
    }

}
