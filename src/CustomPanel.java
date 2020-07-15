import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

public class CustomPanel extends JPanel {

	private Rectangle[] arr;
	private Color color;

	public CustomPanel(Rectangle[] arr, Color c) {

		this.arr = arr;
		this.color = c;

	}

	public CustomPanel() {
		super();
		this.arr = new Rectangle[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = new Rectangle();
		this.color = Color.blue;
	}

	public Rectangle[] getArr() {
		return arr;
	}

	public void setArr(Rectangle[] arr) {
		this.arr = arr;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CustomPanel [arr=" + Arrays.toString(arr) + ", color=" + color + "]";
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(color);

		Graphics2D g2 = (Graphics2D) g;
		for (int i = 0; i < arr.length; i++) {
			g2.setStroke(new BasicStroke(2));
			g2.setColor(Color.black);
			g2.drawRect(arr[i].getX(), 1000 - arr[i].getHeight(), arr[i].getWidth(), arr[i].getHeight());
			g.setColor(arr[i].getColor());
			g.fillRect(arr[i].getX(), 1000 - arr[i].getHeight(), arr[i].getWidth(), arr[i].getHeight());
		}

	}

}
