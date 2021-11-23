 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class F44 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;
		
	public F44()
	{
		super(" Page-20 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,60));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
	
	
		
		l1 = new JLabel("See Ammount of Buying Product in Stock in kg");
		l1.setFont(new Font("Serif",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(30,10,600,40);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(600,130));
		p2.setBackground(Color.red);
		p2.setLayout(null);
		 
		
		l2 = new JLabel("Product no  Product Type   Previous    Buying     Date             Current ");
		l2.setFont(new Font("Serif",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(10,60,550,30);
		p2.add(l2);
		
		
        l11 = new JLabel("Amount     Amount                         Amount ");
		l11.setFont(new Font("Serif",Font.BOLD,15));
		l11.setForeground(Color.white);
		l11.setBounds(190,80,550,30);
		p2.add(l11);		
	

		p3 = new JPanel();
		p3.setSize(new Dimension(600,160));
		p3.setBackground(Color.white);
		p3.setLayout(null);
		
		l4 = new JLabel("01          Tomato          41           24         12-08-20   39 ");
		l4.setFont(new Font("Serif",Font.BOLD,20));
		l4.setForeground(Color.black);
		l4.setBounds(10,130,600,30);
		p3.add(l4); 
		
		p4 = new JPanel();
		p4.setSize(new Dimension(600,190));
		p4.setBackground(Color.pink);
		p4.setLayout(null);
		
		 
		l3 = new JLabel("02          Banana          41           24         12-08-20   39 ");
		l3.setFont(new Font("Serif",Font.BOLD,20));
		l3.setForeground(Color.black);
		l3.setBounds(10,160,600,30);
		p4.add(l3);
		
		p5 = new JPanel();
		p5.setSize(new Dimension(600,220));
		p5.setBackground(Color.white);
		p5.setLayout(null);
		
		 
		l5 = new JLabel("03          Onion            41           24         12-08-20   39 ");
		l5.setFont(new Font("Serif",Font.BOLD,20));
		l5.setForeground(Color.black);
		l5.setBounds(10,190,600,30);
		p5.add(l5);
		
		
		p6 = new JPanel();
		p6.setSize(new Dimension(600,250));
		p6.setBackground(Color.pink);
		p6.setLayout(null);
		
		 
		l6 = new JLabel("04          Eggplant       41           24         12-08-20   39 ");
		l6.setFont(new Font("Serif",Font.BOLD,20));
		l6.setForeground(Color.black);
		l6.setBounds(10,220,600,30);
		p6.add(l6);
		
		p7 = new JPanel();
		p7.setSize(new Dimension(600,280));
		p7.setBackground(Color.white);
		p7.setLayout(null);
		
		 
		l7 = new JLabel("04          Fish               30           12         12-08-20   10 ");
		l7.setFont(new Font("Serif",Font.BOLD,20));
		l7.setForeground(Color.black);
		l7.setBounds(10,250,600,30);
		p7.add(l7);
		
		p8 = new JPanel();
		p8.setSize(new Dimension(600,310));
		p8.setBackground(Color.pink);
		p8.setLayout(null);
		
		 
		l8 = new JLabel("05          rice               300         120        13-08-20   120 ");
		l8.setFont(new Font("Serif",Font.BOLD,20));
		l8.setForeground(Color.black);
		l8.setBounds(10,280,600,30);
		p8.add(l8);
		
		
		p9 = new JPanel();
		p9.setSize(new Dimension(600,340));
		p9.setBackground(Color.white);
		p9.setLayout(null);
		
		 
		l9 = new JLabel("06          Suger            50           60         13-09-20   50 ");
		l9.setFont(new Font("Serif",Font.BOLD,20));
		l9.setForeground(Color.black);
		l9.setBounds(10,310,600,30);
		p9.add(l9);
		
		p10 = new JPanel();
		p10.setSize(new Dimension(600,380));
		p10.setBackground(Color.pink);
		p10.setLayout(null);
		
		 
		l10 = new JLabel("07          Pulses           40           26         12-08-20   40 ");
		l10.setFont(new Font("Serif",Font.BOLD,20));
		l10.setForeground(Color.black);
		l10.setBounds(10,340,600,30);
		p10.add(l10);
		
		p11 = new JPanel();
		p11.setSize(new Dimension(600,550));
		p11.setBackground(Color.blue);
		p11.setLayout(null);
     
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(150,400,100,30);
		b1.addActionListener(this); 
		p11.add(b1); 
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBackground(Color.green);
		b2.setBounds(350,400,100,30);
		b2.addActionListener(this); 
		p11.add(b2); 

		 
		 
		
        this.add(p1);
        this.add(p2);
        this.add(p3);		
        this.add(p4);
		this.add(p5);
		this.add(p6);
		this.add(p7);
		this.add(p8);
		this.add(p9);
		this.add(p10);
		this.add(p11);
	}
	 
	
	  public void actionPerformed(ActionEvent ae)
		{
			 
			 if(ae.getSource()==b1)
			{
			    F1 f = new F1();
			    this.setVisible(false);
				f.setVisible(true);
			}
			 
			if(ae.getSource()==b2)
			{
			   F31 f2 = new F31();
			    this.setVisible(false);
				f2.setVisible(true);  
			} 
			
		}  
			 
			
		 


}
