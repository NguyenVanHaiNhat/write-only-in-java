public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        student.setName("nhat");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setClasses("H2O");
        System.out.println(student.getClasses());
    }
}