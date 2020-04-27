package BankATMGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class GUIUserRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnRegister;
	private JTextField textEmail;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblEmail;

	/**
	 * Create the frame.
	 */
	public GUIUserRegister() {
		setTitle("Create a customer account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeadline = new JLabel("<html>\r\nPlease enter your username and password!\r\n</html>");
		lblHeadline.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblHeadline.setBounds(194, 28, 420, 100);
		contentPane.add(lblHeadline);
		
		textField = new JTextField("");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Consolas", Font.PLAIN, 20));
		textField.setToolTipText("");
		textField.setBounds(240, 150, 290, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password\r\n");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Consolas", Font.PLAIN, 20));
		passwordField.setBounds(240, 240, 290, 60);
		contentPane.add(passwordField);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setVisible(false);
					GUIHomepage frame = new GUIHomepage();
					frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnBack.setBounds(459, 443, 270, 60);
		contentPane.add(btnBack);
		
		btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnRegister.setBounds(81, 443, 270, 60);
		contentPane.add(btnRegister);
		
		textEmail = new JTextField();
		textEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textEmail.setToolTipText("");
		textEmail.setFont(new Font("Consolas", Font.PLAIN, 20));
		textEmail.setColumns(10);
		textEmail.setBounds(240, 330, 290, 60);
		contentPane.add(textEmail);
		
		lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Consolas", Font.BOLD, 20));
		lblUsername.setBounds(100, 160, 110, 40);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Consolas", Font.BOLD, 20));
		lblPassword.setBounds(100, 255, 110, 40);
		contentPane.add(lblPassword);
		
		lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Consolas", Font.BOLD, 20));
		lblEmail.setBounds(100, 340, 110, 40);
		contentPane.add(lblEmail);
	}

}
