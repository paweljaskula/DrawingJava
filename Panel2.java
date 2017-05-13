package DrawRobot;
import javax.swing.*;
import java.awt.*;
public class Panel2 extends JPanel{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		int grlinii;
		grlinii = 2;
		BasicStroke dim2 = new BasicStroke(grlinii);
		g2.setStroke(dim2);
		g2.drawLine(188, 0, 188, 400);
		grlinii = 11;
		BasicStroke dim = new BasicStroke(grlinii);
		g2.setStroke(dim);
		g2.setColor(Color.BLUE);
		g2.fillRect(150, 100, 75, 100);
		g2.setColor(Color.RED);
		g2.fillOval(162, 50, 50, 50);
		g2.setColor(Color.MAGENTA);
		g2.fillRect(150, 200, 20, 80);
		g2.fillRect(205, 200, 20, 80);
		g2.setColor(Color.GREEN);
		g2.drawLine(150, 105, 100, 150);
		g2.drawLine(225, 105, 275, 150);
		g2.setColor(Color.YELLOW);
		g2.fillOval(172, 60, 10, 10);
		g2.fillOval(192, 60, 10, 10);
		grlinii = 3;
		BasicStroke dim3 = new BasicStroke(grlinii);
		g2.setStroke(dim3);
		g2.drawLine(187, 65, 187, 75);
		g2.drawOval(172, 80, 30, 10);
	}
}
