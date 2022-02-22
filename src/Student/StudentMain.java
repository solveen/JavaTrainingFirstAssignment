package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Solveen");
        Student student1 = new Student();
        System.out.println("The name of the student is " + student.name);
        System.out.println("The name of the student is " + student1.name);
    }
}
