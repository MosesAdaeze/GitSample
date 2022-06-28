package Array_Types;

import java.util.Scanner;

public class Input_in_3dimendionalArray {
    public static void main(String[] args) {
        int siblings;
        Scanner Input = new Scanner(System.in);
        System.out.println("Input how many siblings you have:");
        int length = Input.nextInt();

        int[] Age = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter age of each siblings: " + (i + 1));
            Age[i] = Input.nextInt();
        }
        System.out.println("Siblings Age is: ");
        for (int i = 0; i < length; i++) {
            System.out.println(Age[i]);
        }
    }
}
