import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F17 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4,t5,t6;
		JButton b1,b2; 
		JPanel p1;
		
	public F17()
	{
		super(" page 16 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Enjoy Shopping");
		l1.setFont(new Font("Serif",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(200,10,550,40);
		p1.add(l1);
		
		
		l2 = new JLabel("Your payments is  12*42=504 taka");
		l2.setFont(new Font("Serif",Font.BOLD,20));
		l2.setForeground(Color.pink);
		l2.setBounds(30,60,550,30);
		p1.add(l2);
		
		
		l3 = new JLabel("Select Your Payment Method below:");
		l3.setFont(new Font("Serif",Font.BOLD,30));
		l3.setForeground(Color.white);
		l3.setBounds(30,100,550,30);
		p1.add(l3);
		
		
			 
		b1 = new JButton("Pay online");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(80,200,200,30);
		b1.addActionListener(this); 
		p1.add(b1);

		b2 = new JButton("Cash On Delivery");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.green);
		b2.setBounds(300,200,200,30);
		b2.addActionListener(this); 
		p1.add(b2);
		
		
		
		 
		
        this.add(p1);		
        
	}
	

     public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    F18 f = new F18();
			    this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			    F21 f = new F21();
			    this.setVisible(false);
				f.setVisible(true);	 
			}
			 
			
		} 

 


}
