import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

public class F31 extends JFrame implements ActionListener 
{
        JLabel l1;
         
        JButton b1,b2,b3,b4; 
        JPanel p1;
        
    public F31()
    {
        super(" Page-31 ");
        this.setSize(600,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setSize(new Dimension(600,550));
        p1.setBackground(Color.blue);
        p1.setLayout(null);
        
        l1 = new JLabel("You are in the Admin Page");
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.white);
        l1.setBounds(50,30,550,30);
        p1.add(l1);
         
        
        b1 = new JButton("Product's Ammount");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.red);
        b1.setBounds(30,150,230,30);
        b1.addActionListener(this); 
        p1.add(b1);

 

        
        b2 = new JButton("Product's Selling Qty");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        b2.setBounds(280,150,230,30);
        b2.addActionListener(this);   
        p1.add(b2);    
        
        b3 = new JButton("product's Buying Qty");
        b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b3.setForeground(Color.white);
        b3.setBackground(Color.red);
        b3.setBounds(30,190,230,30);
        b3.addActionListener(this); 
        p1.add(b3); 


		b4 = new JButton("change product's prizes");
        b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        b4.setForeground(Color.white);
        b4.setBackground(Color.red);
        b4.setBounds(280,190,230,30);
        b4.addActionListener(this);  
        p1.add(b4);
        
        this.add(p1);        
        
    }
    
    
    public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    F43 f1 = new F43();
			    this.setVisible(false);
				f1.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			    F54 f2 = new F54();
			    this.setVisible(false);
				f2.setVisible(true);	 
			}
			else if(ae.getSource()==b3)
			{
			    F44 f2 = new F44();
			    this.setVisible(false);
				f2.setVisible(true);	 
			}
			else if(ae.getSource()==b4)
			{
			    F41 f2 = new F41();
			    this.setVisible(false);
				f2.setVisible(true);	 
			}
			
		}      
 

 


}

 