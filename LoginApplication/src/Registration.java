import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBounds(10, 64, 205, 35);
		contentPane.add(user);
		user.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 137, 205, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 220, 205, 35);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 42, 158, 23);
		contentPane.add(lblNewLabel);
		
		JLabel email = new JLabel("Email");
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setBounds(10, 109, 158, 23);
		contentPane.add(email);
		
		JLabel pass = new JLabel("Password");
		pass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pass.setBounds(10, 187, 158, 23);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Registration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("org.postgresql.Driver");
					Connection con=DriverManager.getConnection("jdbc:postgresql:samiruldb", "postgres","root");
					PreparedStatement ps=con.prepareStatement("insert into samirul123 (sname,email,password) values(?,?,?)");
					ps.setString(1, user.getText());
					ps.setString(2, email.getText());
					ps.setString(3, pass.getText());
					int x=ps.executeUpdate();
					if(x>0) {
						System.out.println("Registration done successfully");
					}
					System.out.println("Registration Failed");
					
					
				}
				catch(Exception e1) {
					System.out.println(e1);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(45, 293, 136, 35);
		contentPane.add(btnNewButton);
	}
}
