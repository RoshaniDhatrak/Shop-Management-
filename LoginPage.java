import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPage extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("NAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    LoginPage() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
     
            	String userText = userTextField.getText();
                String p= passwordField.getText();
                String pwdText= new String(p);
                try {
                	Class.forName("com.mysql.jdbc.Driver");
                	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Roshani@19");
                	Statement st= con.createStatement();
          
                	PreparedStatement ps = con.prepareStatement("select name from registration where Name=? and Password=?");

                    ps.setString(1, userText);

                    ps.setString(2, pwdText);
             
                    ResultSet rs = ps.executeQuery();

                    if (rs.next())

                    {

                    	JOptionPane.showMessageDialog(null, 
                    			"correct user_name or password.");
                    	ProDetails l = new ProDetails();
                		//l.setVisible(true);

                    } else{
                        JOptionPane.showMessageDialog(null,
                        		"Incorrect user_name or password..Try Again with correct detail");
                    }
                    
                	con.close();
                		}catch(Exception ae) {System.out.println(ae);}
                }
               
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
    public static void main(String[] a) 
    {
    	LoginPage f =  new LoginPage();
    	f.setSize(700, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
   