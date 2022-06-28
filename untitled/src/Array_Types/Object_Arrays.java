package Array_Types;

public class Object_Arrays {
    public static void main(String[] args) {
        Niit[] student = new Niit[3];
        student[0] = new Niit("John", 15);
        student[1] = new Niit("Peter", 20);
        student[2] = new Niit("Felix", 19);
        for ( Niit i : student) {
            System.out.println(i.student_name);
            System.out.println(i.student_age);
        }


    }
}

// NEXT CLASS
// enoms and strings

// ASSIGNMENT
// Create a 3dimensional array and sum it up.
// Create an array that allows user to input values using scanner class.
//                               SOLUTION 1