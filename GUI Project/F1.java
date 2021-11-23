import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F1 extends JFrame implements ActionListener
{
		JLabel l1;
		 
		JButton b1,b2,b3,b4; 
		JPanel p1;
		
	public F1()
	{
		super(" Page-1 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(400,350));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Log in for further procedure");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,50);
		p1.add(l1);
		 
		
		b1 = new JButton("Farmer");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setBounds(100,120,100,75);
		b1.addActionListener(this);
		p1.add(b1);

		
		b2 = new JButton("Customer");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setBounds(275,120,100,75);
		b2.addActionListener(this); 
		p1.add(b2);	
		
		b3 = new JButton("Admin");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.red);
		b3.setBounds(190,210,100,75);
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
			 F2 f2= new F2();
		    this.setVisible(false);
			f2.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
               F12 f3 = new F12();
				this.setVisible(false);
				f3.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
                F31 f3 = new F31();
				this.setVisible(false);
				f3.setVisible(true);  
			}
			else if(ae.getSource()==b4)
			{
                F39 f3 = new F39();
				this.setVisible(false);
				f3.setVisible(true);  
			}
		}
 


}














