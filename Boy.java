public class Boy extends Human {
    private String gender;

    public Boy(String name, String gender) {
        super(name);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
