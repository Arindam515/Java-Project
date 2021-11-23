import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F2 extends JFrame implements ActionListener
{
		JLabel l1,l2;
		 
		JButton b1,b2,b3,b4; 
		JPanel p1;
		
	public F2()
	{
		super(" Page-2 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Welcome to Join Here As A Farmer");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,40);
		p1.add(l1);
		
		
		l2 = new JLabel("Please Verify Your Id");
		l2.setFont(new Font("Serif",Font.BOLD,30));
		l2.setForeground(Color.white);
		l2.setBounds(30,80,550,30);
		p1.add(l2);
		 
		
		b1 = new JButton("Join First Time");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setBounds(100,150,200,75);
		b1.addActionListener(this);
		p1.add(b1);

		
		b2 = new JButton("Not First Time");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setBounds(330,150,200,75);
		b2.addActionListener(this); 
		p1.add(b2);	
		
		b3 = new JButton("See Product's price");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.red);
		b3.setBounds(210,235,200,75);
		b3.addActionListener(this); 
		p1.add(b3);	
		
		b4 = new JButton("Back");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.red);
		b4.setBackground(Color.green);
		b4.setBounds(390,400,80,30);
		b4.addActionListener(this); 
		p1.add(b4);		
		
        this.add(p1);		
        
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 F4 f2 = new F4();
		     this.setVisible(false);
		     f2.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				F8 f3 = new F8();
				this.setVisible(false);
				f3.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				F3 f4 = new F3();
				this.setVisible(false);
				f4.setVisible(true);
				 
			}
			
			else if(ae.getSource()==b4)
			{
                F1 f3 = new F1();
				this.setVisible(false);
				f3.setVisible(true);  
			}
		}
 


}














