import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F6 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1;
		JButton b1,b2; 
		JPanel p1;
		
	public F6()
	{
		super(" Page-6 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Verification procedure");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,30);
		p1.add(l1);
		
		
		l2 = new JLabel("Please Wait for a Verification code");
		l2.setFont(new Font("Serif",Font.BOLD,30));
		l2.setForeground(Color.red);
		l2.setBounds(30,100,550,30);
		p1.add(l2);
		
		
		l3 = new JLabel("Enter varification code:");
		l3.setFont(new Font("Serif",Font.PLAIN,15));
		l3.setForeground(Color.white);
		l3.setBounds(30,150,550,30);
		p1.add(l3);
		
		  
		
		t1 = new JTextField();
		t1.setBounds(200,150,200,30);
		p1.add(t1);
	
       		 
		
		b1 = new JButton("ok");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,200,100,30);
		b1.addActionListener(this); 
		p1.add(b1);

		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.red);
		b2.setBounds(300,200,100,30);
		b2.addActionListener(this);
		p1.add(b2);	
		
		 
		
        this.add(p1);		
        
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 F7 f = new F7();
		     this.setVisible(false);
			 f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			 F5 f = new F5();
		     this.setVisible(false);
			 f.setVisible(true); 
			}
		}
 


}
