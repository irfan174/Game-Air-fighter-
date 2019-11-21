import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Instruction
{
public static JFrame frame3 ;
	
	public JButton back ;
	
	public ImageIcon help ;
	public ImageIcon back1 ;
	public ImageIcon key;
	 
	public JLabel helpPosition ;
	public JLabel back1Position ;
	public JLabel keyPosition;
	
	public Instruction()
	{
    	frame3 = new JFrame ("INSTRUCTION");
    	
    	help = new ImageIcon("instructions.png");
    	helpPosition = new JLabel(help);
    	
    	back1 = new ImageIcon("back.png");
    	back1Position = new JLabel(back1);
    	
    	key = new ImageIcon("keys.png");
    	keyPosition = new JLabel(key);
    	
    	back = new JButton (back1) ;
    	
		helpPosition.setBounds(30,110,500,300);
		back.setBounds(30,10,100,50);
		keyPosition.setBounds(360,180,150,80);
		//back1Position.setBounds(0,0,0,0);
		
		frame3.add(keyPosition);
		frame3.add(helpPosition);
		frame3.add(back);
		frame3.add(back1Position);
		
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
                new StartPage();
                frame3.setVisible(false);
			}	
		});
		
		frame3.setSize(700,750);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);




	}
	 


}
