package Array_Types;

//import java.util.Arrays;

public class one_dimensional_array {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for(int i: numbers) {
            System.out.println(i);
        }

    }
}

// arrays start from index [0]
// ASSIGNMENT
//        int[] classes = new int[3];
//        classes[0] = 50;
//        classes[1] = 190;
//        classes[2] = 36;
//        {
//            System.out.println(classes[2]);
//
//            int[] classes1 = new int[3];
//            classes1[0] = 50;
//            classes1[1] = 190;
//            classes1[2] = 360;
//            {
//                System.out.println(classes.equals(classes1));
//            }
////        System.out.println(classes == classes1);
//        }}


// data_type[] array_name = new data_type[20]; TakeNote the [20] is the amount of data in an array
// and can't be change.