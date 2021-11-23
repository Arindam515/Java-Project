import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F20 extends JFrame  implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public F20()
	{
		super(" Page-20 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
	
	
		
		l1 = new JLabel("Purcess Product!!!!");
		l1.setFont(new Font("Serif",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(130,10,550,40);
		p1.add(l1);
		 
		
		l2 = new JLabel("Congratulation!! You Have Brought 12 kg vegetables.");
		l2.setFont(new Font("Serif",Font.BOLD,23));
		l2.setForeground(Color.white);
		l2.setBounds(30,100,550,30);
		p1.add(l2); 
		
        l3 = new JLabel("It will be Delivered within 24 hours ");
		l3.setFont(new Font("Serif",Font.BOLD,23));
		l3.setForeground(Color.white);
		l3.setBounds(30,140,550,30);
		p1.add(l3); 
     
		
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
