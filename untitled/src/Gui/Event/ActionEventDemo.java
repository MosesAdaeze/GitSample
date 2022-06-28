package Gui.Event;

import Gui.Basic.Jlabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventDemo extends JFrame implements ActionListener {

    JButton click;
    JPanel panel;
    JLabel message;

    public ActionEventDemo(){
        super("Action Event Demo");
        click = new JButton("Click");
        panel = new JPanel();
        message = new JLabel();

        add(panel);
        panel.add(click);
        panel.add(message);

        setSize(300,300);
        setVisible(true);

        // SOME CODE TO BE ADDED//
    }
    public void actionPerformed(ActionEvent e) {
        message.setText ("Welcome to Event Handling in java");
    }

    public static void main(String[] args) {
        ActionEventDemo obj = new ActionEventDemo();
    }
}
