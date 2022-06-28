package Inheritance;

public class Bicycle {
    int Gear;
    int Speed;

    public Bicycle(int Gear, int Speed) {
        this.Gear = Gear;
        this.Speed = Speed;
    }

    public void supplyBrakes(int dec) {
        Speed -= dec;
    }

    public void speedup(int incre) {
        Speed -= incre;
    }
}
    //    public static void main(String[] args) {
//        Bicycle run = new Bicycle(Gear 2,Speed 5);
//        System.out.println(run.Gear);
//    }


