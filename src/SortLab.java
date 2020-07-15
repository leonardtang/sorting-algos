import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SortLab extends JFrame implements ActionListener{

	public SortLab() {
		setTitle("UsersFrame");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int goAgain;
		do {
			JFrame frame = new JFrame();
			frame.setTitle("Sorting Algos");
			frame.setSize(1100, 1100);
			frame.setResizable(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			UIManager.put("OptionPane.minimumSize", new Dimension(800,600)); 
			Font font = new Font("Arial", Font.PLAIN, 40);
			UIManager.put("OptionPane.messageFont", font);
			JLabel label = new JLabel("MESSAGE");
			label.setFont(new Font("Arial", Font.BOLD, 18));
			String numRectangles = JOptionPane.showInputDialog(label, "How many rectangles?");
			int numRect = Integer.parseInt(numRectangles);
			Rectangle[] rectangles = new Rectangle[numRect];

			for (int i = 0; i < numRect; i++) {
				rectangles[i] = new Rectangle(1050 * i / numRect + 10, (int) (Math.random() * 1000), 1050 / numRect,
						new Color(255, 204, 153));
			}

			CustomPanel panel = new CustomPanel(rectangles, new Color(153, 255, 204));

			frame.getContentPane().add(panel);
			frame.setVisible(true);
			frame.repaint();

			String[] buttons = {"Selection Sort", "Bubble Sort", "Insertion Sort"};
			int sort = JOptionPane.showOptionDialog(null, "Pick Algorithm:", "Sort Methods", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons, 0);
			if(sort == 0) 
				selectionSort(rectangles, frame);
			else if(sort == 1) 
				bubbleSort(rectangles, frame);
			else if(sort == 2) 
				insertionSort(rectangles, frame);
			
			JOptionPane.showMessageDialog(null, "Done Drawing");
			goAgain = JOptionPane.showConfirmDialog(null, "Do you want to go again?");

		} while (goAgain == JOptionPane.YES_OPTION);

	}

	public static void selectionSort(Rectangle[] arr, JFrame frame) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i; j < arr.length; j++)
				if (arr[j].compareTo(arr[minIndex]) == -1)
					minIndex = j;
			int temp = arr[minIndex].getHeight();

			flash(arr, frame, minIndex, i);
			arr[minIndex].setHeight(arr[i].getHeight());
			arr[i].setHeight(temp);
			flash(arr, frame, minIndex, i);

		}

	}

	// is this bubble sort right?
	public static void bubbleSort(Rectangle[] arr, JFrame frame) {

		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i].compareTo(arr[i + 1]) == 1) {
					swap = true;
					flash(arr, frame, i + 1, i);
					int temp = arr[i].getHeight();
					arr[i].setHeight(arr[i + 1].getHeight());
					arr[i + 1].setHeight(temp);
					flash(arr, frame, i + 1, i);
				}
			}
		}
	}

	//ask about which ones to swap
	public static void insertionSort(Rectangle[] arr, JFrame frame) {

		for (int i = 1; i < arr.length; i++) {

			int value = arr[i].getHeight();	
			int spot = i - 1;
			flash(arr, frame, spot + 1, spot + 1);

			
			while (spot > -1 && value < arr[spot].getHeight()) {
				arr[spot + 1].setHeight(arr[spot].getHeight());
				spot--;
			}
			arr[spot + 1].setHeight(value);
			flash(arr, frame, spot + 1, spot + 1);
		}
	}

	public static void flash(Rectangle[] arr, JFrame frame, int j, int i) {

		arr[i].setColor(Color.white);
		arr[j].setColor(Color.white);
		frame.repaint();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		arr[j].setColor(new Color(255, 204, 153));
		arr[i].setColor(new Color(255, 204, 153));
		frame.repaint();

	}

	



}
