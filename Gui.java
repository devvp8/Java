import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class login extends JFrame implements ActionListener{
    // JFrame c=new JFrame();
    JLabel name,location,username,password,confirmpass,email,phone,pincode;
    JTextField tname,tlocation,tusername,tpassword,tconfirmpass,temail,tphone,tpincode;
    JTextArea tadv;
    JButton info,clear,exit;
    String strname,strlocation,strpassword,strusername,stremail,strphone,strconfirmpass,strpincode;
 public login(){
        //initialize value
        name=new JLabel("Name;");
        location=new JLabel("Location");
        pincode=new JLabel("Pincode");
        phone=new JLabel("Phone.No:");
        email=new JLabel("Email Address:");
        username=new JLabel("Username:");
        password=new JLabel("Password:");
        confirmpass=new JLabel("Confirm Password:");

        //initialize textfield
        tname=new JTextField("15");
        tlocation=new JTextField("15");
        tpincode=new JTextField("6");
        tphone=new JTextField();
        temail=new JTextField();
        tusername=new JTextField("8");
        tpassword=new JTextField("8");
        tconfirmpass=new JTextField("8");

        //intitialize button
        info=new JButton("Confirm Details");
        add(name);
        add(tname);
        add(location);
        add(tlocation);
        add(pincode);
        add(tpincode);
        add(phone);
        add(tphone);
        add(email);
        add(temail);
        add(username);
        add(tusername);
        add(password);
        add(tpassword);
        add(confirmpass);
        add(tconfirmpass);
        add(info);
        tadv = new JTextArea();
        tadv.setSize(200,450);
        tadv.setLocation(100,500);
        tadv.setEditable(false);
        tadv.setLineWrap(true);
        add(tadv);
        // c.setVisible(true);
        // c.setSize(400,400);
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
            //   JOptionPane.showMessageDialog("Field cannot be empty.");
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
        
}
public class Gui{
public static void main(String[] args){
            login frm= new login();
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setBounds(200, 200, 400, 300);
            frm.setVisible(true);
            frm.setTitle("REGISTER");
            frm.setLayout(new FlowLayout());
    }

}

