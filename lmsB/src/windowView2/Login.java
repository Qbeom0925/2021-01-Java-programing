package windowView2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import control.CPassword;

public class Login extends JFrame {
	
	

	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID :  ");
		JLabel pawrd = new JLabel("Password :  ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log in");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pawrd);
		panel.add(txtPass);
		panel.add(logBtn);

		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				if(LoginCheck.LoginCheck(txtID.getText(), txtPass.getText())) {
		            JOptionPane.showMessageDialog(null, "성공적으로 로그인");
		         }else {
		        	 JOptionPane.showConfirmDialog(null, "로그인 실패");
		         }
				
//				if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())) {
//		            JOptionPane.showMessageDialog(null, "성공적으로 로그인");
//		         }else {
//		        	 JOptionPane.showConfirmDialog(null, "로그인 실패");
//		         }
				
			}
});
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Login();
	}
	

	
}
