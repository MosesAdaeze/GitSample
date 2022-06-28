package Exception.NegativeArraySizeException;

public class Example1 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[1]);
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
            System.err.println("Cannot input negative number");
            //handle the exception
        } finally {
            System.out.println("continuing execution...");
        }
    }
}
