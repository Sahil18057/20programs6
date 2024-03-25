import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4;

	public BorderLayoutDemo()
	{
		setLayout(new BorderLayout());
		b1=new JButton("Apple");
		b2=new JButton("Ball");
        b3=new JButton("Cat");
		b4=new JButton("Dog");
		add(b1, BorderLayout.EAST);
		add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
		add(b4, BorderLayout.SOUTH);
	}

	public static void main(String args[])
	{
		BorderLayoutDemo bd = new BorderLayoutDemo();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
	
}