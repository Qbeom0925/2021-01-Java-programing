package windowView2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import control.CLogin;
import valueObject.OHwewon;
import valueObject.OLogin;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class WVmain {

	static JFrame frame;
	private JPasswordField pw_text;
	private WEventListen wEventListen;
	private WVHweweonDeungrok wvHweweonDeungrok;
	private WVSugangsincheon wvSugangsincheon;
	private OHwewon oHwewon;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WVmain main = new WVmain();
					main.frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public WVmain() {
		initialize();
		this.wEventListen = new WEventListen();
	}
	

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlightText);
		panel.setBounds(0, 0, 686, 372);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBA85\uC9C0\uB300\uD559\uAD50 \uC218\uAC15\uC2E0\uCCAD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.PLAIN, 27));
		lblNewLabel.setBounds(12, 39, 676, 89);
		panel.add(lblNewLabel);
		
		JTextField id_text = new JTextField();
		id_text.setFont(new Font("HY헤드라인M", Font.PLAIN, 24));
		id_text.setColumns(10);
		id_text.setBounds(147, 156, 234, 57);
		panel.add(id_text);
		
		JLabel lblNewLabel_1 = new JLabel("ID: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(12, 158, 123, 57);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(12, 256, 123, 57);
		panel.add(lblNewLabel_1_1);
		
		pw_text = new JPasswordField();
		pw_text.setFont(new Font("굴림", Font.PLAIN, 20));
		pw_text.setBounds(147, 257, 234, 57);
		panel.add(pw_text);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				wvHweweonDeungrok = new WVHweweonDeungrok();
					frame.setVisible(false);
					wvHweweonDeungrok.frame.setVisible(true);
				}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("HY헤드라인M", Font.BOLD, 38));
		btnNewButton_1.setBounds(458, 256, 194, 81);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(wEventListen.login(e, id_text.getText(), pw_text.getText())!=null) {
					wvSugangsincheon = new WVSugangsincheon(wEventListen.login(e, id_text.getText(), pw_text.getText()));
					wvSugangsincheon.frame.setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("HY헤드라인M", Font.BOLD, 38));
		btnNewButton.setBounds(458, 138, 194, 81);
		panel.add(btnNewButton);
	}
}
