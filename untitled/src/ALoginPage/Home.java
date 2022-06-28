package ALoginPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

    private JFrame f;
    private ImageIcon icon;

    public Home() {

        // FONTS.
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 20);
        Font fon = new Font("Georgia", Font.BOLD, 20);
        Font labfont = new Font("Serif", Font.PLAIN, 15);
        Color lor = new Color(135,206,235);

        icon = new ImageIcon("C:\\icon\\medicine (10).png");
        setIconImage(icon.getImage());


        Border br = BorderFactory.createLineBorder(lor); // design border.
        Container co = new Container();
        // Panels.
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);

        // Panels properties.
        panel.setBackground(Color.WHITE);
        panel.setBounds(0,0,250,720);
        //Panel 2..
        panel2.setBackground(lor);
        panel2.setBounds(250,0,780,720);

        co.add(panel);
        co.add(panel2);

        panel2.setBorder(br);

        //Add labels.
        JLabel label = new JLabel(icon); //Insert icon into label. (hospital logo).
        label.setBounds(5,0,100,70);
        panel.add(label); //Add label to panel.

        JLabel label2 = new JLabel("NIIT Clinic");
        label2.setBounds(90,15,300,50);
        label2.setFont(font);
        label2.setForeground(lor);
        panel.add(label2);

        // Icons on buttons.
        ImageIcon home = new ImageIcon("C:\\icon\\home.png");
        setIconImage(home.getImage());

        ImageIcon bp = new ImageIcon("C:\\icon\\add2.png");
        setIconImage(bp.getImage());

        ImageIcon p = new ImageIcon("C:\\icon\\patient (2).png");
        setIconImage(p.getImage());

        ImageIcon s = new ImageIcon("C:\\icon\\customer-support.png");
        setIconImage(s.getImage());

        ImageIcon l = new ImageIcon("C:\\icon\\logout (1).png");
        setIconImage(l.getImage());

        JButton bt = new JButton(home);
        bt.setText(" Home                          ");
        bt.setFocusPainted(false);
        bt.setBounds(10,130,230,45);
        bt.setBackground(Color.WHITE);
        bt.setFont(fo);
        bt.setBorder(br);
        panel.add(bt);

        JButton bt1 = new JButton(bp);
        bt1.setText(" Book Appointment  ");
        bt1.setBounds(10,195,230,45);
        bt1.setBackground(Color.WHITE);
        bt1.setFont(fo);
        bt1.setBorder(br);
        panel.add(bt1);

        JButton bt2 = new JButton(p);
        bt2.setText(" Contact Doctor     ");
        bt2.setBounds(10,260,230,45);
        bt2.setBackground(Color.WHITE);
        bt2.setFont(fo);
//        bt2.setFocusPainted(false);
        bt2.setBorder(br);
        panel.add(bt2);

        JButton bt3 = new JButton(s);
        bt3.setText(" services                     ");
        bt3.setBounds(10,325,230,45);
        bt3.setBackground(Color.WHITE);
        bt3.setFont(fo);
        bt3.setBorder(br);
        panel.add(bt3);

        JButton bt4 = new JButton(l);
        bt4.setText(" Log Out                     ");
        bt4.setBounds(10,390,230,45);
        bt4.setBackground(Color.WHITE);
        bt4.setContentAreaFilled(false);
        bt4.setFocusPainted(false);
        bt4.setBorderPainted(false);
        bt4.setFont(fo);
        bt4.setBorder(br);
        panel.add(bt4);


        // Panels.
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel3.setLayout(null);
        panel4.setLayout(null);
        panel5.setLayout(null);


        // PANELS LABELS AND IMAGES.
        ImageIcon image1 = new ImageIcon("C:\\icon\\group (2).png");
        setIconImage(image1.getImage());

        ImageIcon image2 = new ImageIcon("C:\\icon\\medal.png");
        setIconImage(image1.getImage());

        ImageIcon image3 = new ImageIcon("C:\\icon\\shield.png");
        setIconImage(image1.getImage());

        // Panels properties.
        panel3.setBackground(Color.WHITE); //Panels
        panel3.setBounds(30,25,700,200);
        panel3.setBorder(br);
        panel2.add(panel3);

        JLabel panel3label = new JLabel(image1);
        panel3label.setBounds(-80,-10,300,200);
        panel3.add(panel3label);

        JLabel lab = new JLabel("Great user experience.");
        lab.setBounds(120,40,300,50);
        lab.setFont(fon);
        panel3.add(lab);

        JLabel lab1 = new JLabel("<html>Our focus is on you, and that’s exactly why we strive to deliver a delightful user<br> experience." +
                " Whether you need to streamline the management of bookings or appoint-<br>ments," +
                " you will find e-hospital extremely to use. Our intuitive dashboard will help you <br>set up your booking page quickly.</html>");
        lab1.setBounds(120,20,500,200);
        lab1.setFont(labfont);
        panel3.add(lab1);

        panel4.setBackground(Color.WHITE);
        panel4.setBounds(30,245,700,200); //Panels
        panel4.setBorder(br);
        panel2.add(panel4);

        JLabel panel4label = new JLabel(image2);
        panel4label.setBounds(-80,-10,300,200);
        panel4.add(panel4label);

        JLabel lab2 = new JLabel("<html>Give your customers a calendar, not a<br> list of time slots.");
        lab2.setBounds(115,-30,500,200);
        lab2.setFont(fon);
        panel4.add(lab2);

        JLabel lab22 = new JLabel("<html>Scheduling should not be made simple for you alone, but also for your customers.<br>" +
                "Allow customers to overlay their calendar so they don't have to switch between<br>apps and easily find mutual availability.</html>");
        lab22.setBounds(115,30,600,200);
        lab22.setFont(labfont);
        panel4.add(lab22);

        panel5.setBackground(Color.WHITE);
        panel5.setBounds(30,465,700,200); //Panels
        panel5.setBorder(br);
        panel2.add(panel5);

        JLabel panel5label = new JLabel(image3);
        panel5label.setBounds(-80,-10,300,200);
        panel5.add(panel5label);

        JLabel lab3 = new JLabel("Guaranteed privacy.");
        lab3.setBounds(115,35,300,50);
        lab3.setFont(fon);
        panel5.add(lab3);

        JLabel lab33 = new JLabel("<html>We value your privacy. We keep data retention to a minimum. In our efforts to <br> " +
                "increase your safety, we revoke our access to your connected integration once you <br>" +
                "decide to delete this integration and when deleting your account.");
        lab33.setBounds(115,70,600,80);
        lab33.setFont(labfont);
        panel5.add(lab33);

        JPanel pan = new JPanel();
        pan.setBounds(250,0,780,800);
        pan.setBackground(Color.pink);

        // ACTION LISTENERS.

        f = new JFrame();
        // Set logo in jframe title.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon); // Add Logo(icon).

        // Adding Container to JFrame.
        f.add(co);

        // Jframe properties.
        f.setTitle("NIIT CLINIC |  Home ");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(1030,720);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1030;
        int height = 720;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Book_Appointment();
                f.dispose();
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contact_Doctor();
                f.dispose();
            }
        });


        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Services obj = new Services();
               f.dispose();

            }
        });

        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Home();
    }
}


