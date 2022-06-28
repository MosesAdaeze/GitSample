package Array_Types;

public class Niit {
    String student_name;
    int student_age;

    public Niit(String name, int age) {
        this.student_name = name;
        this.student_age = age;
    }

    public Niit(String name) {
        this.student_name = name;
    }

    public Niit() {

    }

    public void run() {
        System.out.println(student_name);
        System.out.println(student_age);
    }
}

//    public static void main(String[] args) {
////        Niit student = new Niit("Adaeze",19);
//          Niit student = new Niit("Eunice",17);
////        student.run();


