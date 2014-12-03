import java.awt.Color;
import java.awt.Graphics;


public class DPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrawingPanel p = new DrawingPanel(500, 500);
		p.setBackground(Color.BLUE);
		
		Graphics g = p.getGraphics();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 40, 40);
		
		g.drawRect(0, 0, 50, 50);
	}

}
