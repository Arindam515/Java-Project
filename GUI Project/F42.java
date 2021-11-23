import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

public class F42 extends JFrame  
{
        JLabel l1,l2,l3;
         
        JButton b1; 
        JPanel p1;
        
    public F42()
    {
        super(" Page-42 ");
        this.setSize(600,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setSize(new Dimension(600,550));
        p1.setBackground(Color.blue);
        p1.setLayout(null);
        
        
		l1 = new JLabel("Thank you for your co-operation");
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.white);
        l1.setBounds(30,30,550,40);
        p1.add(l1);
    
	
		l2 = new JLabel("It will be Our pleasure to see you again");
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.white);
        l2.setBounds(30,75,550,30);
        p1.add(l2);
         
		
		l3 = new JLabel("Stay well stay safe");
        l3.setFont(new Font("Serif",Font.BOLD,25));
        l3.setForeground(Color.white);
        l3.setBounds(90,100,550,30);
        p1.add(l3);
		
		
		b1 = new JButton("Thank you");
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,23));
        b1.setForeground(Color.red);
        b1.setBackground(Color.yellow);
        b1.setBounds(150,150,200,75);
        
        p1.add(b1);

        this.add(p1);        
      
    }
    
}
 

 