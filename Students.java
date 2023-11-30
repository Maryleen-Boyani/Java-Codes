public class Students {
    private String name;
    private int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    void getDetails() {
        System.out.println("Student name " + name);
        System.out.println("Student age " + age);
    }

}
