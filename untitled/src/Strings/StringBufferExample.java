package Strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("John Doe");

        int namelength = name.length();
        int nameCapacity = name.capacity();

        System.out.println("Length of string: " + namelength);
        System.out.println("Capacity of string: " + nameCapacity);
        System.out.println(name.append(" is a Java Developer"));

        name.append("lo");

        System.out.println("Capacity: "  + name.capacity());
        System.out.println("Length: " + name.length());

        namelength = name.length();
        nameCapacity = name.capacity();

        System.out.println("New Length: " + namelength);
        System.out.println("New Capacity: " + name.capacity());
    }
}
