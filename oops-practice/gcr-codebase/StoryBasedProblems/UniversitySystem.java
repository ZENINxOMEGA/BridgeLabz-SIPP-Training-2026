class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nAge : " + age;
    }
}

class Student extends Person {

    final int studentId;
    protected double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nStudent ID : " + studentId
                + "\nGPA : " + gpa;
    }
}

class GradStudent extends Student {

    private String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nThesis : " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        Person person = new Person("Rahul", 45);

        Student student = new Student(
                "Priya",
                20,
                101,
                8.7);

        GradStudent gradStudent = new GradStudent(
                "Aman",
                24,
                201,
                9.2,
                "Artificial Intelligence");

        System.out.println("Person Details");
        System.out.println(person);

        System.out.println("\nStudent Details");
        System.out.println(student);

        System.out.println("\nGraduate Student Details");
        System.out.println(gradStudent);

        System.out.println("\nIS-A Relationship");

        if (gradStudent instanceof Student) {
            System.out.println("GradStudent IS-A Student");
        }

        if (gradStudent instanceof Person) {
            System.out.println("GradStudent IS-A Person");
        }
    }
}