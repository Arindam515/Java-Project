import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F3 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JButton b1,b2; 
		JPanel p1;
		
	public F3()
	{
		super(" Price ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.white);
		p1.setLayout(null);
		
		l1 = new JLabel("Tomato  :12 tk Kg");
		l1.setFont(new Font("Serif",Font.PLAIN,25));
		l1.setForeground(Color.red);
		l1.setBounds(30,30,550,30);
		p1.add(l1);
		
		l2 = new JLabel("Banana: 8 tk piece");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		l2.setForeground(Color.red);
		l2.setBounds(30,70,550,30);
		p1.add(l2);
		
		l3 = new JLabel("Onion  :100 tk kg");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		l3.setForeground(Color.red);
		l3.setBounds(30,120,550,30);
		p1.add(l3);
		
		
		l4 = new JLabel("Eggplant  :40 tk kg");
		l4.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l4.setForeground(Color.red);
		l4.setBounds(30,160,550,30);
		p1.add(l4);
		
		
		l5 = new JLabel("Fish:55 tk kg");
		l5.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l5.setForeground(Color.red);
		l5.setBounds(30,200,550,30);
		p1.add(l5);
		
		
		l6 = new JLabel("Rice  :82 taka kg");
		l6.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l6.setForeground(Color.red);
		l6.setBounds(30,240,550,30);
		p1.add(l6);
		
		
		l7 = new JLabel("Sugar  :52 tk kg");
		l7.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l7.setForeground(Color.red);
		l7.setBounds(30,280,550,30);
		p1.add(l7);
		
		
		l8 = new JLabel("Pulses  :64 tk kg");
		l8.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		l8.setForeground(Color.red);
		l8.setBounds(30,220,550,30);
		p1.add(l7);
		
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.red);
		b1.setBounds(180,350,100,25);
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
			else 
			{
				 
			}
		}


}
