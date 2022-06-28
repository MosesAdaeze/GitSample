package AProject;

import Gui.Layout.Borderlayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.security.cert.TrustAnchor;

public class LoginFont2 extends JFrame {
    JFrame f;
    JLabel label;
//    ImageIcon image;
//    ImageIcon image;
//    Borderlayout left,right;

    public LoginFont2() {
        f = new JFrame();

//    }
//        JPanel panel = new JPanel();

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine.png");
        f.setIconImage(icon);

//        Image pic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kloss\\Desktop\\FILES\\display_pic\\it.jpg");
//        label.setIcon(pic);
//        setIconImage(pic.getImage());
//        label = new JLabel(pic);

        f.setLayout(null);
        f.setTitle("e-Hospital");
        f.setBackground(Color.black);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(520, 400);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(true);

//        f.add(panel);
//        panel.add(label);


//        BorderLayout layout = new BorderLayout();
//        setLayout(layout);
//        f.getContentPane().add(label, BorderLayout.WEST);

//        validate();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(plainFont);
        g2.drawString("Welcome to TutorialsPoint", 50, 70);
//        panel.add(plainFont);
    }

    public static void main(String[] args) {
        LoginFont2 run = new LoginFont2();
    }
}







//        label.setIcon(new ImageIcon("C:\\icon\\medicine.png"));
//        BufferedImage image = ImageIO.read(new File("C:\\Users\\Kloss\\Desktop\\FILES\\display_pic\\it2.jpg"));
//        label = new JLabel(new ImageIcon(image));

//        panel.setBounds(40,70,100,100);
//        panel.setBackground(Color.lightGray);


//        panel = new JPanel();
//        f.add(panel);
//        panel.setBackground(Color.black);
//        f.getContentPane ().add (panel);
        ;
//        f.add(panel);

//        label = new JLabel("Login Here");

//        getContentPane ().add (label, BorderLayout.WEST);
//        add(panel);
//        validate();

//        label= new JLabel("Picture here");


//        setBackground(Color.pink);




//        panel.setBackground(Color.pink);
//        label.setIcon(new ImageIcon("C:\\Users\\Kloss\\Desktop\\images\\hospital22.jpg"));
//        panel.add(label);
//       image = new ImageIcon("C:\\Users\\Kloss\\Desktop\\images\\hospital22.jpg");


//        getContentPane ().add (label, BorderLayout.PAGE_START);
//        getContentPane ().add (label1, BorderLayout.LINE_START);
//        getContentPane ().add (image, BorderLayout.WEST);

//        panel.add(image);
//        panel.add(label1);

//        label.setBackground(Color.blue);

//        BorderLayout layout = new BorderLayout();
//        setLayout(layout);

        //add each component to the frame
//        add(label,BorderLayout.WEST);
//        add(label1,BorderLayout.EAST);

//        add(panel);
//        validate();

//    public static void main(String[] args){
////        BufferedImage image = ImageIO.read(new File("C:\\Users\\Kloss\\Desktop\\FILES\\display_pic\\it2.jpg"));
////        label = new JLabel(new ImageIcon(image));
//        LoginFont2 run = new LoginFont2();
//    }
//}

