package windowView2;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lesson7 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("talbe prac.");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"id", "name", "country"};
		Object[][] data = new Object[][]{
			{"1", "KB","Korea"},
			{"2","sunny","usa"},
			{"3","jhon","Japne"}
		};
		
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		table.setFillsViewportHeight(true);
		
		
		
		panel.add(new JScrollPane(table));
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
