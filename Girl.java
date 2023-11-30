public class Girl extends Human {

    private String course;

    public Girl(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
