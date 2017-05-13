package DrawRobot;
import java.awt.*;
import javax.swing.*;
public class Frame2 extends JFrame{
	public Frame2()
	{
		Container contentPane = getContentPane();
		setBounds(500,100,400,400);
		setTitle("Frame 2 ");
		Panel2 panel2 = new Panel2();
		contentPane.add(panel2);
	}
}
