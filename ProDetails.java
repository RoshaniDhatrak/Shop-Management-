import javax.swing.*;

public class ProDetails {
	JFrame f;
	ProDetails(){  
    	
		f = new JFrame("Product Details");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JTabbedPane tp = new JTabbedPane();
		
		tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		
	    String data1[][]={ {"101","Bahubali Bag","24:30","150","50"},    
	                          {"102","Bahubali Bag","27:30","150","30"},    
	                          {"103","Bahubali Bag","27:35","150","30"},
	                          {"104","Kuber Bag","24:30","130","30"},
	                          {"105","Sumo Bag","13:16","130","50"},
	                        };    
	    String column1[]={"Id","Product Name","Size","Price","Quantity"};         
	    JTable jt1=new JTable(data1,column1);    
	    jt1.setBounds(30,40,200,300);          
	    JScrollPane sp1=new JScrollPane(jt1);  
	    
	    
		
	    String data2[][]={ {"1","Tiger Bag","7 Rs per ","50000"},    
	            {"2","Gulab Bag","7 Rs per","300000"},    
	            {"3","Shalimar Bag","7 Rs per","300000"},
	           };    
	    String column2[]={"Id","Product Name","Price","Quantity"};         
	    JTable jt2=new JTable(data2,column2);    
	    jt2.setBounds(30,40,200,300);          
	    JScrollPane sp2=new JScrollPane(jt2); 
	    
	    
	    String data3[][]={ {"11","Shalimar Bag","18:40","8 Rs per","50000"},    
	            {"12","Ragnigandha Bag","18:40","8 Rs per","300000"},    
	            {"13","Tiager Bag","18:40","8 Rs per","40000"},      
	          };    
	    String column3[]={"Id","Product Name","Size","Price","Quantity"};         
	    JTable jt3=new JTable(data3,column3);    
	    jt3.setBounds(30,40,200,300);          
	    JScrollPane sp3=new JScrollPane(jt3); 
	    
	   

	    String data4[][]={ {"111","Shalimar Bag","22:40","9 Rs per","50000"},    
	            {"122","Ragnigandha Bag","22:40","9 Rs per","800000"},    
	            {"133","Shakti Bag","22:40","12 Rs per","40000"},
	            {"134","Mango Bag","22:40","12 Rs per","40000"},
	            {"135","Sherkhan Bag","22:40","12 Rs per","40000"},
	          };    
	    String column4[]={"Id","Product Name","Size","Price","Quantity"};         
	    JTable jt4=new JTable(data4,column4);    
	    jt4.setBounds(30,40,200,300);          
	    JScrollPane sp4=new JScrollPane(jt4); 
	    
	    
	    
	    String data5[][]={ {"01","Makka Bardan","50 kg","22 Rs per","50000"},    
	            {"02","Reshan Bardan","50 kg","24 Rs per","800000"},    
	            {"03","Canvos Bag","50 Kg","24 Rs per","40000"},
	          };    
	    String column5[]={"Id","Product Name","Size","Price","Quantity"};         
	    JTable jt5=new JTable(data5,column5);    
	    jt5.setBounds(30,40,200,300);          
	    JScrollPane sp5=new JScrollPane(jt5);
	    
	    
	    ImageIcon icon1 = new ImageIcon("pick-up-bags.jpg");
		JLabel i1 = new JLabel(icon1);
		i1.setBounds(10, 30, 20, 20);
		
		ImageIcon icon2 = new ImageIcon("kanda.jpg");
		JLabel i2 = new JLabel(icon2);
		i2.setBounds(10, 30, 20, 20);
		
		
		 ImageIcon icon3 = new ImageIcon("tiger.jpg");
			JLabel i3 = new JLabel(icon3);
			i3.setBounds(30, 30, 20, 20);
		
		ImageIcon icon4 = new ImageIcon("on.jpg");
		JLabel i4 = new JLabel(icon4);
		i4.setBounds(30, 30, 20, 20);
		
	    ImageIcon icon5 = new ImageIcon("old.jpg");
		JLabel i5 = new JLabel(icon5);
		i5.setBounds(30, 30, 20, 20);
		
		ImageIcon icon6 = new ImageIcon("jute.jpg");
		JLabel i6 = new JLabel(icon6);
		i6.setBounds(30, 30, 20, 20);
	    
	    JPanel p1 = new JPanel();
	    p1.add(sp1);
	   
	    
	    JPanel p2 = new JPanel();
	    p2.add(sp2);
	    
	    JPanel p3 = new JPanel();
	    p3.add(sp3);
	   
	    
	    JPanel p4 = new JPanel();
	    p4.add(sp4);
	    
	    
	    JPanel p5 = new JPanel();
	    p5.add(sp5);
	    
	    
	    
	    JPanel p6 = new JPanel();
	    p6.add(i1);
	    p6.add(i2);
	    p6.add(i3);
	    p6.add(i4);
	    p6.add(i5);
	    p6.add(i6);
	    
        tp.setBounds(50,50,200,200);
		
		tp.add("Pickup Bag", p1);
		tp.add("Lino Bag(30 Kg) ",p2);
		tp.add("Lino Bag(40 Kg)",p3);
		tp.add("Lino Bag(50 Kg) ",p4);
		tp.add("Jute Bag(50 Kg)",p5);
		tp.add("Sample Images",p6);
		
		
        f.add(tp);
		
		f.setSize(400,250);
		
		f.setVisible(true);
	
	
	
	
	
	
}
	public static void main(String args[])
	{
		ProDetails p=new ProDetails();
		
	}

}