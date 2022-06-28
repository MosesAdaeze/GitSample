package Strings;

public class Example1 {
    public static void main(String[] args) {
    String Name = "Steve Joe";
    String Name2 = new String ("Steve Joe");

        System.out.println("First String " + Name);
        System.out.println("Second String " + Name2);

        String convert = Name2.intern();
        System.out.println(convert);

        // length()
        System.out.println(Name.length());
        System.out.println(Name.concat("Select" + Name2));
    }
}


