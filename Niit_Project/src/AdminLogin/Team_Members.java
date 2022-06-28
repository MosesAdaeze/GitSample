package AdminLogin;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Team_Members extends JFrame {

    private JFrame f;
    private ImageIcon icon1;

    Team_Members(){

        // FONTS.
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 30);
        Font fon = new Font("Georgia", Font.BOLD, 16);
        Font h = new Font("Georgia", Font.PLAIN, 15);
        Font wfont = new Font("Perpetua Titling MT", Font.PLAIN, 15);
        Font labfont = new Font("Serif", Font.PLAIN, 15);
        Color lor = new Color(135,206,235);

        icon1 = new ImageIcon("C:\\icon\\medicine (10).png");
        setIconImage(icon1.getImage());


        Border br = BorderFactory.createLineBorder(lor); // design border.
        Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);


        Container co = new Container();
        // Panels.
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);
        panel3.setLayout(null);

        // Panels properties.
        panel.setBackground(lor);
        panel.setBounds(0,0,250,720);

        //panel 3.
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(250,0,780,720);

        co.add(panel);
        co.add(panel3);

//        panel2.setBorder(br);

//        Add labels.
        JLabel label = new JLabel(icon1); //Insert icon into label. (hospital logo).
        label.setBounds(5,0,100,70);
        panel.add(label); //Add label to panel.

        JLabel label2 = new JLabel("NIIT Clinic");
        label2.setBounds(90,15,300,50);
        label2.setFont(fo);
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        // Icons on buttons.
        ImageIcon home = new ImageIcon("C:\\icon\\four-dots (1).png");
        setIconImage(home.getImage());

        ImageIcon bp = new ImageIcon("C:\\icon\\teamwork.png");
        setIconImage(bp.getImage());

        ImageIcon p = new ImageIcon("C:\\icon\\logout.png");
        setIconImage(p.getImage());

        JButton bt = new JButton(home);
        bt.setText(" Home                    ");
        bt.setFocusPainted(false);
        bt.setBounds(20,130,220,45);
        bt.setBackground(Color.WHITE);
        bt.setForeground(Color.WHITE);
        bt.setContentAreaFilled(false);
        bt.setFocusPainted(false);
        bt.setBorderPainted(false);
        bt.setFont(fo);
        bt.setBorder(br);
        panel.add(bt);

        JButton bt1 = new JButton(bp);
        bt1.setText(" Team Members             ");
        bt1.setFocusPainted(false);
        bt1.setBounds(20,188,250,47);
        bt1.setBackground(Color.WHITE);
        bt1.setFont(fo);
        bt1.setBorder(br);
        panel.add(bt1);

        JButton bt2 = new JButton(p);
        bt2.setText(" Log out                ");
        bt2.setBounds(20,250,220,45);
        bt2.setBackground(Color.WHITE);
        bt2.setContentAreaFilled(false);
        bt2.setFocusPainted(false);
        bt2.setBorderPainted(false);
        bt2.setFont(fo);
        bt2.setForeground(Color.WHITE);
        bt2.setBorder(br);
        panel.add(bt2);


        // PROFILE.
        ImageIcon pimage = new ImageIcon("C:\\icon\\profile-modified.png");
        setIconImage(pimage.getImage());

        JLabel profile = new JLabel(pimage);
        profile.setBounds(75,500,80,70);


        JButton pname = new JButton("Lisa Marshmello");
        pname.setBounds(20,570,200,50);
        pname.setContentAreaFilled(false);
        pname.setFocusPainted(false);
        pname.setBorderPainted(false);
        pname.setFont(fo);
        pname.setForeground(Color.WHITE);

        panel.add(profile);
        panel.add(pname);


        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminHome();
                f.dispose();
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                f.dispose();
            }
        });

        // PANEL 3

        // tpanel.
        ImageIcon image1 = new ImageIcon("C:\\icon\\profile.jpg");
        image1.setImage(image1.getImage());

        JPanel tpanel = new JPanel();
        tpanel.setLayout(null);
        tpanel.setBounds(15,10,230,310);
        panel3.add(tpanel);

        JLabel limage1 = new JLabel(image1);
        limage1.setBounds(0,0,250,166);
        tpanel.add(limage1);

        JLabel lab = new JLabel("Dr. Lisa Marshmello");
        lab.setBounds(5,170,300,50);
        lab.setFont(fon);
        tpanel.add(lab);

        JLabel lab1 = new JLabel("<html>Principal Director & Head of<br> Department - Orthopaedics & Joint<br>Replacement Surgery</html>");
        lab1.setBounds(5,190,500,100);
        lab1.setFont(labfont);
        tpanel.add(lab1);
        //end.

        // tpanel1.
        ImageIcon image2 = new ImageIcon("C:\\icon\\p-file (3).jpg");
        image2.setImage(image2.getImage());

        JPanel tpanel1 = new JPanel();
        tpanel1.setLayout(null);
        tpanel1.setBounds(265,10,230,310);
        panel3.add(tpanel1);

        JLabel limage2 = new JLabel(image2);
        limage2.setBounds(0,0,250,166);
        limage2.setFont(h);
        tpanel1.add(limage2);

        JButton lab2 = new JButton("Dr. Hayley Atwell");
        lab2.setBounds(-75,170,300,50);
        lab2.setContentAreaFilled(false);
        lab2.setFocusPainted(false);
        lab2.setBorderPainted(false);
        lab2.setFont(fon);
        tpanel1.add(lab2);

        lab2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new profile();
            }
        });

        JLabel lab3 = new JLabel("<html>Head - Endocrinology & Diabetes<br>Endocrinology & Diabetes</html>");
        lab3.setBounds(5,190,500,100);
        lab3.setFont(labfont);
        tpanel1.add(lab3);
        // end.

        // tpanel2
        ImageIcon image3 = new ImageIcon("C:\\icon\\p-file (1).jpg");
        image3.setImage(image3.getImage());

        JPanel tpanel2 = new JPanel();
        tpanel2.setLayout(null);
        tpanel2.setBounds(510,10,230,310);
        panel3.add(tpanel2);

        JLabel limage3 = new JLabel(image3);
        limage3.setBounds(0,0,250,166);
        tpanel2.add(limage3);

        JButton lab4 = new JButton("Dr.   Bradley Whitford");
        lab4.setBounds(-55,170,300,50);
        lab4.setContentAreaFilled(false);
        lab4.setFocusPainted(false);
        lab4.setBorderPainted(false);
        lab4.setFont(fon);
        tpanel2.add(lab4);

        lab4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Profile1();
            }
        });

        JLabel lab5 = new JLabel("<html>Chairman - Cardiac Sciences<br>Cardiac Sciences, Cardiology</html>");
        lab5.setBounds(5,190,500,100);
        lab5.setFont(labfont);
        tpanel2.add(lab5);
        // end.


        // tpanel3
        ImageIcon image4 = new ImageIcon("C:\\icon\\picture2.jpg");
        image1.setImage(image1.getImage());

        JPanel tpanel3 = new JPanel();
        tpanel3.setLayout(null);
        tpanel3.setBounds(15,350,230,310);
        panel3.add(tpanel3);

        JLabel limage4 = new JLabel(image4);
        limage4.setBounds(0,0,250,166);
        tpanel3.add(limage4);

        JButton lab6 = new JButton("Dr. John Flynn");
        lab6.setBounds(-85,170,300,50);
        lab6.setContentAreaFilled(false);
        lab6.setFocusPainted(false);
        lab6.setBorderPainted(false);
        lab6.setFont(fon);
        tpanel3.add(lab6);

        lab6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Profile2();
            }
        });

        JLabel lab7 = new JLabel("<html>Director (Internal Medicine)<br>Internal Medicine, Critical Care</html>");
        lab7.setBounds(5,190,500,100);
        lab7.setFont(labfont);
        tpanel3.add(lab7);
        // end

        // tpanel4
        ImageIcon image5 = new ImageIcon("C:\\icon\\p-file (4).jpg");
        image5.setImage(image5.getImage());

        JPanel tpanel4 = new JPanel();
        tpanel4.setLayout(null);
        tpanel4.setBounds(265,350,230,310);
        panel3.add(tpanel4);

        JLabel limage5 = new JLabel(image5);
        limage5.setBounds(0,0,250,166);
        limage5.setFont(h);
        tpanel4.add(limage5);

        JButton lab8 = new JButton("Dr. Stanley Tucci");
        lab8.setBounds(-75,170,300,50);
        lab8.setContentAreaFilled(false);
        lab8.setFocusPainted(false);
        lab8.setBorderPainted(false);
        lab8.setFont(fon);
        tpanel4.add(lab8);

        lab8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Profile3();
            }
        });

        JLabel lab9 = new JLabel("<html>Principal Director - Vascular Surgery<br>Vascular Surgery</html>");
        lab9.setBounds(5,190,500,100);
        lab9.setFont(labfont);
        tpanel4.add(lab9);
        // end

        // tpanel 5
        ImageIcon image6 = new ImageIcon("C:\\icon\\p-file (2).jpg");
        image6.setImage(image6.getImage());

        JPanel tpanel5 = new JPanel();
        tpanel5.setLayout(null);
        tpanel5.setBounds(510,350,230,310);
        panel3.add(tpanel5);

        JLabel limage6 = new JLabel(image6);
        limage6.setBounds(0,0,250,166);
        tpanel5.add(limage6);

        JButton lab10 = new JButton("Dr. David Montgomery");
        lab10.setBounds(-55,170,300,50);
        lab10.setContentAreaFilled(false);
        lab10.setFocusPainted(false);
        lab10.setBorderPainted(false);
        lab10.setFont(fon);
        tpanel5.add(lab10);

        JLabel lab11 = new JLabel("<html>Principal Director - ENT<br>ENT, Ear Nose Throat</html>");
        lab11.setBounds(5,185,500,100);
        lab11.setFont(labfont);
        tpanel5.add(lab11);
        //end


        f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon);

        f.add(co);

        f.setResizable(false);
        f.setTitle("NIIT CLINIC  |  Team Members");
        f.setLocationRelativeTo(null);
        f.setSize(1030, 720);

        // This part, Set Jframe to Center of Window.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1030;
        int height = 720;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Team_Members();
    }
}

class profile extends JFrame{
    private JFrame f;

    public profile(){

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

        JLabel label = new JLabel("<html>Dr. Hayley Atwell.</html>");
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
        label1.setText("   hayleyatwell55@gmail.com.");
        label1.setBounds(15,30,300,50);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label1.setFont(fo);
        panel2.add(label1);

        JLabel label2 = new JLabel(inst);
        label2.setText("   Atwell_ella55.");
        label2.setBounds(-35,75,300,50);
        label2.setFont(fo);
        panel2.add(label2);

        JLabel label3 = new JLabel(twi);
        label3.setText("   HayleeyWell.");
        label3.setBounds(-35,120,300,50);
        label3.setFont(fo);
        panel2.add(label3);

        JLabel label4 = new JLabel(ph);
        label4.setText("   08126739266.");
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
        new profile();
    }
}