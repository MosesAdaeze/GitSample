package Exception.UserDefinedException;

public class AgeValidation extends RuntimeException {
    public AgeValidation(){
        System.out.println("Invalid Age Entered");
        System.out.println("Only age greater than zero can be entered");
    }
}
