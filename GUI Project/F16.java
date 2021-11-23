import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class F16 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t1,t2,t3,t4,t5,t6;
		JButton b1,b2; 
		JPanel p1;
	public F16()
	{
		super(" Page-16 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Please Fill up the Requirements");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(30,30,550,50);
		p1.add(l1);
 
		
		l4 = new JLabel("Name:");
		l4.setFont(new Font("Serif",Font.PLAIN,15));
		l4.setForeground(Color.white);
		l4.setBounds(30,100,200,30);
		p1.add(l4);

		

		
		t1 = new JTextField();
		t1.setBounds(190,100,200,30);
		p1.add(t1);

		
		l5 = new JLabel(" Email Address:");
		l5.setFont(new Font("Serif",Font.PLAIN,15));
		l5.setForeground(Color.white);
		l5.setBounds(30,140,200,30);
		p1.add(l5);

		
		t2 = new JTextField();
		t2.setBounds(190,140,200,30);
		p1.add(t2);

		
		l5 = new JLabel("Mobile number:");
		l5.setFont(new Font("Serif",Font.PLAIN,15));
		l5.setForeground(Color.white);
		l5.setBounds(30,180,200,30);
		p1.add(l5);

		
        t3 = new JTextField();
		t3.setBounds(190,180,200,30);
		p1.add(t3);

		
		l6 = new JLabel("Address:");
		l6.setFont(new Font("Serif",Font.PLAIN,15));
		l6.setForeground(Color.white);
		l6.setBounds(30,220,200,30);
		p1.add(l6);

		
        t4 = new JTextField();
		t4.setBounds(190,220,200,30);
		p1.add(t4);
		
		l7 = new JLabel("Product Type:");
		l7.setFont(new Font("Serif",Font.PLAIN,15));
		l7.setForeground(Color.white);
		l7.setBounds(30,260,200,30);
		p1.add(l7);
		
		
        t5 = new JTextField();
		t5.setBounds(190,260,200,30);
		p1.add(t5);
		
		l8 = new JLabel("Product Ammount:");
		l8.setFont(new Font("Serif",Font.PLAIN,15));
		l8.setForeground(Color.white);
		l8.setBounds(30,300,200,30);
		p1.add(l8);
		
		
        t6 = new JTextField();
		t6.setBounds(190,300,200,30);
		p1.add(t6);
		
		
		

       		 
		b1 = new JButton("ok");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,400,100,30);
		b1.addActionListener(this); 
		p1.add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.red);
		b2.setBounds(300,400,100,30);
		b2.addActionListener(this); 
		p1.add(b2);	

		

		 
        this.add(p1);		
	}

      public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    F17 f = new F17();
			    this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			    F12 f = new F12();
			    this.setVisible(false);
				f.setVisible(true);	 
			}
			 
			
		} 
 

}