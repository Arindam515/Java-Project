import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F5 extends JFrame implements ActionListener
{
		JLabel l1,l2;
		JTextField t1;
		JButton b1,b2; 
		JPanel p1;
		
	public F5()
	{
		super(" Page-5 ");
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
		
		
		l2 = new JLabel("Enter Mobile no :");
		l2.setFont(new Font("Serif",Font.PLAIN,15));
		l2.setForeground(Color.white);
		l2.setBounds(30,100,550,30);
		p1.add(l2);
		
		
		 
		
		t1 = new JTextField();
		t1.setBounds(160,100,200,30);
		p1.add(t1);
		
	
		
		b1 = new JButton("ok");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,190,100,30);
		b1.addActionListener(this);  
		p1.add(b1);

		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.red);
		b2.setBounds(300,190,100,30);
		b2.addActionListener(this);  
		p1.add(b2);	
		
		 
		
        this.add(p1);		
        
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 F6 f = new F6();
		     this.setVisible(false);
			 f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			 F4 f = new F4();
		     this.setVisible(false);
			 f.setVisible(true); 
			}
		}
}
