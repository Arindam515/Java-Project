import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

public class F39 extends JFrame implements ActionListener 
{ 
        JLabel l1;
        JButton b1,b2; 
        JPanel p1;
        
    public F39()
    {
        super(" Page-39 ");
        this.setSize(600,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setSize(new Dimension(600,550));
        p1.setBackground(Color.blue);
        p1.setLayout(null);
		
		
		l1 = new JLabel("Please Select an option");
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.white);
        l1.setBounds(80,30,550,50);
        p1.add(l1);
        
        
        b1 = new JButton("Main manu");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        b1.setForeground(Color.white);
        b1.setBackground(Color.red);
        b1.setBounds(80,150,170,40);
        b1.addActionListener(this);
        p1.add(b1);

 
        b2 = new JButton("Log out");
        b2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        b2.setBounds(270,150,170,40);
        b2.addActionListener(this);  
        p1.add(b2);    
        
        
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
			 else if(ae.getSource()==b2)
			{
			    F42 f = new F42();
			    this.setVisible(false);
				f.setVisible(true);
			}
			
		} 
	
    
	
	
    
     }