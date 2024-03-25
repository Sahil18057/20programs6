import java.awt.*;
import javax.swing.*;


public class GridLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4;

	public GridLayoutDemo()
	{
		setLayout(new GridLayout(2,2));
		b1=new JButton("Apple");
		b2=new JButton("Ball");
        b3=new JButton("Cat");
		b4=new JButton("Dog");
		add(b1);
		add(b2);
        add(b3);
		add(b4);
        
	}
	public static void main(String args[])
	{
		GridLayoutDemo bd = new GridLayoutDemo();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
}