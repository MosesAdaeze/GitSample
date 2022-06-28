import java.util.Scanner;

public class switchcase{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        switch (age){
            case 10:
                System.out.println("you are a child");
            break;
            case 18:
                System.out.println("you are a youth");
            break;
            case 30:
                System.out.println("you are already old");
            break;
            default:
                System.out.println("you are a human");
        }
    }
}
//case
//break
////default
//after setting case then default