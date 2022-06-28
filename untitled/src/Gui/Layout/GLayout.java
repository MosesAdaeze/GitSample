package Gui.Layout;

import javax.swing.*;
import java.awt.*;

public class GLayout extends JFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10, 10, 100, 100);
        f.setTitle("GridLayout");
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);

    }
}

//        panel = new JPanel (new (GLayout());

//        public GLayout()
//        {
//            Button btn1 = new Button("A");
//            Button btn2 = new Button("B");
//            Button btn3 = new Button("C");
//            Button btn4 = new Button("D");
//
//            add(btn1);
//            add(btn2);
//            add(btn3);
//            add(btn4);
//
//            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
//            setSize(300,300);
//            setVisible(true);
//
//        }
//
//        public static void main(String args[]){
//            GLayout box = new GLayout();
//        }
//}
