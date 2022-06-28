package AProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class StartUp extends JFrame implements ActionListener {

    StartUp() {
        setTitle("STARTUP");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private final Action exitAction = new AbstractAction("Exit") {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
    private final Action minimizeAction = new AbstractAction("Minimize") {
        @Override
        public void actionPerformed(ActionEvent e) {
            setState(JFrame.ICONIFIED);
        }
    };

    private final Action maximizeAction = new AbstractAction("Maximize") {
        @Override
        public void actionPerformed(ActionEvent e) {
            setState(JFrame.ICONIFIED);
        }
    };

    JButton closeButton = new JButton(exitAction);
    JButton miniButton = new JButton(minimizeAction);
    JButton maxiButton = new JButton(maximizeAction);

//    public static void main(String[] args){
//        new StartUp();
//    }
}

