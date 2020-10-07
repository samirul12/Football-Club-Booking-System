package com.nt.calender;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.io.File;

import java.awt.event.ActionEvent;

public class LoginApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterFullName;
	private JTextField txtEnterEmail;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldComfirm;
	private JTextField txtEnterMobileNumber;
	private JRadioButton Male;
	private JRadioButton Female;
	private JLabel lblDateOfBirth;
	JLabel dateChooserDOB;
	
	
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginApp frame = new LoginApp();
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
	public LoginApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1241, 787);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 10, 1176, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 1156, 710);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 10, 1136, 123);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(388, 10, 678, 58);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register New User");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(244, 10, 302, 34);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\html\\logo.jpg"));
		lblNewLabel_1.setBounds(10, 10, 368, 103);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Naresh Technology ,ameerpet ,Hyderabad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(398, 78, 682, 35);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblName = new JLabel("Full Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(46, 149, 145, 30);
		panel_1.add(lblName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(79, 198, 145, 30);
		panel_1.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(46, 238, 145, 30);
		panel_1.add(lblPassword);
		
		JLabel lblComfirmPassword = new JLabel("Comfirm Password :");
		lblComfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComfirmPassword.setBounds(10, 294, 161, 30);
		panel_1.add(lblComfirmPassword);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number :");
		lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMobileNumber.setBounds(26, 350, 145, 30);
		panel_1.add(lblMobileNumber);
		
		JLabel lblGenderMale = new JLabel("Gender :");
		lblGenderMale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGenderMale.setBounds(89, 400, 145, 30);
		panel_1.add(lblGenderMale);
		
		JButton uploadImageButton = new JButton("Select Image");
		uploadImageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}

			
			
		});
		uploadImageButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		uploadImageButton.setBounds(10, 508, 149, 42);
		panel_1.add(uploadImageButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txtEnterFullName.getText();
				String email=txtEnterEmail.getText();
				String pass=passwordField.getText();
				String cPass=passwordFieldComfirm.getText();
				String mob=txtEnterMobileNumber.getText();
				String gen="Male";
				if(Female.isShowing()) {
					gen="Female";
				}
				String dob=  dateChooserDOB.getText();
				if(name.trim().equals("") || name.trim().equals("Enter Full Name") ||
						email.trim().equals("") || email.trim().equals("Enter Email") ||
						pass.trim().equals("") || pass.trim().equals("Enter Password") ||
						cPass.trim().equals("") || cPass.trim().equals("Enter Comfirm Password") ||
						mob.trim().equals("") || mob.trim().equals("Enter Mobile Number") 
						
						
						);
						
						
						
			}
		});
		btnRegister.setForeground(Color.MAGENTA);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegister.setBounds(46, 627, 100, 30);
		panel_1.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEnterFullName.setText("");
				txtEnterEmail.setText("");
				passwordField.setText("");
				passwordFieldComfirm.setText("");
				txtEnterMobileNumber.setText("");
				
				
				
				
				
			}
		});
		btnReset.setForeground(Color.CYAN);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(650, 602, 100, 30);
		panel_1.add(btnReset);
		
		JButton btnClickHereTo = new JButton("Click here to Login(To close Registration Form");
		btnClickHereTo.setForeground(Color.GREEN);
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClickHereTo.setBounds(382, 670, 402, 30);
		panel_1.add(btnClickHereTo);
		
		lblDateOfBirth = new JLabel("Date of Birth :");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDateOfBirth.setBounds(46, 455, 145, 30);
		panel_1.add(lblDateOfBirth);
		
		txtEnterFullName = new JTextField();
		txtEnterFullName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterFullName.setText("Enter Full Name");
		txtEnterFullName.setBounds(182, 153, 256, 30);
		panel_1.add(txtEnterFullName);
		txtEnterFullName.setColumns(10);
		
		txtEnterEmail = new JTextField();
		txtEnterEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterEmail.setText("Enter Email");
		txtEnterEmail.setColumns(10);
		txtEnterEmail.setBounds(182, 198, 256, 30);
		panel_1.add(txtEnterEmail);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setToolTipText("Enter Password");
		passwordField.setBounds(182, 247, 256, 30);
		panel_1.add(passwordField);
		
		passwordFieldComfirm = new JPasswordField();
		passwordFieldComfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordFieldComfirm.setToolTipText("Enter Comfirm Password");
		passwordFieldComfirm.setBounds(181, 294, 256, 30);
		panel_1.add(passwordFieldComfirm);
		
		txtEnterMobileNumber= new JTextField();
		txtEnterMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterMobileNumber.setText("Enter Mobile Number");
		txtEnterMobileNumber.setColumns(10);
		txtEnterMobileNumber.setBounds(181, 350, 256, 30);
		panel_1.add(txtEnterMobileNumber);
		
		Male = new JRadioButton("Male");
		Male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Male.isSelected())
				{
					Female.setSelected(false);
					
				}
			}
		});
		Male.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Male.setBounds(177, 408, 94, 21);
		panel_1.add(Male);
		
		Female = new JRadioButton("Female");
		Female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Female.isSelected())
				{
					Male.setSelected(false);
					
				}
				
			}
		});
		Female.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Female.setBounds(343, 408, 94, 21);
		panel_1.add(Female);
		
		JDateChooser dateChooserDOB = new JDateChooser();
		dateChooserDOB.setBounds(193, 449, 245, 30);
		panel_1.add(dateChooserDOB);
		
		JLabel lable_photo = new JLabel("");
		lable_photo.setBounds(193, 489, 258, 116);
		panel_1.add(lable_photo);
	}

	
	}


