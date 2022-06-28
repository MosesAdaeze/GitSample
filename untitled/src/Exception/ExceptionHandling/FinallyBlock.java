package Exception.ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int data = 55 / 0;
            System.out.println(data);
        }
        catch (ArithmeticException e ) {
           e.printStackTrace();
        }
        finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("Remaining code");
    }
}
