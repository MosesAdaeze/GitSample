package Exception.NumberFormalException;

public class Example1 {
    private static final String inputString = "123.33";
        public static void main(String[] args) {
            try {
                int a = Integer.parseInt(inputString);
            }catch(NumberFormatException e){
                System.out.println("Invalid string in argument");
                //request for well-formatted string
            }finally{
                System.out.println("continuing...");
            }
        }
}

