package Gui.Layout;

import javax.swing.*;

public class Box extends JFrame {
    JButton red, blue, green;

    public Box() {

        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");

        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GridBagLayout");
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Box run = new Box();
    }

}
//    JFrame f;
//    Box(){
//        JButton b=new JButton("click");//create button
//
//        b.
//        b.setBounds(130,100,100, 40);
//
//        add(b);//adding button on frame
//        setSize(400,500);
//        setLayout(null);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new Box();
//    }
//}

