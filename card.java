import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class card extends JFrame implements MouseListener
{
	
	Icon b[] = new ImageIcon[8];
	Icon f[] = new ImageIcon[8];
	
	JLabel back[] = new JLabel[8];
	JLabel front[] = new JLabel[8];
	
	boolean click[] = new boolean[8];
	boolean check[] = {false,false,false,false,false,false,false,false};
	
	boolean c1 = false, c2 = false;
	
	int index[] = new int[8];
	JLabel msg = new JLabel("",JLabel.CENTER);
	JButton reset = new JButton("RESET");
	
	public card()
	{
		super("CARD");
		setBounds(448,70,465,465);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		for(int i = 0; i < 8; i++)
		{
			while(true)
			{
				boolean c = true;
				int x = 1+(int)(Math.random() * 8);
				for(int ii = 0; ii < 8; ii++)
				{
					if(x == index[ii]){c = false;break;}}

				if(c == true){index[i] = x;click[i]=false;/*System.out.println(index[i])*/;break;}
				else continue;
			}
		}
		
		for(int x = 0; x < 8; x++){if(index[x] == 8) {index[x] = 0;break;}}
		
		msg.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		b[0] = new ImageIcon("back.jpg");
		b[1] = new ImageIcon("back.jpg");
		b[2] = new ImageIcon("back.jpg");
		b[3] = new ImageIcon("back.jpg");
		b[4] = new ImageIcon("back.jpg");
		b[5] = new ImageIcon("back.jpg");
		b[6] = new ImageIcon("back.jpg");
		b[7] = new ImageIcon("back.jpg");
		
		f[0] = new ImageIcon("heart.jpg");
		f[1] = new ImageIcon("heart.jpg");
		f[2] = new ImageIcon("spade.jpg");
		f[3] = new ImageIcon("spade.jpg");
		f[4] = new ImageIcon("club.jpg");
		f[5] = new ImageIcon("club.jpg");
		f[6] = new ImageIcon("diamond.jpg");
		f[7] = new ImageIcon("diamond.jpg");
		
	
		back[0] = new JLabel(b[0]);
		back[1] = new JLabel(b[1]);
		back[2] = new JLabel(b[2]);
		back[3] = new JLabel(b[3]);
		back[4] = new JLabel(b[4]);
		back[5] = new JLabel(b[5]);
		back[6] = new JLabel(b[6]);
		back[7] = new JLabel(b[7]);
		
		front[0] = new JLabel(f[0]);
		front[1] = new JLabel(f[1]);
		front[2] = new JLabel(f[2]);
		front[3] = new JLabel(f[3]);
		front[4] = new JLabel(f[4]);
		front[5] = new JLabel(f[5]);
		front[6] = new JLabel(f[6]);
		front[7] = new JLabel(f[7]);
		
		front[index[0]].setBounds(10,10,100,160);
		front[index[1]].setBounds(120,10,100,160);
		front[index[2]].setBounds(230,10,100,160);
		front[index[3]].setBounds(340,10,100,160);
		front[index[4]].setBounds(10,180,100,160);
		front[index[5]].setBounds(120,180,100,160);
		front[index[6]].setBounds(230,180,100,160);
		front[index[7]].setBounds(340,180,100,160);
		
		back[index[0]].setBounds(10,10,100,160);
		back[index[1]].setBounds(120,10,100,160);
		back[index[2]].setBounds(230,10,100,160);
		back[index[3]].setBounds(340,10,100,160);
		back[index[4]].setBounds(10,180,100,160);
		back[index[5]].setBounds(120,180,100,160);
		back[index[6]].setBounds(230,180,100,160);
		back[index[7]].setBounds(340,180,100,160);
		
		msg.setBounds(10,350,455,30);
		reset.setBounds(182,390,100,30);
		
		//add(back[0]);
		add(front[index[0]]);
		add(back[index[0]]);
		add(front[index[1]]);
		add(back[index[1]]);
		add(front[index[2]]);
		add(back[index[2]]);
		add(front[index[3]]);
		add(back[index[3]]);
		add(front[index[4]]);
		add(back[index[4]]);
		add(front[index[5]]);
		add(back[index[5]]);
		add(front[index[6]]);
		add(back[index[6]]);
		add(front[index[7]]);
		add(back[index[7]]);
		
		add(msg);
		add(reset);
		
		front[0].setVisible(false);
		front[1].setVisible(false);
		front[2].setVisible(false);
		front[3].setVisible(false);
		front[4].setVisible(false);
		front[5].setVisible(false);
		front[6].setVisible(false);
		front[7].setVisible(false);
		
		/*back[0].setVisible(true);
		back[1].setVisible(true);
		back[2].setVisible(true);
		back[3].setVisible(true);
		back[4].setVisible(true);
		back[5].setVisible(true);
		back[6].setVisible(true);
		back[7].setVisible(true);*/
		
		reset.setVisible(false);
		
		/*front[index[0]].setVisible(true);
		front[index[1]].setVisible(true);
		front[index[2]].setVisible(true);
		front[index[3]].setVisible(true);
		front[index[4]].setVisible(true);
		front[index[5]].setVisible(true);
		front[index[6]].setVisible(true);
		front[index[7]].setVisible(true);*/
		
		back[index[0]].addMouseListener(this);
		back[index[1]].addMouseListener(this);
		back[index[2]].addMouseListener(this);
		back[index[3]].addMouseListener(this);
		back[index[4]].addMouseListener(this);
		back[index[5]].addMouseListener(this);
		back[index[6]].addMouseListener(this);
		back[index[7]].addMouseListener(this);
		reset.addMouseListener(this);
		
	}
	public void mouseClicked(MouseEvent e)
	{
		
		if(e.getSource() == back[0])
		{
			if(c1==false && click[0] == false)
			{
				front[0].setVisible(true);
				c1 = true;
				click[0] = true;
			}
			else if(c2 == false && click[0] == false)
			{
				front[0].setVisible(true);
				c2 = true;
				click[0] = true;
			}
		}
		else if(e.getSource() == back[1])
		{
			if(c1==false && click[1] == false)
			{
				front[1].setVisible(true);
				c1 = true;
				click[1] = true;
			}
			else if(c2 == false && click[1] == false)
			{
				front[1].setVisible(true);
				c2 = true;
				click[1] = true;
			}
		}
		else if(e.getSource() == back[2])
		{
			if(c1==false && click[2] == false)
			{
				front[2].setVisible(true);
				c1 = true;
				click[2] = true;
			}
			else if(c2 == false && click[2] == false)
			{
				front[2].setVisible(true);
				c2 = true;
				click[2] = true;
			}
		}
		else if(e.getSource() == back[3])
		{
			if(c1==false && click[3] == false)
			{
				front[3].setVisible(true);
				c1 = true;
				click[3] = true;
			}
			else if(c2 == false && click[3] == false)
			{
				front[3].setVisible(true);
				c2 = true;
				click[3] = true;
			}
		}
		else if(e.getSource() == back[4])
		{
			if(c1==false && click[4] == false)
			{
				front[4].setVisible(true);
				c1 = true;
				click[4] = true;
			}
			else if(c2 == false && click[4] == false)
			{
				front[4].setVisible(true);
				c2 = true;
				click[4] = true;
			}
		}
		else if(e.getSource() == back[5] )
		{
			if(c1==false && click[5] == false)
			{
				front[5].setVisible(true);
				c1 = true;
				click[5] = true;
			}
			else if(c2 == false && click[5] == false)
			{	
				front[5].setVisible(true);
				c2 = true;
				click[5] = true;
			}
		}
		else if(e.getSource() == back[6]) 
		{
			if(c1==false && click[6] == false)
			{
			front[6].setVisible(true);
			c1 = true;
			click[6] = true;
			}
			else if(c2 == false && click[6] == false)
			{
				front[6].setVisible(true);
				c2 = true;
				click[6] = true;
			}
		}
		else if(e.getSource() == back[7])
		{
			if(c1==false && click[7] == false)
			{
				front[7].setVisible(true);
				c1 = true;
				click[7] = true;
			}
			else if(c2 == false && click[7] == false)
			{
				front[7].setVisible(true);
				c2 = true;
				click[7] = true;
			}
		}
		else if(e.getSource()==reset)
		{
			c1= false; c2=false;
			if(click[0]==true) { back[0].setVisible(true); front[0].setVisible(false); click[0]=false;}
			if(click[1]==true) { back[1].setVisible(true); front[1].setVisible(false); click[1]=false;}
			if(click[2]==true) { back[2].setVisible(true); front[2].setVisible(false); click[2]=false;}
			if(click[3]==true) { back[3].setVisible(true); front[3].setVisible(false); click[3]=false;}
			if(click[4]==true) { back[4].setVisible(true); front[4].setVisible(false); click[4]=false;}
			if(click[5]==true) { back[5].setVisible(true); front[5].setVisible(false); click[5]=false;}
			if(click[6]==true) { back[6].setVisible(true); front[6].setVisible(false); click[6]=false;}
			if(click[7]==true) { back[7].setVisible(true); front[7].setVisible(false); click[7]=false;}
			reset.setVisible(false);
		}
		
		if(c1 == true && c2 == true)
		{
			if(click[0]==true)
			{
				if(click[1]==true)
				{
					back[0].setVisible(false);
					back[1].setVisible(false);
					front[0].setVisible(false);
					front[1].setVisible(false);
					click[0] = false;
					click[1] = false;
					check[0] = true;
					check[1] = true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
				else if(click[2] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[4] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[6] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
			}
			else if(click[1] == true)
			{
				if(click[0] == true)
				{
					back[0].setVisible(false);
					back[1].setVisible(false);
					front[0].setVisible(false);
					front[1].setVisible(false);
					click[0]=false;
					click[1]=false;
					check[0]=true;
					check[1]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
				else if(click[2] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[4] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[6] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
			}
			else if(click[2] == true)
			{
				if(click[0] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[1] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					back[2].setVisible(false);
					back[3].setVisible(false);
					front[2].setVisible(false);
					front[3].setVisible(false);
					click[2] = false;
					click[3] = false;
					check[2]=true;
					check[3]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
				else if(click[4] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[6] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
			}
			else if(click[3] == true)
			{
				if(click[0] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[1] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[2] == true)
				{
					back[2].setVisible(false);
					back[3].setVisible(false);
					front[2].setVisible(false);
					front[3].setVisible(false);
					click[2]=false;
					click[3]=false;
					check[2]=true;
					check[3]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
				else if(click[4] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}else if(click[6] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
			}
			else if(click[4] == true)
			{
				if(click[0] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[1] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[2] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					back[4].setVisible(false);
					back[5].setVisible(false);
					front[4].setVisible(false);
					front[5].setVisible(false);
					click[4]=false;
					click[5]=false;
					check[4]=true;
					check[5]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
				else if(click[6] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
			}
			else if(click[5] == true)
			{
				if(click[0] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[1] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[2] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[4] == true)
				{
					back[4].setVisible(false);
					back[5].setVisible(false);
					front[4].setVisible(false);
					front[5].setVisible(false);
					click[4]=false;
					click[5]=false;
					check[4]=true;
					check[5]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
				else if(click[6] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
			}
			else if(click[6] == true)
			{
				if(click[0] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[1] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[2] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[4] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[7] == true)
				{
					back[6].setVisible(false);
					back[7].setVisible(false);
					front[6].setVisible(false);
					front[7].setVisible(false);
					click[6]=false;
					click[7]=false;
					check[6]=true;
					check[7]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
			}
			else if(click[7] == true)
			{
				if(click[0] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[1] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[2] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[3] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[4] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[5] == true)
				{
					msg.setText("Try again");
					reset.setVisible(true);
				}
				else if(click[6] == true)
				{
					back[6].setVisible(false);
					back[7].setVisible(false);
					front[6].setVisible(false);
					front[7].setVisible(false);
					click[6]=false;
					click[7]=false;
					check[6]=true;
					check[7]=true;
					c1 = false; c2 = false;
					msg.setText("Correct");
				}
			}
		}
		
		if(check[0] == true && check[1] == true && check[2] == true && check[3] == true && check[4] == true && check[5] == true && check[6] == true && check[7] == true)
		{
			msg.setText("THANK YOU FOR PLAYING");
			JOptionPane.showMessageDialog(null, "                             YOU GOT IT","CARD",JOptionPane.DEFAULT_OPTION);
			setVisible(false);
			new card();
		}
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
	public static void main(String[] args)
	{
		new card();
	}
}
