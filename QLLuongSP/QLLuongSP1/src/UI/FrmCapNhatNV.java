package UI;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCapNhatNV extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public FrmCapNhatNV() {
		setBounds(0, 00, 850, 570);
		setVisible(true);
		setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 250, 827, 309);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã NV", "Họ tên NV", "SDT", "Dia Chi", "Phai", "Luong CB", "Đơn vị", "Ngày vào làm"
			}
		));
		
		JLabel lblNewLabel = new JLabel("Mã NV:");
		lblNewLabel.setBounds(37, 35, 46, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 33, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("SDT:");
		lblNewLabel_1.setBounds(37, 69, 46, 14);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Giới Tính:");
		lblNewLabel_2.setBounds(37, 116, 61, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Họ Tên NV:");
		lblNewLabel_3.setBounds(225, 32, 86, 20);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Địa Chỉ:");
		lblNewLabel_4.setBounds(225, 66, 54, 20);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Lương CB:");
		lblNewLabel_5.setBounds(213, 116, 71, 14);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 33, 217, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 64, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(303, 67, 217, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(108, 112, 71, 22);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Đơn Vị:");
		lblNewLabel_6.setBounds(594, 35, 54, 14);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ngày Vào Làm:");
		lblNewLabel_7.setBounds(594, 69, 98, 14);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(702, 31, 98, 22);
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tài Chính", "Sản Xuất", "Marketting"}));
		add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(702, 67, 98, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(312, 114, 115, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Danh Sách Nhân Viên");
		lblNewLabel_8.setBounds(327, 201, 241, 50);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 24));
		add(lblNewLabel_8);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(200, 177, 71, 23);
		add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSua.setBounds(291, 177, 71, 23);
		add(btnSua);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(386, 177, 71, 23);
		add(btnXoa);
		
		JButton btnXoaRong = new JButton("Xóa rỗng");
		btnXoaRong.setBounds(497, 177, 86, 23);
		add(btnXoaRong);

	}
	
}
