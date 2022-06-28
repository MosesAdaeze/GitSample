package Array_Types;

// ASSIGNMENT
// Create a 3dimensional array and sum it up.
// Create an array that allows user to input values using scanner class.
//                               SOLUTION 1
public class Sum_3dimensional_array {
    public static void main(String[] args) {
        int Row[][][] =
                Row = new int[2][3][2];
        Row[0][0][0] = 18;
        Row[0][1][0] = 13;
        Row[0][1][1] = 19;
        Row[0][2][0] = 16;
        Row[0][2][1] = 12;
        Row[1][0][0] = 19;
        Row[1][0][1] = 18;
        Row[1][1][0] = 17;
        Row[1][1][1] = 14;
        Row[1][2][0] = 15;
        Row[1][2][1] = 18;
        int sum = 0;
        for (int i = 0; i < Row.length; i++) {
            for (int j = 0; j < Row[i].length; j++) {
                for (int k = 0; k < Row[i][j].length; k++) {
                    System.out.print(Row[i][j][k] + " ");
                }
                System.out.println();
//        int lengthofROw = Row.length;
//        for(int i=0; i<lengthofROw; i++) {
//        System.out.println(Row[i]);

            }
        }
    }
}

