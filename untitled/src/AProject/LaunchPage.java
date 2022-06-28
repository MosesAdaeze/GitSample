package AProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage extends JFrame {

    private JFrame f;
    private ImageIcon icon;
    private JLabel label;
    private JButton button;

    public LaunchPage(){

        icon = new ImageIcon("C:\\icon\\lauch.jpg");
        setIconImage(icon.getImage());
        label = new JLabel(icon);
        label.setSize(600, 400);

        Font fo = new Font("Serif", Font.BOLD, 18);
        Font font = new Font("Arial", Font.ITALIC | Font.BOLD, 15);
        Color color = new Color(	255,255,255);
        Color c = new Color(51,204,255);

        button = new JButton("TAP");
        button.setFont(fo);
        button.setBounds(270,325,95,25);
        button.setBackground(c);
        button.setForeground(color);
        label.add(button);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.dispose();
                new LoginFont();
            }
        });

        f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon);
        label.add(button);

        f.setDefaultCloseOperation(f.HIDE_ON_CLOSE);
        f.getContentPane().add(button);

        f.add(label);
        f.setLayout(null);
        f.setTitle("e-HOSPITAL");
        f.setDefaultLookAndFeelDecorated(true);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setSize(600,400);
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 600;
        int height = 400;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setUndecorated(true);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        LaunchPage page = new LaunchPage();
    }
}







//class Second {
//    private JFrame f = new JFrame("Second");
//
//    public Second() {
//
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(600,405);
//        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
//        int width = 600;
//        int height = 405;
//        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
//        f.setVisible(true);
//    }

