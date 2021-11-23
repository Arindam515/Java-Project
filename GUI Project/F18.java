import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F18 extends JFrame implements ActionListener 
{
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public F18()
	{
		super(" Log in ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Payment Through Online");
		l1.setFont(new Font("Serif",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(120,30,550,30);
		p1.add(l1);
	
		
		
		l4 = new JLabel("Enter bkash or dbbl:");
		l4.setFont(new Font("Serif",Font.PLAIN,15));
		l4.setForeground(Color.white);
		l4.setBounds(30,130,200,30);
		p1.add(l4);
		
		
		
		t1 = new JTextField();
		t1.setBounds(190,130,200,30);
		p1.add(t1);
		
		
		l5 = new JLabel("Ammount:");
		l5.setFont(new Font("Serif",Font.PLAIN,15));
		l5.setForeground(Color.white);
		l5.setBounds(30,170,200,30);
		p1.add(l5);
		

		t2 = new JTextField();
		t2.setBounds(190,170,200,30);
		p1.add(t2);
		
		l3 = new JLabel("Enter password:");
		l3.setFont(new Font("Serif",Font.PLAIN,15));
		l3.setForeground(Color.white);
		l3.setBounds(30,220,200,30);
		p1.add(l3);
		

		t2 = new JTextField();
		t2.setBounds(190,220,200,30);
		p1.add(t2);
		
		
		
	
       		 
		
		b1 = new JButton("ok");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,300,100,30);
		b1.addActionListener(this); 
		p1.add(b1);

		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.red);
		b2.setBounds(330,300,100,30);
		b2.addActionListener(this); 
		p1.add(b2);
		 
		
        this.add(p1);		
        
	}
	
	 public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    F19 f1 = new F19();
			    this.setVisible(false);
				f1.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			    F16 f2 = new F16();
			    this.setVisible(false);
				f2.setVisible(true);	 
			}
			 
			
		} 


}
