import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class login extends JFrame implements ActionListener{
    Container c;
    JLabel name,location,username,password,confirmpass,email,phone,pincode;
    JTextField tname,tlocation,tusername,tpassword,tconfirmpass,temail,tphone,tpincode;
    JTextArea tadv;
    JButton info,clear,exit;
    String strname,strlocation,strpassword,strusername,stremail,strphone,strconfirmpass,strpincode;
    login(){
        c=getContentPane();
        // c.setLayout(new FlowLayout());
        //initialize value
        name=new JLabel("Name:");
        name.setBounds(40,30,100,25);
        location=new JLabel("Location:");
        location.setBounds(40,80,100,25);
        pincode=new JLabel("Pincode:");
        phone=new JLabel("Phone.No:");
        email=new JLabel("Email Address:");
        username=new JLabel("Username:");
        password=new JLabel("Password:");
        confirmpass=new JLabel("Confirm Password:");

        // name.setSize(100,200);
        // name.setLocation(100,170);
        // location.setLocation(100,230);

        //initialize textfield
        tname=new JTextField(10);
        tlocation=new JTextField(10);
        tpincode=new JTextField(10);
        tphone=new JTextField(10);
        temail=new JTextField(10);
        tusername=new JTextField(10);
        tpassword=new JTextField(10);
        tconfirmpass=new JTextField(10);

        tname.setBounds(120,30,150,25);
        //intitialize button
        info=new JButton("Confirm Details");
        c.add(name);
        c.add(tname);
        c.add(location);
        c.add(tlocation);
        c.add(pincode);
        c.add(tpincode);
        c.add(phone);
        c.add(tphone);
        c.add(email);
        c.add(temail);
        c.add(username);
        c.add(tusername);
        c.add(password);
        c.add(tpassword);
        c.add(confirmpass);
        c.add(tconfirmpass);
        c.add(info);
        tadv=new JTextArea();
        tadv.setFont(new Font("Arial",Font.BOLD,35));
        // tadv.setSize(300,400);
        
        tadv.setLocation(100,500);
        tadv.setEditable(false);
        tadv.setLineWrap(true);
        c.add(tadv);
        info.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==info){
            strname=tname.getText();
            strlocation=tlocation.getText();
            strpincode=tpincode.getText();
            strphone=tphone.getText();
            stremail=temail.getText();
            strusername=tusername.getText();
            strpassword=tpassword.getText();
            strconfirmpass=tconfirmpass.getText();

            if(strname.equals("")||strlocation.equals("")||
            strlocation.equals("")||strpincode.equals("")||
            strphone.equals("")||stremail.equals("")||
            strusername.equals("")||strpassword.equals("")||
            strconfirmpass.equals(""))
            {
              JOptionPane.showMessageDialog(c,"Field cannot be empty.");
              tname.requestFocus();  
            }
            else{
                String datas="Name:"+tname.getText()+ "\n"+
                "Location:"+tlocation.getText()+"\n";
                tadv.setText(datas);
                tadv.setEditable(false);
            }}
            else if(e.getSource()==clear){
                tname.setText("");
                tlocation.setText("");
                tphone.setText("");
                temail.setText("");
                tpincode.setText("");
                tusername.setText("");
                tpassword.setText("");
                tconfirmpass.setText("");
                tname.requestFocus();
            }
            else{
                System.exit(0);
            }
        }
        public static void main(String[] args){
            login frm= new login();
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setBounds(200, 200, 400, 300);
            frm.setVisible(true);
            frm.setTitle("REGISTER");
    }
}