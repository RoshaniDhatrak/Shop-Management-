import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.*;


public class RegistrationPage extends JFrame implements ActionListener{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10;
	JTextArea tadd;
	JTextField tf1, tf2, tf5, tf6, tf7,t10;
	JButton btn1, btn2;
	JPasswordField p1, p2;
	
    
    
    RegistrationPage()
	{
	setVisible(true);
	setSize(700, 700);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Registration Form");

	l1 = new JLabel("Registration Form :");
	l1.setForeground(Color.blue);
	l1.setFont(new Font("Serif", Font.BOLD, 20));
	l2 = new JLabel("Name:");
	l3 = new JLabel("Email-ID:");
	l4 = new JLabel("Create Passowrd:");
	l5 = new JLabel("Confirm Password:");
	l6 = new JLabel("Address");
	l7 = new JLabel("Country:");
	l8 = new JLabel("City:");
	l9 = new JLabel("Phone No:");

	tf1 = new JTextField();
	tf2 = new JTextField();
	tadd = new JTextArea();
	p1 = new JPasswordField();
	p2 = new JPasswordField();
	tf5 = new JTextField();
	tf6 = new JTextField();
	tf7 = new JTextField();
	
	btn1 = new JButton("Submit");
	btn2 = new JButton("Clear");

	btn1.addActionListener(this);
	btn2.addActionListener(this);

	l1.setBounds(100, 30, 400, 30);
	l2.setBounds(80, 70, 200, 30);
	l3.setBounds(80, 110, 200, 30);
	l4.setBounds(80, 150, 200, 30);
	l5.setBounds(80, 190, 200, 30);
	l6.setBounds(80, 230, 200, 30);
	l7.setBounds(80, 270, 200, 30);
	l8.setBounds(80, 310, 200, 30);
	l9.setBounds(80,350,200,30);
	tf1.setBounds(300, 70, 200, 30);
	tf2.setBounds(300, 110, 200, 30);
	tadd.setBounds(300,230,200,30);
	p1.setBounds(300, 150, 200, 30);
	p2.setBounds(300, 190, 200, 30);
	tf5.setBounds(300, 350, 200, 30);
	tf6.setBounds(300, 270, 200, 30);
	tf7.setBounds(300, 310, 200, 30);
	
	btn1.setBounds(50, 550, 100, 30);
	btn2.setBounds(170, 550, 100, 30);
	
	add(l1);
	add(l2);
	add(tf1);
	add(l3);
	add(tf2);
	add(l4);
	add(p1);
	add(l5);
	add(p2);
	add(l6);
	add(tadd);
	add(l7);
	add(tf6);
	add(l8);
	add(tf7);
	add(l9);
	add(tf5);
	add(btn1);
	add(btn2);
	
	
	}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == btn1) 
	{
		try {
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Roshani@19");
        	Statement st= con.createStatement();
        	PreparedStatement pt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?)");
        	 
        	String name=tf1.getText();
        	String em=tf2.getText();
        	String pass=p1.getText();
        	String Cpass=p2.getText();
        	String ad=tadd.getText();
        	String c=tf6.getText();
        	String city=tf7.getText();
        	String p=tf5.getText();
        	
        	pt.setString(1,name);
        	pt.setString(2,em);
        	pt.setString(3,pass);
        	pt.setString(4,Cpass);
        	pt.setString(5,ad);
        	pt.setString(6,c);
        	pt.setString(7,city);
        	pt.setString(8,p);
        	
        	if(p1.getText().equalsIgnoreCase(p2.getText()))
            {
                //Executing query
                pt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
                LoginPage l = new LoginPage();
        		l.setVisible(true);
            
            }
            else
            {
                JOptionPane.showMessageDialog(null,"password did not match");
            }
        	con.close();
        }catch(Exception ae) {
        	System.out.println(ae);
        	}
	}
    else if(e.getSource() == btn2) 
    {
        String def = "";
        tf1.setText(def);
        tf2.setText(def);
        p1.setText(def);
        p2.setText(def);
        tadd.setText(def);
        tf5.setText(def);
        tf6.setText(def);
        tf7.setText(def);
       
    }
}
public static void main(String args[]) {
	RegistrationPage m = new RegistrationPage();
}
}