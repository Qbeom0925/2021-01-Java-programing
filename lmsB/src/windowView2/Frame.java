package windowView2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		JButton btn1 = new JButton("Click me!!");
		JButton btn2 = new JButton("Exit");
		JTextArea textArea = new JTextArea();
		JTextField textField = new JTextField(200);
		JPanel btnPanel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(textArea, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textArea.getText());
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		frame.add(panel);
		
		
		frame.setResizable(false); //사이즈가 변경이 가능한지 체크
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension (840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);  //가운데
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
