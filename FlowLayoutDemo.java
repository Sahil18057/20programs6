import java.awt.*;
import javax.swing.*;


public class FlowLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4;

	public FlowLayoutDemo()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		b1=new JButton("One");
		b2=new JButton("Two");
        b3=new JButton("Three");
		b4=new JButton("Four");
		add(b1);
		add(b2);
        add(b3);
		add(b4);
	}
	public static void main(String args[])
	{
		FlowLayoutDemo bd = new FlowLayoutDemo();
		bd.setSize(400,400);
		bd.setVisible(true);
	}
}
