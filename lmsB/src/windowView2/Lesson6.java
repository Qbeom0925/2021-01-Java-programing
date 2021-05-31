package windowView2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lesson6 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson6 window = new Lesson6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Lesson6");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel StartPage = new JPanel();
		StartPage.setBounds(0, 0, 796, 573);
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);
		
		JButton btnNext = new JButton("Go to Next");

		btnNext.setBounds(119, 209, 288, 153);
		StartPage.add(btnNext);
		
		JPanel endpage = new JPanel();
		endpage.setBounds(0, 0, 796, 573);
		frame.getContentPane().add(endpage);
		endpage.setLayout(null);
		
		JButton btnBefor = new JButton("GO TO LAST");
		btnBefor.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btnBefor.setBounds(320, 93, 433, 402);
		endpage.add(btnBefor);
		endpage.setVisible(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				endpage.setVisible(true);
				StartPage.setVisible(false);
			}
		});
		btnBefor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(true);
				endpage.setVisible(false);
				
			}
		});
		
	}
}
