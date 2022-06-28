package AProject;

import ALoginPage.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class ExampleTimer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                display();
            }
        });
    }

    private static void display() throws HeadlessException {
        JFrame frame = new JFrame("Application Name");
        JButton firewallButton = new JButton("Firewall");
        JButton networkButton = new JButton("Network");
        JButton printerButton = new JButton("Printer");

        //iconPanel settings
        Box iconPanel = new Box(BoxLayout.Y_AXIS);
        iconPanel.add(firewallButton);
        iconPanel.add(networkButton);
        iconPanel.add(printerButton);
        iconPanel.setBackground(Color.gray);
        iconPanel.setVisible(true);
        frame.add(iconPanel, BorderLayout.WEST);

        //grid setting
        JPanel grid = new JPanel() {

            @Override
            // arbitrary placeholder size
            public Dimension getPreferredSize() {
                return new Dimension(320, 230);
            }
        };
        grid.setBackground(Color.red);
        frame.add(grid, BorderLayout.CENTER);

        //frame setting
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
//
//    private static JPanel createPanel() {
//        JPanel panel = new JPanel();
//        final JLabel label = new JLabel(new Date().toString());
//        panel.add(label);/* w w    w . d    em  o    2 s   .c    om  */
//        panel.addAncestorListener(new AncestorListener() {
//            @Override
//            public void ancestorAdded(AncestorEvent event) {
//                // start animation
//                label.setText(new Date().toString());
//            }
//
//            @Override
//            public void ancestorRemoved(AncestorEvent event) {
//                // stop animation
//            }
//
//            @Override
//            public void ancestorMoved(AncestorEvent event) {
//            }
//        });
//        return panel;
//    }
//
//    public static void main(String[] args) {
//        JFrame f = new JFrame();
//        final JTabbedPane jtp = new JTabbedPane();
//        jtp.add("One", createPanel());
//        jtp.add("Two", createPanel());
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.add(jtp);
//        f.pack();
//        f.setVisible(true);
//    }

//    private JFrame frame = new JFrame();
//    private JLabel label;
//
//    public ExampleTimer() {
//
//        label = new JLabel();
//        label.setText("link");
//
//        label.addAncestorListener(this);
//
//
//        frame.add(label);
//        frame.setSize(550, 300);
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setExtendedState(JFrame.ICONIFIED);
//        Timer tm = new Timer(2000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                java.awt.EventQueue.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        frame.dispose();
////                        frame.setExtendedState(JFrame.NORMAL);
//                        new Home();
//                    }
//                });
//            }
//        });
//        tm.setRepeats(false);
//        tm.start();
//    }

