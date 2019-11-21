
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class StartPage
{
	 public static JFrame frame;
	    public JButton play;
	   public JButton help;
	    public JButton exit;
	    
	    public ImageIcon play1 ;
	    public ImageIcon help1 ;
	    public ImageIcon exit1 ;
	    public ImageIcon frontPage ;
	    
	    public JLabel play1Position ;
	   public JLabel help1Position ;
	    public JLabel exit1Position ;
	    public JLabel frontPagePosition ;
	    
	    
	    public StartPage()
	    {
	    	frame = new JFrame ("Start");
	    	
	    	play1 = new ImageIcon("play1.png");
	    	play1Position = new JLabel(play1);
	    	
	    	help1 = new ImageIcon("help1.png");
	    	help1Position = new JLabel(help1);
	    	
	    	frontPage = new ImageIcon("Startpage.png");
	    	frontPagePosition = new JLabel(frontPage);
	    	
	    	exit1 = new ImageIcon("exit1.png");
	    	exit1Position = new JLabel(exit1);
	    	
	    	play = new JButton(play1);
			help = new JButton(help1);
			exit = new JButton(exit1);
			
			
			
	    	
			play.setBounds(80,150,150,100);
			play1Position.setBounds(0,0,0,0);
			help.setBounds(100,260,200,100);
			help1Position.setBounds(0,0,0,0);
			exit.setBounds(520,615,150,100);
			exit1Position.setBounds(0,0,0,0);
			frontPagePosition.setBounds(0,0,70,140);
			
			frame.add(play);
			frame.add(help);
			frame.add(exit);
			frame.add(play1Position);
			frame.add(help1Position);
			frame.add(exit1Position);
			frame.add(frontPagePosition);
			//play1Position.setVisible(true);	
			play.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
	                new Project();
	                
	                frame.setVisible(false);
				}	
			});
			
			help.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					new Instruction();
					
					frame.setVisible(false);
				}
			});
			
			exit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.exit(1);
				}
			});
			 
				frame.setSize(700,750);
				frame.setVisible(true);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setLayout(null);
		        frame.setLocationRelativeTo(null);
		       
	    }


}

