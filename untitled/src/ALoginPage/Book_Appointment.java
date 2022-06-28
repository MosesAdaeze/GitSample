package ALoginPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import Gui.Basic.Jlabel;
import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;


public class Book_Appointment extends JFrame implements ActionListener {

    private JFrame f;
    private ImageIcon icon1;
    private JLabel title, clinic, fn, ln, spe, date, time, em, pn, lit;
    private JTextField jt1, jt2, jt3, jt4;
    private JTextArea comment;
    private JButton submit;

    Book_Appointment() {

        // FONTS.
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 30);
        Font fon = new Font("Georgia", Font.PLAIN, 15);
        Font h = new Font("Georgia", Font.PLAIN, 15);
        Font wfont = new Font("Perpetua Titling MT", Font.PLAIN, 15);
        Font labfont = new Font("Serif", Font.PLAIN, 15);
        Color lor = new Color(135, 206, 235);

        icon1 = new ImageIcon("C:\\icon\\medicine (10).png");
        setIconImage(icon1.getImage());


        Border br = BorderFactory.createLineBorder(lor); // design border.
        Border border = BorderFactory.createLineBorder(Color.WHITE);


        Container co = new Container();
        // Panels.
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);

        // Panels properties.
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 250, 720);
        //Panel 2..
        panel2.setBackground(lor);
        panel2.setBounds(250, 0, 780, 720);

        co.add(panel);
        co.add(panel2);

        panel2.setBorder(br);

//        Add labels.
        JLabel label = new JLabel(icon1); //Insert icon into label. (hospital logo).
        label.setBounds(5, 0, 100, 70);
        panel.add(label); //Add label to panel.

        JLabel label2 = new JLabel("NIIT Clinic");
        label2.setBounds(90, 15, 300, 50);
        label2.setFont(fo);
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
        bt.setBounds(10, 130, 230, 45);
        bt.setBackground(Color.WHITE);
        bt.setFont(fo);
        bt.setBorder(br);
        panel.add(bt);

        JButton bt1 = new JButton(bp);
        bt1.setText(" Book Appointment  ");
        bt1.setBounds(10, 195, 230, 45);
        bt1.setBackground(Color.WHITE);
        bt1.setFont(fo);
        bt1.setBorder(br);
        panel.add(bt1);

        JButton bt2 = new JButton(p);
        bt2.setText(" Contact Doctor      ");
        bt2.setBounds(10, 260, 230, 45);
        bt2.setBackground(Color.WHITE);
        bt2.setFocusPainted(false);
        bt2.setFont(fo);
        bt2.setBorder(br);
        panel.add(bt2);

        JButton bt3 = new JButton(s);
        bt3.setText(" services                     ");
        bt3.setBounds(10, 325, 230, 45);
        bt3.setBackground(Color.WHITE);
        bt3.setFont(fo);
        bt3.setBorder(br);
        panel.add(bt3);

        JButton bt4 = new JButton(l);
        bt4.setText(" Log Out                     ");
        bt4.setBounds(10, 390, 230, 45);
        bt4.setBackground(Color.WHITE);
        bt4.setContentAreaFilled(false);
        bt4.setFocusPainted(false);
        bt4.setBorderPainted(false);
        bt4.setFont(fo);
        bt4.setBorder(br);
        panel.add(bt4);

        // Panel2 properties.

        JLabel header = new JLabel("Book Appointment.");
        header.setBounds(40, 40, 500, 50);
        header.setFont(font);
        header.setForeground(Color.WHITE);
        panel2.add(header);

        JLabel header2 = new JLabel("<html>Now you can get an online appointment, We will get back to you and fix a<br> meeting with doctors.<html>");
        header2.setBounds(40, 70, 700, 60);
        header2.setFont(h);
        header2.setForeground(Color.WHITE);
        panel2.add(header2);

        // TEXT FIELDS.

        title = new JLabel("Title");
        title.setBounds(40, 120, 100, 50);
        title.setFont(fon);
        title.setForeground(Color.WHITE);
        panel2.add(title);

        String[] optionsToChoose = {"Mr", "Mrs", "Miss", "Rev"};

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(40, 160, 100, 30);
        jComboBox.setForeground(Color.WHITE);
        jComboBox.setFont(fon);
        jComboBox.setBackground(lor);
        jComboBox.setFocusable(false);
        jComboBox.setBorder(border);
        panel2.add(jComboBox);


        fn = new JLabel("Firstname");
        fn.setBounds(40, 190, 100, 50);
        fn.setFont(fon);
        fn.setForeground(Color.WHITE);
        panel2.add(fn);


        jt1 = new JTextField(35);
        jt1.setBounds(40, 230, 260, 30);
        jt1.setBackground(lor);
        jt1.setForeground(Color.WHITE);
        jt1.setBorder(border);
        panel2.add(jt1);

        ln = new JLabel("Lastname");
        ln.setBounds(350, 190, 100, 50);
        ln.setFont(fon);
        ln.setForeground(Color.WHITE);
        panel2.add(ln);


        jt2 = new JTextField(35);
        jt2.setBounds(350, 230, 260, 30);
        jt2.setBackground(lor);
        jt2.setForeground(Color.WHITE);
        jt2.setBorder(border);
        panel2.add(jt2);

        clinic = new JLabel("Address");
        clinic.setBounds(350, 260, 200, 50);
        clinic.setFont(fon);
        clinic.setForeground(Color.WHITE);
        panel2.add(clinic);

        JTextField option = new JTextField(35);
        option.setBounds(350, 300, 300, 30);
        option.setForeground(Color.WHITE);
        option.setBackground(lor);
        option.setBorder(border);
        panel2.add(option);


        spe = new JLabel("Speciality");
        spe.setBounds(40, 260, 150, 50);
        spe.setFont(fon);
        spe.setForeground(Color.WHITE);
        panel2.add(spe);

        String[] speciality = {"Diagnosis", "Prescription", "Surgery", "Well being & Beauty", "Stomach ulcer", "Body pain",
                "Skin Disorders", "Joint Pain And Osteoarthritis", "Back Problems", "Cholesterol Problems", "Respiratory Problems", "Depression"
                , "Chronic Neurology Disorders", "High Blood Pressure", "Diabetes", "Headaches And Migraines"};

        JComboBox<String> box = new JComboBox<>(speciality);
        box.setBounds(40, 300, 260, 30);
        box.setForeground(Color.WHITE);
        box.setFont(fon);
        box.setBackground(lor);
        box.setFocusable(false);
        box.setBorder(border);
        panel2.add(box);

        // CALENDER.

        date = new JLabel("Appointment Date");
        date.setBounds(40, 330, 300, 50);
        date.setFont(fon);
        date.setForeground(Color.WHITE);
        panel2.add(date);

        DatePicker datePicker1 = new DatePicker();
        datePicker1.setBounds(40, 370, 260, 30);
        datePicker1.setBackground(lor);
        datePicker1.setForeground(Color.WHITE);
        datePicker1.setFocusable(false);
        panel2.add(datePicker1);
//        datePicker1.getDate();


        // CALENDER END.
        time = new JLabel("Appointment time");
        time.setBounds(350, 330, 300, 50);
        time.setFont(fon);
        time.setForeground(Color.WHITE);
        panel2.add(time);

        String[] timechoose = {"8am-10am", "12pm-2pm", "4pm-6pm"};

        JComboBox<String> ComboBox = new JComboBox<>(timechoose);
        ComboBox.setBounds(350, 370, 200, 30);
        ComboBox.setForeground(Color.WHITE);
        ComboBox.setFont(fon);
        ComboBox.setFocusable(false);
        ComboBox.setBackground(lor);
        ComboBox.setBorder(border);
        panel2.add(ComboBox);


        em = new JLabel("Email Address");
        em.setBounds(40, 400, 200, 50);
        em.setFont(fon);
        em.setForeground(Color.WHITE);
        panel2.add(em);


        jt3 = new JTextField(35);
        jt3.setBounds(40, 440, 260, 30);
        jt3.setBackground(lor);
        jt3.setForeground(Color.WHITE);
        jt3.setBorder(border);
        panel2.add(jt3);

        pn = new JLabel("Phone Number");
        pn.setBounds(350, 400, 200, 50);
        pn.setFont(fon);
        pn.setForeground(Color.WHITE);
        panel2.add(pn);


        jt4 = new JTextField(35);
        jt4.setBounds(350, 440, 270, 30);
        jt4.setBackground(lor);
        jt4.setForeground(Color.WHITE);
        jt4.setBorder(border);
        panel2.add(jt4);

        comment = new JTextArea("  Your message");
        comment.setFont(fon);
        comment.setForeground(Color.WHITE);
        comment.setBounds(40, 490, 600, 130);
        comment.setBackground(lor);
        comment.setBorder(border);
        panel2.add(comment);

        // WARNING MESSAGE.
        lit = new JLabel();
        lit.setBounds(160, 615, 700, 30);
        panel2.add(lit);

        submit = new JButton("Make Appointment");
        submit.setBounds(40, 640, 180, 40);
        submit.setFont(fon);
        submit.setForeground(lor);
        submit.setBackground(Color.WHITE);
        submit.setBorder(br);
        panel2.add(submit);


        // ADD ACTION LISTENER.

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home();
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

        submit.addActionListener(this);

        // FRAME.
        f = new JFrame();
        // Set logo in jframe title.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon); // Add Logo(icon).

        // Adding Container to JFrame.
        f.add(co);

        // Jframe properties.
        f.setTitle("NIIT CLINIC |  Book Appointment. ");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(1030, 720);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1030;
        int height = 720;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Book_Appointment();
    }

    Font cau = new Font("Georgia", Font.ITALIC, 17);

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jt1.getText().isBlank() == false && jt2.getText().isBlank() == false &&
                jt3.getText().isBlank() == false && jt4.getText().isBlank() == false && comment.getText().isBlank() == false) {
            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Notification();
                    lit.setText("");
                }
            });
        }else {
            lit.setText("Please insert necessary details in empty fields.");
            lit.setFont(cau);
            lit.setForeground(Color.RED);
            comment.setText("");
        }
    }
}





































// PROGRAM IMPORTANT NOTE.


///        DatePickerSettings dateSettings = new DatePickerSettings();
//        dateSettings.setFirstDayOfWeek(DayOfWeek.MONDAY);
//        DatePicker datePicker2 = new DatePicker(dateSettings);
//        add(datePicker1);
//
////        ImageIcon arrow = new ImageIcon("C:\\icon\\arrow-down-sign-to-navigate.png");
////        setIconImage(arrow.getImage());
//
//        DatePickerSettings settings = new DatePickerSettings();
//        CalendarPanel calendarPanel = new CalendarPanel(settings);
//        calendarPanel.setSelectedDate(LocalDate.now());


//        JFormattedTextField textField = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
//        textField.setValue(new Date()); //current date
//        textField.setBounds(40,370,240,30);
//        textField.setBackground(lor);
//        textField.setForeground(Color.WHITE);
//        textField.setBorder(border);
//        panel2.add(textField);
//
//        ImageIcon arrow = new ImageIcon("C:\\icon\\arrow-down-sign-to-navigate.png");
//        setIconImage(arrow.getImage());
//
//        JButton pd = new JButton(arrow);
//        pd.setBounds(280,370,30,30);
//        pd.setBackground(lor);
//        pd.setBorder(border);
//        panel2.add(pd);


//        CalendarWindow calendarWindow = new CalenderWindow();
//        pd.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                CalendarWindow.setLocation(textField.getLocationOnScreen().x, (textField.getLocationOnScreen().y ));
//                calendarWindow.setVisible(true);
//            }
//        });

//
//        jt5 = new JTextField(35);
//        jt5.setBounds(40, 370, 260, 30);
//        jt5.setBackground(lor);
//        jt5.setBorder(border);
//        panel2.add(jt5);

//    public static void main(String[] args) {
//            SwingUtilities.invokeLater(new Runnable() {
//                @Override
//                public void run() {
//                    Book_Appointment window = null;
//                    try {
//                        window = new Book_Appointment();
//                        window.setVisible(true);
//                    }
//                    catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//    }
