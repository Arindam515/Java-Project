import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F10 extends JFrame implements ActionListener
{
		JLabel l1,l2;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public F10()
	{
		super(" Log in page ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("We have send the full money in your account");
		l1.setFont(new Font("Serif",Font.PLAIN,20));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,30);
		p1.add(l1);
		
	
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(300,100,100,30);
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
			 else{}
		}
     



}
