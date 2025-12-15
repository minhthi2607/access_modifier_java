package static_method;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Ravi");
        Student s3 = new Student(103, "Rajesh");

        s1.display();
        s2.display();
        s3.display();
    }
}
