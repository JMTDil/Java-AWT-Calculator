import java.awt.*;
import java.awt.event.*;

class Close extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    String fv, sv, op;
    Double fdv, sdv, tot;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new Close());
        f.setBackground(Color.BLACK);
        f.setTitle("Calculator");
        f.setResizable(false);
        f.setSize(350, 410);

        Font f1 = new Font("Poppins", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 30);
        Font f3 = new Font("Quicksand", Font.BOLD, 28);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Standard");
        MenuItem mi1 = new MenuItem("Scientific");
        m1.add(mi);
        m1.add(mi1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m1);
        mb.add(m2);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(6, 4, 4, 4);
        p2.setLayout(g1);
        p2.setBackground(Color.BLACK);

        tf = new TextField(15);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.WHITE);
        tf.setBackground(Color.BLACK);
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("%");
        b12 = new Button("CE");
        b13 = new Button("C");
        b14 = new Button("<x]");
        b15 = new Button("1/x");
        b16 = new Button("x2");
        b17 = new Button("√");
        b18 = new Button("/");
        b19 = new Button("x");
        b20 = new Button("-");
        b21 = new Button("+");
        b22 = new Button("=");
        b23 = new Button("+/-");
        b24 = new Button(".");

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setForeground(Color.WHITE);
        b7.setForeground(Color.WHITE);
        b8.setForeground(Color.WHITE);
        b9.setForeground(Color.WHITE);
        b10.setForeground(Color.WHITE);
        b11.setForeground(Color.WHITE);
        b12.setForeground(Color.WHITE);
        b13.setForeground(Color.WHITE);
        b14.setForeground(Color.WHITE);
//        b15.setForeground(Color.WHITE);
//        b16.setForeground(Color.WHITE);
//        b17.setForeground(Color.WHITE);
        b18.setForeground(Color.WHITE);
        b19.setForeground(Color.WHITE);
        b20.setForeground(Color.WHITE);
        b21.setForeground(Color.WHITE);
        b22.setForeground(Color.WHITE);
//        b23.setForeground(Color.WHITE);
        b24.setForeground(Color.WHITE);

        b1.setBackground(Color.DARK_GRAY);
        b2.setBackground(Color.DARK_GRAY);
        b3.setBackground(Color.DARK_GRAY);
        b4.setBackground(Color.DARK_GRAY);
        b5.setBackground(Color.DARK_GRAY);
        b6.setBackground(Color.DARK_GRAY);
        b7.setBackground(Color.DARK_GRAY);
        b8.setBackground(Color.DARK_GRAY);
        b9.setBackground(Color.DARK_GRAY);
        b10.setBackground(Color.DARK_GRAY);
        b11.setBackground(Color.GRAY);
        b12.setBackground(Color.GRAY);
        b13.setBackground(Color.GRAY);
        b14.setBackground(Color.ORANGE);
        b15.setBackground(Color.WHITE);
        b16.setBackground(Color.WHITE);
        b17.setBackground(Color.WHITE);
        b18.setBackground(Color.ORANGE);
        b19.setBackground(Color.ORANGE);
        b20.setBackground(Color.ORANGE);
        b21.setBackground(Color.ORANGE);
        b22.setBackground(Color.ORANGE);
        b23.setBackground(Color.WHITE);
        b24.setBackground(Color.DARK_GRAY);

        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
        b10.setFont(f1);
        b11.setFont(f1);
        b12.setFont(f1);
        b13.setFont(f1);
        b14.setFont(f1);
        b15.setFont(f1);
        b16.setFont(f1);
        b17.setFont(f1);
        b18.setFont(f1);
        b19.setFont(f1);
        b20.setFont(f1);
        b21.setFont(f1);
        b22.setFont(f1);
        b23.setFont(f1);
        b24.setFont(f1);

        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b19);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b20);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b21);
        p2.add(b23);
        p2.add(b10);
        p2.add(b24);
        p2.add(b22);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object o = d.getSource();

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b12)) {
            tf.setText("");
        } else if (o.equals(b13)) {
            tf.setText("");
        } else if (o.equals(b14)) {
            String text = tf.getText();
            if (text.length() > 0) {
                tf.setText(text.substring(0, text.length() - 1));
            }
        } else if (o.equals(b15)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(String.valueOf(1 / fdv));
        } else if (o.equals(b16)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(String.valueOf(fdv * fdv));
        } else if (o.equals(b17)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(String.valueOf(Math.sqrt(fdv)));
        } else if (o.equals(b18)) { // /
            fv = tf.getText();
            op = b18.getLabel();
            tf.setText("");
        } else if (o.equals(b19)) { // x
            fv = tf.getText();
            op = b19.getLabel();
            tf.setText("");
        } else if (o.equals(b20)) { // -
            fv = tf.getText();
            op = b20.getLabel();
            tf.setText("");
        } else if (o.equals(b21)) { // +
            fv = tf.getText();
            op = b21.getLabel();
            tf.setText("");
        } else if (o.equals(b22)) { // =
            sv = tf.getText();
            sdv = Double.parseDouble(sv);
            tf.setText("");
            if (op.equals("+")) {
                tot = fdv + sdv;
            } else if (op.equals("-")) {
                tot = fdv - sdv;
            } else if (op.equals("x")) {
                tot = fdv * sdv;
            } else if (op.equals("/")) {
                tot = fdv / sdv;
            }
            tf.setText(String.valueOf(tot));
        } else if (o.equals(b23)) { // +/-
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(String.valueOf(fdv * -1));
        } else if (o.equals(b24)) {
            tf.setText(tf.getText() + b24.getLabel());
        }
    }
}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}
