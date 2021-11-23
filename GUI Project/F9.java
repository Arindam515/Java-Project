import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F9 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public F9()
	{
		super(" Log in ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Logged In Successfully!!!!");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,30);
		p1.add(l1);
		
		
		l2 = new JLabel("Your total taka is 12*40=480 taka");
		l2.setFont(new Font("Serif",Font.BOLD,17));
		l2.setForeground(Color.pink);
		l2.setBounds(30,60,550,30);
		p1.add(l2);
		
		
		l3 = new JLabel("Please verified your bkash account");
		l3.setFont(new Font("Serif",Font.BOLD,30));
		l3.setForeground(Color.white);
		l3.setBounds(30,100,550,30);
		p1.add(l3);
		
		
		b1 = new JButton("Yes");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,150,100,30);
		b1.addActionListener(this); 
		p1.add(b1);

		
		b2 = new JButton("No");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.green);
		b2.setBounds(300,150,100,30);
		b2.addActionListener(this); 
		p1.add(b2);	
		
		 
		
        this.add(p1);		
        
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 F10 f = new F10();
		     this.setVisible(false);
			 f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			 F8 f = new F8();
		     this.setVisible(false);
			 f.setVisible(true); 
			}
		}
     


 


}
