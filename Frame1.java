package DrawRobot;
import java.awt.*;
import javax.swing.*;
public class Frame1 extends JFrame {
	public Frame1()
	{
		Container contentPane = getContentPane();
		setBounds(50,100,400,400);
		setTitle("Frame 1 ");
		Panel1 panel1 = new Panel1();
		contentPane.add(panel1);
	}
}
