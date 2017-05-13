package DrawRobot;
import javax.swing.*;
import java.awt.*;
public class Panel1 extends JPanel {
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		int grlinii;
		grlinii = 2;
		BasicStroke dim2 = new BasicStroke(grlinii);
		g2.setStroke(dim2);
		g2.drawLine(188, 0, 188, 400);
		g2.drawLine(0, 188, 400, 188);
		g2.setColor(Color.RED);
		g2.fillOval(188, 120, 68, 68);
		g2.setColor(Color.BLUE);
		g2.fillOval(120, 188, 68, 68);
	}
}
