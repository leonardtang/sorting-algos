import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
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
		//this.arr = // some rectangle
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


	public void paintComponent(Graphics g) { // random heights
		super.paintComponent(g);
		setBackground(Color.blue);
		
		for(int i = 0; i < numRect; i++) {
			
		}
		
	}
		
	
	
}
