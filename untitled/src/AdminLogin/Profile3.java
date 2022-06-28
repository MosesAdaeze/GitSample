package AdminLogin;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile3 extends JFrame {

    private JFrame f;

    public Profile3(){

        Font fon = new Font("Georgia", Font.BOLD, 16);
        Font fo = new Font("Georgia", Font.PLAIN, 15);
        Border br = BorderFactory.createLineBorder(Color.BLACK);

        Container co = new Container();

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0,0,380,30);

        ImageIcon cancel = new ImageIcon("C:\\icon\\cancel (2).png");
        setIconImage(cancel.getImage());

        JButton bcancel = new JButton(cancel);
        bcancel.setBounds(310,-20,80,70);
        bcancel.setContentAreaFilled(false);
        bcancel.setFocusPainted(false);
        bcancel.setBorderPainted(false);
        panel.add(bcancel);

        bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setBorder(br);
        panel2.setBounds(0,30,380,230);

        JLabel label = new JLabel("<html>Dr. Stanley Tucci.</html>");
        label.setBounds(120,-5,300,50);
        label.setFont(fon);
        panel2.add(label);

        // LIST OF SOCIALS.

        // IMAGE ICONS.
        ImageIcon email = new ImageIcon("C:\\icon\\gmail.png");
        setIconImage(email.getImage());

        ImageIcon inst = new ImageIcon("C:\\icon\\instagram.png");
        setIconImage(inst.getImage());

        ImageIcon twi = new ImageIcon("C:\\icon\\twitter.png");
        setIconImage(twi.getImage());

        ImageIcon ph = new ImageIcon("C:\\icon\\telephone.png");
        setIconImage(ph.getImage());

        // PROPERTICES.
        JLabel label1 = new JLabel(email);
        label1.setText("   tucci81stanley@gmail.com.");
        label1.setBounds(15,30,300,50);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label1.setFont(fo);
        panel2.add(label1);

        JLabel label2 = new JLabel(inst);
        label2.setText("   Stanley_tucci.");
        label2.setBounds(-35,75,300,50);
        label2.setFont(fo);
        panel2.add(label2);

        JLabel label3 = new JLabel(twi);
        label3.setText("   TucciBerly.");
        label3.setBounds(-35,120,300,50);
        label3.setFont(fo);
        panel2.add(label3);

        JLabel label4 = new JLabel(ph);
        label4.setText("   08122489517.");
        label4.setBounds(-35,160,300,50);
        label4.setFont(fo);
        panel2.add(label4);

        panel.setLayout(null);
        panel2.setLayout(null);

        co.add(panel);
        co.add(panel2);

        f = new JFrame();
        // Set logo in jframe title.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon); // Add Logo(icon).

        f.add(co);

        // Jframe properties.
        f.setTitle("NIIT CLINIC |  Book Appointment. ");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(380,260);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 380;
        int height = 260;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setUndecorated(true);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Profile3();
    }
}
