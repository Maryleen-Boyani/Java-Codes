public class MainStudent2 {
    public static void main(String[] args) {
        ForeignStudent foreignStudent = new ForeignStudent("Sarah", "A18230JSM");

        System.out.println("Name " + foreignStudent.studentName());

        NativeStudent nativeStudent = new NativeStudent("Boyani", "Nairobi");
        System.out.println("Name: " + nativeStudent.studentName());
    }
}