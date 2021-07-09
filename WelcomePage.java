import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WelcomePage  extends JFrame implements ActionListener{
    JFrame frame;
	JLabel l1,l2,l3,l4;
    JButton b1,b2;
    
    public WelcomePage()
    {
    	
	JFrame frame = new JFrame("Shree Swami Samarth Trading Company  ");
	
	l1=new JLabel("Welcome To Shree Swami Samarth Trading Company");
	l1.setBounds(250, 10, 1000, 150);
	Font font=new Font("Arial",Font.BOLD,30);
	l1.setFont(font);
	l1.setForeground(new Color(255, 90, 40));


	
	l2=new JLabel("Address: Galla NO.4, Bhaji Market, Shreeram Nagar Road, Malegaon, Maharashtra 423203");
	l2.setBounds(70, 50, 550, 200);
	
	l3=new JLabel("Contact No: 7588739996");
	l3.setBounds(70, 70, 500, 200);	
	
	l4=new JLabel("Prasad Raghunath Dhatrak");
	l4.setBounds(70,30,500,200);
			
	b1=new JButton("login");
	b1.setBounds(250, 300, 100, 50);
	b1.addActionListener(this);
	
	b2=new JButton("Rgister");
	b2.setBounds(450, 300, 100, 50);
	b2.addActionListener(this);
	
	frame.setSize(500, 300);
	frame.setVisible(true);
	frame.setLayout(null);
	
	frame.add(l1);
	frame.add(l4);
	frame.add(b1);
	frame.add(b2);
	frame.add(l2);
	frame.add(l3);
    }
	public static void main(String Args[])
	{
		new WelcomePage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LoginPage l = new LoginPage();
		l.setVisible(true);
	   }
		else if(e.getSource()==b2)
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		RegistrationPage reg = new RegistrationPage();
		reg.setVisible(true);
}
	}
}