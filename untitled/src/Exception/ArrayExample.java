package Exception;

public class ArrayExample {
    public static void main(String[] args) {
        try {
            int[] Numbers = new int[5];
            Numbers[0] = 1;
            Numbers[1] = 2;
            Numbers[2] = 7;
            Numbers[3] = 9;
            Numbers[4] = 5;
            System.out.println(Numbers[6]);
        }catch (Exception e){
            System.out.println("There is no index 6");
        }
    }
}
