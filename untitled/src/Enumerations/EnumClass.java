package Enumerations;

public enum EnumClass {
    //using weeks
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

    void run() {
        switch (this) {
            case MONDAY:
                System.out.println("No java class");
                break;
            case TUESDAY:
                System.out.println("First java class of the week");
                break;
            case WEDNESDAY:
                System.out.println("Assignment from java class");
                break;
            case THURSDAY:
                System.out.println("Second java class of the week");
                break;
            default:
                System.out.println("please, give us many assignment for the weekend.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumClass.MONDAY.run();
        System.out.println(EnumClass.MONDAY.hashCode());
        System.out.println(EnumClass.MONDAY.compareTo(EnumClass.TUESDAY));
    }
}
