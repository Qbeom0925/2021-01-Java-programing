package windowView2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JPanel;

public class Lesson3 {

	private JFrame frame;
	private JTextField ID;
	private JPasswordField PW;
	private JTextField ID_area;
	private JTextField PW_area;
	private JTextField Name_area;
	private JTextField add_area;
	private JTextField hak_area;
	private JTextField phone_area;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson3 window = new Lesson3();
					Lesson6 window2 = new Lesson6();
					window.frame.setVisible(false);
					window2.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 704, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel registration = new JPanel();
		registration.setBounds(0, 0, 700, 450);
		frame.getContentPane().add(registration);
		registration.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(12, 10, 676, 89);
		registration.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(22, 98, 97, 47);
		registration.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PW:");
		lblNewLabel_2_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setBounds(22, 155, 97, 47);
		registration.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uC774\uB984:");
		lblNewLabel_2_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setBounds(22, 212, 97, 47);
		registration.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\uC8FC\uC18C:");
		lblNewLabel_2_1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setBounds(22, 269, 97, 47);
		registration.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uBC88\uD638:");
		lblNewLabel_2_1_1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1.setBounds(22, 382, 97, 47);
		registration.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("\uD559\uACFC:");
		lblNewLabel_2_2_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_1.setBounds(22, 325, 97, 47);
		registration.add(lblNewLabel_2_2_1);
		
		ID_area = new JTextField();
		ID_area.setBounds(131, 98, 417, 47);
		registration.add(ID_area);
		ID_area.setColumns(10);
		
		PW_area = new JTextField();
		PW_area.setColumns(10);
		PW_area.setBounds(131, 155, 417, 47);
		registration.add(PW_area);
		
		Name_area = new JTextField();
		Name_area.setColumns(10);
		Name_area.setBounds(131, 212, 417, 47);
		registration.add(Name_area);
		
		add_area = new JTextField();
		add_area.setColumns(10);
		add_area.setBounds(131, 269, 417, 47);
		registration.add(add_area);
		
		hak_area = new JTextField();
		hak_area.setColumns(10);
		hak_area.setBounds(131, 325, 417, 47);
		registration.add(hak_area);
		
		phone_area = new JTextField();
		phone_area.setColumns(10);
		phone_area.setBounds(131, 382, 417, 47);
		registration.add(phone_area);
		
		JButton btn_re = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_re.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		btn_re.setBounds(560, 342, 128, 87);
		registration.add(btn_re);
		registration.setVisible(false);
		
		registration.setVisible(false);
		
		JPanel Miridamgi = new JPanel();
		Miridamgi.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(Miridamgi);
		

		
		JPanel main = new JPanel();
		main.setBounds(0, 0, 700, 450);
		frame.getContentPane().add(main);
		main.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(LoginCheck.LoginCheck(ID.getText(), PW.getText())) {
		            JOptionPane.showMessageDialog(null, "성공적으로 로그인");
		         }else {
		        	 JOptionPane.showConfirmDialog(null, "로그인 실패");
		         }
			}
		});
		btnNewButton.setFont(new Font("HY헤드라인M", Font.BOLD, 38));
		btnNewButton.setBounds(458, 109, 194, 81);
		main.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uBA85\uC9C0\uB300\uD559\uAD50 \uC218\uAC15\uC2E0\uCCAD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.PLAIN, 27));
		lblNewLabel.setBounds(12, 10, 676, 89);
		main.add(lblNewLabel);
		
		ID = new JTextField();
		ID.setFont(new Font("HY헤드라인M", Font.PLAIN, 24));
		ID.setColumns(10);
		ID.setBounds(147, 127, 234, 57);
		main.add(ID);
		
		JLabel lblNewLabel_1 = new JLabel("ID: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(12, 129, 123, 57);
		main.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(12, 227, 123, 57);
		main.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		
				btnNewButton_1.setFont(new Font("HY헤드라인M", Font.BOLD, 38));
				btnNewButton_1.setBounds(458, 227, 194, 81);
				main.add(btnNewButton_1);
				
				PW = new JPasswordField();
				PW.setFont(new Font("굴림", Font.PLAIN, 20));
				PW.setBounds(147, 228, 234, 57);
				main.add(PW);
				
				JButton btnNewButton_2 = new JButton("ID\uCC3E\uAE30");
				btnNewButton_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_2.setBounds(40, 337, 155, 62);
				main.add(btnNewButton_2);
				
				JButton btnNewButton_2_1 = new JButton("PW\uCC3E\uAE30");
				btnNewButton_2_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_2_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
				btnNewButton_2_1.setBounds(234, 337, 155, 62);
				main.add(btnNewButton_2_1);
				
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						registration.setVisible(true);
						main.setVisible(false);			
					}
				});
		
		JPanel ID_search = new JPanel();
		ID_search.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(ID_search);
		
		JPanel PW_search = new JPanel();
		PW_search.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(PW_search);
		Miridamgi.setVisible(false);
		ID_search.setVisible(false);
		PW_search.setVisible(false);

	}
}
