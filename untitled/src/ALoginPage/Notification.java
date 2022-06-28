package ALoginPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notification extends JFrame {

    private JFrame f;
    private JLabel label1, label2;

    public Notification(){
        Font fon = new Font("Georgia", Font.PLAIN, 16);
        Font h = new Font("Georgia", Font.PLAIN, 20);
        Color lor = new Color(135,206,235);

        Border br = BorderFactory.createLineBorder(lor);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(br);
        panel.setBounds(0,0,450,40);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(0,30,450,200);

        ImageIcon cancel = new ImageIcon("C:\\icon\\cancel.png");
        setIconImage(cancel.getImage());

        JButton bcancel = new JButton(cancel);
        bcancel.setBounds(0,-30,80,70);
        bcancel.setContentAreaFilled(false);
        bcancel.setFocusPainted(false);
        bcancel.setBorderPainted(false);
        panel.add(bcancel);

        ImageIcon noti = new ImageIcon("C:\\icon\\ratings.png");
        setIconImage(noti.getImage());

        JLabel lb = new JLabel(noti);
        lb.setBounds(20,50,60,50);
        panel2.add(lb);

        label1 = new JLabel("<html>Your Appointment have being booked successfully<br> with:</html>");
        label1.setBounds(95,60,410,50);
        label1.setFont(fon);
        panel2.add(label1);

        ImageIcon pimage = new ImageIcon("C:\\icon\\profile-modified1.jpg");
        setIconImage(pimage.getImage());

        JLabel profile = new JLabel(pimage);
        profile.setBounds(30,110,100,100);
        panel2.add(profile);

        label2 = new JLabel("<html>Dr Lisa Marshmallow.</html>");
        label2.setBounds(120,130,300,50);
        label2.setFont(h);
        panel2.add(label2);

        bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        Timer tm = new Timer(9000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        f.dispose();
                    }
                });
            }
        });
        tm.setRepeats(false);
        tm.start();


        f = new JFrame();
        // Set logo in jframe title.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon); // Add Logo(icon).

        f.add(panel);
        f.add(panel2);

        // Jframe properties.
        f.setTitle("NIIT CLINIC |  Book Appointment. ");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(450,200);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 450;
        int height = 200;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setUndecorated(true);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new Notification();
    }

}

