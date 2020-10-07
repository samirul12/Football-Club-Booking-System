package com.nt.calender;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BookingSystem {

	private JFrame frame;
	private JTable table;
	private JTextField textMember;
	private JTextField textFieldFirst;
	private JTextField textLast;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystem window = new BookingSystem();
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
	public BookingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 764);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Football Club Booking System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 3, 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 3, 2, 2));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel visitor = new JLabel("Visitors");
		visitor.setVerticalAlignment(SwingConstants.TOP);
		visitor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_8.add(visitor, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel ticketType = new JLabel("Ticket Type");
		ticketType.setVerticalAlignment(SwingConstants.BOTTOM);
		ticketType.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_7.add(ticketType, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel gender = new JLabel("Gender");
		gender.setVerticalAlignment(SwingConstants.TOP);
		gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_9.add(gender, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNon = new JRadioButton("Non-Me...");
		rdbtnNon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_10.add(rdbtnNon, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JRadioButton btnSingle = new JRadioButton("Single");
		btnSingle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_11.add(btnSingle, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_12.add(rdbtnFemale, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnMember = new JRadioButton("Members");
		rdbtnMember.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_13.add(rdbtnMember, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JRadioButton btnAnnually = new JRadioButton("Annually");
		btnAnnually.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_14.add(btnAnnually, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_15.add(rdbtnMale, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(3, 3, 146, 102);
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_17);
		panel_17.setLayout(null);
		
		JLabel memberID = new JLabel("Member ID");
		memberID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		memberID.setBounds(10, 51, 93, 25);
		panel_17.add(memberID);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(150, 3, 146, 102);
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_18);
		panel_18.setLayout(null);
		
		textMember = new JTextField();
		textMember.setBounds(10, 52, 126, 29);
		panel_18.add(textMember);
		textMember.setColumns(10);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(297, 3, 146, 102);
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_19);
		panel_19.setLayout(null);
		
		JLabel lblClud = new JLabel("Cluds");
		lblClud.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClud.setBounds(21, 36, 89, 34);
		panel_19.add(lblClud);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(3, 106, 146, 102);
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_20);
		panel_20.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 31, 102, 32);
		panel_20.add(lblNewLabel_1);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(150, 106, 146, 102);
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_21);
		panel_21.setLayout(null);
		
		textFieldFirst = new JTextField();
		textFieldFirst.setBounds(10, 35, 126, 31);
		panel_21.add(textFieldFirst);
		textFieldFirst.setColumns(10);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBounds(297, 106, 146, 102);
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_22);
		panel_22.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Argentina", "Real Madris", "Paris", "Austrulia"}));
		comboBox.setBounds(10, 24, 126, 35);
		panel_22.add(comboBox);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBounds(3, 209, 146, 102);
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_23);
		panel_23.setLayout(null);
		
		JLabel LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LastName.setBounds(10, 29, 103, 32);
		panel_23.add(LastName);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBounds(150, 209, 146, 102);
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.add(panel_24);
		panel_24.setLayout(null);
		
		textLast = new JTextField();
		textLast.setBounds(10, 37, 126, 29);
		panel_24.add(textLast);
		textLast.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 4, 4, 4));
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNon.setSelected(false);
				btnSingle.setSelected(false);
				rdbtnFemale.setSelected(false);
				rdbtnMember.setSelected(false);
				btnAnnually.setSelected(false);
				rdbtnMale.setSelected(false);
				
				textMember.setText("");
				textFieldFirst.setText("");
				textLast .setText("");
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			DefaultTableModel model=(DefaultTableModel) table.getModel();
			model.addRow(new Object[ ] { rdbtnMember.isSelected(),rdbtnNon.isSelected(),btnSingle.isSelected(),rdbtnFemale.isSelected(),
					btnAnnually.isSelected(),rdbtnMale.isSelected(),textMember.getText(),textFieldFirst.getText(),textLast.getText(),
					comboBox.getSelectedItem().toString(),});
			}
		
			
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_6.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Confirm Booking");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[ ] { rdbtnMember.isSelected(),rdbtnNon.isSelected(),btnSingle.isSelected(),rdbtnFemale.isSelected(),
						btnAnnually.isSelected(),rdbtnMale.isSelected(),textMember.getText(),textFieldFirst.getText(),textLast.getText(),
						comboBox.getSelectedItem().toString(),});
					
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Booking System Save","Booking System",JOptionPane.OK_OPTION);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_6.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 1, 1));
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{
					"Visitor(Non-Me)","Visitor(Member)","Ticket(Single)","Ticket(Annaually)","Female","Male","MemberID","FirstName","LastName","Clud"
				}
				//{null, null, null, null, null, null, null, null, null, null},
				//{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
					"Visitor(Non-Me)","Visitor(Member)","Ticket(Single)","Ticket(Annaually)","Female","Male","MemberID","FirstName","LastName","Clud"
					
			}
	)
	{
		Class[] columnTypes=new Class[] {
				String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class
		};
		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
			
	});
		panel_26.add(table, BorderLayout.CENTER);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_25);
		panel_25.setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getSelectedRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data to delete","Booking System",JOptionPane.OK_OPTION);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Select a row to delete","Booking System",JOptionPane.OK_OPTION);
					}
				}
					else 
					{
						model.removeRow(table.getSelectedRow());
					}
				}
			
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDelete.setBounds(70, 37, 144, 53);
		panel_25.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getSelectedRowCount()==0) {
						JOptionPane.showMessageDialog(null, "Booking System update confirm","Booking System",JOptionPane.OK_OPTION);
					}
				}
				
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnUpdate.setBounds(361, 37, 144, 53);
		panel_25.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNon.setSelected(false);
				btnSingle.setSelected(false);
				rdbtnFemale.setSelected(false);
				rdbtnMember.setSelected(false);
				btnAnnually.setSelected(false);
				rdbtnMale.setSelected(false);
				
				textMember.setText("");
				textFieldFirst.setText("");
				textLast .setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(706, 37, 144, 53);
		panel_25.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if want to exit ","Booking System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1041, 49, 144, 41);
		panel_25.add(btnExit);
	}
}
