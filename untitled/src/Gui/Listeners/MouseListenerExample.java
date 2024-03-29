package Gui.Listeners;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample(){
        setTitle("Mouse Listener");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Initial Text");
        add(label);
        setVisible(true);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseListenerExample run = new MouseListenerExample();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");

    }
}
