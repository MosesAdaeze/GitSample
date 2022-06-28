package Gui.Layout;

import javax.swing.*;
import java.awt.*;

public class Flowlayout extends JFrame {
    JButton add, update, delete;

    public Flowlayout(){
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");

        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        add(add);
        add(update);
        add(delete);


        setVisible(true);
        setSize(200,200);
        setTitle("FlowLayout");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Flowlayout run = new Flowlayout();
    }
}
