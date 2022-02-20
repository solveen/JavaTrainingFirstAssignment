package Student;

public class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }
    public void stn() {
            if (name == null || name.isEmpty()) {
                System.out.println("Name of the Student is Unknown");
            } else {
                System.out.println("Name of the Student is " + name);
            }

        }

    }
