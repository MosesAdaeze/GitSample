public class ifstatement {
    public static void main(String[] args) {
        int age = 15;
        String name = "john";
        if (age == 15) {
            System.out.println("under 18 can not rid a car");
        }
        if (name == "john"&& age == 15) {
            System.out.println("true");
        }
        if (name == "john"|| age == 15) {
            System.out.println("correct");
        }
    }
}
