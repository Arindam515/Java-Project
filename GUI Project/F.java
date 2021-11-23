 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F extends JFrame implements ActionListener 
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public F()
	{
		super("Home Page ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.pink);
		p1.setLayout(null);
	
	
		
		l1 = new JLabel("!!!!!!!!!!!!!Welcome To our  Project!!!!!!!!!!!");
		l1.setFont(new Font("Serif",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(30,10,600,40);
		p1.add(l1);
		 
		
		l2 = new JLabel("SUPPLY CHAIN MANAGEMENT SYSTEM ");
		l2.setFont(new Font("Serif",Font.BOLD,23));
		l2.setForeground(Color.red);
		l2.setBounds(60,150,550,30);
		p1.add(l2); 
		
        l3 = new JLabel("BY ");
		l3.setFont(new Font("Serif",Font.BOLD,23));
		l3.setForeground(Color.white);
		l3.setBounds(250,180,550,30);
		p1.add(l3); 
		
		l4 = new JLabel("REBOOT DEBUGGING");
		l4.setFont(new Font("Serif",Font.BOLD,24));
		l4.setForeground(Color.red);
		l4.setBounds(150,210,550,30);
		p1.add(l4); 
     
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(400,350,100,30);
		b1.addActionListener(this); 
		p1.add(b1);

		 
		 
		
        this.add(p1);		
        
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    F1 f = new F1();
			    this.setVisible(false);
				f.setVisible(true);
			}
			 
			
		} 
	
	 


}
