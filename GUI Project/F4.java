import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F4 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public F4()
	{
		super(" Page-4 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Welcome to Join Here As A Farmer");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,30);
		p1.add(l1);
		
		
		l2 = new JLabel("Please Verified Your Id");
		l2.setFont(new Font("Serif",Font.BOLD,30));
		l2.setForeground(Color.white);
		l2.setBounds(30,60,550,30);
		p1.add(l2);
		
		
		l3 = new JLabel("Please enter the following requirement bellow:");
		l3.setFont(new Font("Serif",Font.BOLD,20));
		l3.setForeground(Color.white);
		l3.setBounds(30,100,550,30);
		p1.add(l3);
		
		
		l4 = new JLabel("Name:");
		l4.setFont(new Font("Serif",Font.PLAIN,15));
		l4.setForeground(Color.white);
		l4.setBounds(30,150,200,30);
		p1.add(l4);
		
		
		
		t1 = new JTextField();
		t1.setBounds(190,150,200,30);
		p1.add(t1);
		
		
		l5 = new JLabel("Address:");
		l5.setFont(new Font("Serif",Font.PLAIN,15));
		l5.setForeground(Color.white);
		l5.setBounds(30,190,200,30);
		p1.add(l5);
		

		t2 = new JTextField();
		t2.setBounds(190,190,200,30);
		p1.add(t2);
		
		
		l5 = new JLabel("Product Type:");
		l5.setFont(new Font("Serif",Font.PLAIN,15));
		l5.setForeground(Color.white);
		l5.setBounds(30,230,200,30);
		p1.add(l5);
		

        t3 = new JTextField();
		t3.setBounds(190,230,200,30);
		p1.add(t3);
		
		
		l6 = new JLabel("Mobile No:");
		l6.setFont(new Font("Serif",Font.PLAIN,15));
		l6.setForeground(Color.white);
		l6.setBounds(30,270,200,30);
		p1.add(l6);
		

        t4 = new JTextField();
		t4.setBounds(190,270,200,30);
		p1.add(t4);
       		 
		
		b1 = new JButton("ok");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,320,100,30);
		b1.addActionListener(this);  
		p1.add(b1);

		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.red);
		b2.setBounds(300,320,100,30);
		b2.addActionListener(this);  
		p1.add(b2);	
		
		 
		
        this.add(p1);		
        
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 F5 f = new F5();
		     this.setVisible(false);
			 f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			 F2 f = new F2();
		     this.setVisible(false);
			 f.setVisible(true); 
			}
		}
 
 


}














