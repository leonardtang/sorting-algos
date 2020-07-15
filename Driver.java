import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.setTitle("Frames");
		frame.setSize(1000, 1000);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String numRectangles = JOptionPane.showInputDialog("How many snowflakes?");
		int numRect = Integer.parseInt(numRectangles);
		Rectangle[] rectangles = new Rectangle[numRect]; 
		CustomPanel 
		
		for(int i = 0; i < numRect; i++) {
			rectangles[i] = new Rectangle(i*10, (int)(Math.random()*1000), 1000/numRect, Color.ORANGE);
					
		}
		
		
		
		frame.getContentPane().add();
		
		
		
		
		JOptionPane.showMessageDialog(null, "Done Drawing");
		goAgain = JOptionPane.showConfirmDialog(null, "Do you want to go again?");
		
		 while (goAgain == JOptionPane.YES_OPTION);
	}

}
