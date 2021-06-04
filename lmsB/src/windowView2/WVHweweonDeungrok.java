package windowView2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import control.CHwewonDeungrok;
import valueObject.OHwewon;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WVHweweonDeungrok {

	static JFrame frame;
	private JTextField phone_text;
	private JTextField hak_text;
	private JTextField add_text;
	private JTextField name_text;
	private JTextField pw_text;
	private JTextField id_text;

	
	public WVHweweonDeungrok() {
		initialize();
	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WVHweweonDeungrok window = new WVHweweonDeungrok();
//					window.frame.setVisible(true);
//					WVmain.frame.setVisible(false);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 686, 563);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(0, 10, 676, 89);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 128, 97, 47);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PW:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(10, 197, 97, 47);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uC774\uB984:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_2.setBounds(10, 259, 97, 47);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\uC8FC\uC18C:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(10, 329, 97, 47);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("\uD559\uACFC:");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_2_1.setBounds(10, 396, 97, 47);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uBC88\uD638:");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_2_1_1_1.setBounds(10, 465, 97, 47);
		panel.add(lblNewLabel_2_1_1_1);
		
		phone_text = new JTextField();
		phone_text.setColumns(10);
		phone_text.setBounds(119, 465, 417, 47);
		panel.add(phone_text);
		
		hak_text = new JTextField();
		hak_text.setColumns(10);
		hak_text.setBounds(119, 396, 417, 47);
		panel.add(hak_text);
		
		add_text = new JTextField();
		add_text.setColumns(10);
		add_text.setBounds(119, 329, 417, 47);
		panel.add(add_text);
		
		name_text = new JTextField();
		name_text.setColumns(10);
		name_text.setBounds(119, 259, 417, 47);
		panel.add(name_text);
		
		pw_text = new JTextField();
		pw_text.setColumns(10);
		pw_text.setBounds(119, 197, 417, 47);
		panel.add(pw_text);
		
		id_text = new JTextField();
		id_text.setColumns(10);
		id_text.setBounds(119, 128, 417, 47);
		panel.add(id_text);
		
		JButton btn_re = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WEventListen.HwewonDeungrok(e, id_text.getText(), pw_text.getText(), name_text.getText(), add_text.getText(), hak_text.getText(), phone_text.getText());
				WVmain main = new WVmain();
				frame.setVisible(false);
				main.frame.setVisible(true);
			}
		});
		
		btn_re.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		btn_re.setBounds(548, 342, 128, 170);
		panel.add(btn_re);
		
		JButton btn_back = new JButton("back");
		btn_back.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		btn_back.setBounds(12, 12, 97, 65);
		panel.add(btn_back);
	}

}
