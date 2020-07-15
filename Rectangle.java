import java.awt.Color;

// how many rectangles, type of sort, whether or not to go again?


public class Rectangle implements Comparable {

	private int x;
	private int height;
	private int width;
	private Color color;
	
	public Rectangle() {
		super();
		this.x = 0;
		this.height = 10;
		this.width = 10;
		this.color = Color.orange;
	}

	public Rectangle(int x, int height, int weight, Color color) {
		super();
		this.x = x;
		this.height = height;
		this.width = weight;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return width;
	}

	public void setWeight(int weight) {
		this.width = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", height=" + height + ", weight=" + width + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		
		if(this.height < ((Rectangle) arg0).getHeight())
			return -1;
		else if(this.height > ((Rectangle) arg0).getHeight())
			return 1;
		else
			return 0;
		
	}
		
}
