import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Project  implements ActionListener, KeyListener
{
	JFrame f;
	Graphics g;
	int width = 90;
	int height = 140;
	int eWidth = 80;
	int eHeight = 130;
	int w1 = 700;
	int h1 = 750;
	//int width1 = 60;
	//int height1 = 120;
	int rx = 200;
	int ry = 100;
	int mx = 700;
	int my = 750;
	
	int fx1 = 0;
	int fy1 = 0;
	int fx2 = 570;
	int fy2 = 0;
	
	int bx = 0;
	int by = 0;
	int bx1 = 0;
	int by1 = -750;
	
	int mix = 340;
	int miy = 620;
	int move = 0;
	
	int x = 300;
	int y = 590;
	
	int x1 = 05;
	int y1 = -250;
	
	int x2 = 90;
	int y2 = -170;
	
	int x3 = 180;
	int y3 = -480;
	
	int x4 = 270;
	int y4 = -320;
	
	int x5 = 360;
	int y5 = -590;
	
	int x6 = 450;
	int y6 = -210;
	
	int x7 = 540;
	int y7 = -300;
	
	int x8 = 630;
	int y8 = -500;
	
	int score = 0;
	int flag = 0;
	int bool =0;
	int count = 0;
	String title = "Air Fighter";
	//int y = my - height - 50;
	Timer t;
	ImageIcon myPlane;
	ImageIcon background;
	ImageIcon background1;
	ImageIcon enemyPlane;
	ImageIcon enemyPlane2;
	ImageIcon enemyPlane3;
	ImageIcon enemyPlane4;
	ImageIcon enemyPlane5;
	ImageIcon blust;
	//private TextField tf;
	ImageIcon misail;
	public Project()
	{
			
		//g.drawLine(150, 0, 150, my);
		//g.drawLine(300, 0, 300, my);
		blust = new ImageIcon("blust.png");
		myPlane = new ImageIcon("myplane.png");
		enemyPlane = new ImageIcon("enemy.png");
		enemyPlane2 = new ImageIcon("enemy2.png");
		enemyPlane3 = new ImageIcon("enemy3.png");
		enemyPlane4 = new ImageIcon("enemy4.png");
		enemyPlane5 = new ImageIcon("enemy5.png");
		background = new ImageIcon("background.png");
		background1 = new ImageIcon("background1.png");
		misail = new ImageIcon("misail1.png");
		
		f = new JFrame(title);
		f.setSize(mx, my);
		//f.setBackground(Color.black);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLayout(new FlowLayout());
		f.addKeyListener(this);
		g = f.getGraphics();
		Timer t = new Timer(40,this);
		t.start();	
	}

	public static void main(String[] args) {
		new Project();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		//g.clearRect(0,0, f.getWidth(), f.getHeight());
		f.setTitle(title + "  Score: " + score + "  Missed: "+ count);

		g.drawImage(background.getImage(), bx, by, w1,h1, null);
		g.drawImage(background1.getImage(), bx1, by1, w1,h1, null);
		g.drawImage(misail.getImage(), mix, miy, 20,70, null);
		g.drawImage(myPlane.getImage(), x, y, width,height, null);
		g.drawImage(enemyPlane.getImage(), x1, y1, eWidth,eHeight, null);
		g.drawImage(enemyPlane2.getImage(), x2, y2, eWidth,eHeight, null);
		g.drawImage(enemyPlane3.getImage(), x3, y3, eWidth,eHeight, null);
		g.drawImage(enemyPlane.getImage(), x4, y4, eWidth,eHeight, null);
		g.drawImage(enemyPlane2.getImage(), x5, y5, eWidth,eHeight, null);
		g.drawImage(enemyPlane3.getImage(), x6, y6, eWidth,eHeight, null);
		g.drawImage(enemyPlane4.getImage(), x7, y7, eWidth,eHeight, null);
		g.drawImage(enemyPlane5.getImage(), x8, y8, eWidth,eHeight, null);
		g.drawImage(myPlane.getImage(), x, y, width,height, null);
		//g.drawImage(misail.getImage(), mix, miy, 20,50, null);
		//tf.setText("Irfan");
		
		
		y1 += 9;
		if(y1 >= 750)
		{
			//bool = 1;
			y1 = -420;
			count++;
		}
		y2 += 10;
		if(y2 >= 750)
		{
			//bool = 1;
			y2 = -150;
			count++;
		}
		y3 += 8;
		if(y3 >= 750)
		{
			//bool = 1;
			y3 = -570;
			count++;
			
		}
		y4 += 9;
		if(y4 >= 750)
		{
			//bool = 1;
			y4 = -650;
			count++;
		}
		y5 += 8;
		if(y5 >= 750)
		{
			//bool = 1;
			y5 = -350;
			count++;
		}
		y6 += 9;
		if(y6 >= 750)
		{
			//bool =1;
			y6 = -950;
			count++;
		}
		y7 += 9;
		if(y7 >= 750)
		{
			//bool =1;
			y7 = -1050;
			count++;
		}
		y8 += 11;
		if(y8 >= 750)
		{
			//bool =1;
			y8 = -550;
			count++;
		}
		/*if(bool == 1)
		{
			count++;

		}
		/*if(((y >= y1) && (y<=y1+110)||(y+140 >= y1) && (y +70 <= y1+140 ))&&(((x1>=x)&&( x1 <= x +55))|| ((x1+70>=x)&&(x1+70<=x+100))))
		{
			//y1 = y-150 ;
			flag =1 ;
		
		}*/
		if(count >= 11)
		{
			JOptionPane.showMessageDialog( null, "Game Over ! Your Score :"+score,"Game Over", JOptionPane.INFORMATION_MESSAGE);
            f.setVisible(false);
			t.stop();
		}
		
		
		by += 50;
		by1 += 50;
		if(by >= 750)
		{
			by = -750;
		}
		if(by1 >= 750)
		{
			by1 = -750;
		}
		if(move == 1)
		{
			miy-=50;
		
			if( miy >= y1 && miy <= y1+130 && mix >= x1-10 && mix <= x1+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x1-20, y1-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y1 = -1200;
			}
	
			if( miy >= y2 && miy <= y2+130 && mix >= x2-10 && mix <= x2+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x2-20, y2-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y2 = -1000;
			}
	
			
			if( miy >= y3 && miy <= y3+130 && mix >= x3-10 && mix <= x3+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x3-20, y3-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y3 = -500;
			}
			if( miy >= y4 && miy <= y4+130 && mix >= x4-10 && mix <= x4+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x4-20, y4-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y4 = -700;
			}
			if( miy >= y5 && miy <= y5+130 && mix >= x5-10 && mix <= x5+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x5-20, y5-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y5 = -900;
			}
	
			if( miy >= y6 && miy <= y6+130 && mix >= x6-10 && mix <= x6+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x6-20, y6-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y6 = -300;
			}
	
			if( miy >= y7 && miy <= y7+130 && mix >= x7-10 && mix <= x7+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x7-20, y7-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y7 = -600;
			}
			
			if( miy >= y8 && miy <= y8+130 && mix >= x8-10 && mix <= x8+100 )		
			{
				score+=50;
				
				g.drawImage(blust.getImage(), x8-20, y8-20, 140,180, null);
				try 
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e1)
				{
			
					e1.printStackTrace();
				}
				y8 = -850;
			}
	
			
			
		}	
	
		if(miy<=0)
		{
			//move = 0;
			mix=x+40;
			miy = 620;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) 
		{
			x -= 70;
			if(move == 0)
			{
				mix -= 70;
			}
			
			//mix -= 20;
			if (x <= bx)
			{
				x = bx;
				mix = x+40;
			}
				
			
			
			/*by += 25;
			by1 += 25;
			if(by >= 750)
			{
				by = -750;
			}
			if(by1 >= 750)
			{
				by1 = -750;
			}*/
		}
		if(e.getKeyCode()== KeyEvent.VK_S)
		{
			move = 1;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) 
		{
			x += 70;
			if(move == 0)
			{
				mix += 70;
			}
			
			if ( x >= bx+600 )
			{
				x = bx+600;
				mix = x+40;
			}
				
			/*by += 25;
			by1 += 25;
			if(by >= 750)
			{
				by = -750;
			}
			if(by1 >= 750)
			{
				by1 = -750;
			}*/
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			y2 += 6;
			if(y2 >= 700)
			{
				y2 = -150;
			}
			
			y1 += 7;
			if(y1 >= 700)
			{
				y1 = -220;
			}
			y3 += 8;
			if(y3 >= 700)
			{
				y3 = -70;
			}
			y4 += 6;
			if(y4 >= 750)
			{
				y4 = -250;
			}
			/*if (y - 50 > 0)
				y = y - 50;
			else
				y = my - height;*/
			by += 25;
			by1 += 25;
			if(by >= 750)
			{
				by = -750;
			}
			if(by1 >= 750)
			{
				by1 = -750;
			}

			
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) 
		{
			by -= 15;
			by1 -= 15;
			if ( y <= my)
				y = 560;
			else
				y = my - height - 50;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}

}
