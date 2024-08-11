package UI;

import java.awt.EventQueue;


import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLuongNhanVien extends JFrame{

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox_2;
	private JTextField textField;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLuongNhanVien frame = new FrmLuongNhanVien();
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
	public FrmLuongNhanVien() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 385, 986, 305);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(578, 74, 418, 279);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		lblNewLabel = new JLabel("LƯƠNG NHÂN VIÊN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(394, 10, 167, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(450, 251, 112, 33);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(311, 251, 112, 33);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Làm Mới\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(174, 251, 112, 33);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Tính Lương");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(36, 251, 112, 33);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Mã NV :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(56, 80, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất Cả", ""}));
		comboBox.setBounds(128, 77, 107, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã Lương :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(56, 131, 63, 15);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("Tên NV :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(277, 80, 52, 15);
		contentPane.add(lblNewLabel_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(339, 77, 196, 21);
		contentPane.add(comboBox_1);
		
		lblNewLabel_3 = new JLabel("Tháng :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(277, 131, 52, 15);
		contentPane.add(lblNewLabel_3);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(339, 128, 63, 21);
		contentPane.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(128, 129, 107, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Năm :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(413, 131, 52, 15);
		contentPane.add(lblNewLabel_4);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(462, 128, 73, 21);
		contentPane.add(comboBox_3);
		
		lblNewLabel_5 = new JLabel("Thực Lãnh :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(277, 194, 63, 15);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(339, 192, 196, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
