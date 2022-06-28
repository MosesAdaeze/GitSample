package AProject;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JFrame {
    JFrame f;

        TitleBar(){
             f =new JFrame();
//            Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine.png");
//            f.setIconImage(icon);

            f.setLayout(null);
            f.setTitle("e-Hospital");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBackground(Color.black);
            f.setSize(400,400);
            f.setVisible(true);
        }
        public static void main(String args[]){
            new TitleBar();
        }
}
