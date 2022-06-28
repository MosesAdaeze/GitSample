package Gui.Layout;

import javax.swing.*;
import java.awt.*;

public class Borderlayout extends JFrame {
    JButton reset, add, update, delete, insert;

    public Borderlayout() {
        // created object of each button component
        reset = new JButton("Reset");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        insert = new JButton("Insert");

        //calling the JFrame properties
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);  //set the location to center
        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the JFrame x button is clicked

        //set Layout
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        //add each component to the frame
        add(add,BorderLayout.NORTH);
        add(reset,BorderLayout.EAST);
        add(update,BorderLayout.WEST);
        add(delete,BorderLayout.SOUTH);
        add(insert,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Borderlayout run = new Borderlayout();
    }
}