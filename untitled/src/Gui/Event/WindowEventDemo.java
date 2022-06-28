package Gui.Event;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventDemo extends WindowAdapter {
    JFrame jf;

    public WindowEventDemo(){
        jf = new JFrame("Window Event Demo");
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        //SOME CODE TO BE ADDED//
    }

    public void windowClosing(WindowEvent e){
        int n = JOptionPane.showConfirmDialog(jf, "Are you sure you want close this window" +
                        "You sure??, E get why",
                "Okay oh", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_OPTION){
            jf.dispose();
        }
    }

    public static void main(String[] args) {
        WindowEventDemo obj = new WindowEventDemo();
    }
}
