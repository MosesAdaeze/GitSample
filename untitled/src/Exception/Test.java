package Exception;

public class Test {
    public static void main(String[] args) {
        try {
            int Num = 0;
            int Num2 = 10;
            int result = Num2 / Num;

            System.out.println(result);
        } catch (Exception e ) {
            System.out.println("Cannot not be divided by 0.");
        }
    }
}
