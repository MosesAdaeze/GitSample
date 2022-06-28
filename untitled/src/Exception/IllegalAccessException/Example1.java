package Exception.IllegalAccessException;

public class Example1 {
    static void throw0ne() throws IllegalAccessException {
        System.out.println("Inside throw0ne ");
        throw new IllegalAccessException("Example1");
    }

    public static void main(String args[]) {
        try {
            throw0ne();
        } catch (IllegalAccessException e) {
            System.out.println("caught " + e);
        }
    }
}

