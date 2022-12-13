import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class buttons extends JFrame implements ActionListener {
Container c;
JButton btnHi, btnHowareyou, btnmurli, btnGladtomeet;
JLabel label;
buttons() {
c = getContentPane();
c.setLayout(null);
btnHi = new JButton("Hi");
btnmurli = new JButton("Murli");
btnGladtomeet = new JButton("Milke acha laga");
btnHowareyou = new JButton("maja ma");
label = new JLabel(" ");
label.setSize(200, 60);
btnHi.setLocation(100, 50);
btnmurli.setLocation(100, 110);
btnGladtomeet.setLocation(100, 170);
btnHowareyou.setLocation(100, 230);
btnHi.setSize(100, 50);
btnmurli.setSize(100, 50);
btnGladtomeet.setSize(100, 50);
btnHowareyou.setSize(100, 50);
c.add(btnHi);
c.add(btnmurli);
c.add(btnGladtomeet);
c.add(btnHowareyou);
c.add(label);
btnHi.addActionListener(this);
btnmurli.addActionListener(this);
btnGladtomeet.addActionListener(this);
btnHowareyou.addActionListener(this);
}
public static void main(String[] args) {
buttons frm = new buttons();
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setBounds(200, 200, 400, 500);
frm.setVisible(true);
frm.setTitle("clickme");
}
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnHi) {
    label.setText("Hello");
    label.setLocation(220, 50);
    }
    if (e.getSource() == btnmurli) {
    label.setText("Murli");
    label.setLocation(220, 110);
    }
    if (e.getSource() == btnGladtomeet) {
    label.setText("See you");
    label.setLocation(220, 160);
    }
    if (e.getSource() == btnHowareyou) {
    label.setText("Haalchal?");
    label.setLocation(220, 230);
    }
    }
    }
