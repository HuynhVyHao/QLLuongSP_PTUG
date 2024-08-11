package UI;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmThongKeCongNhan extends JPanel {

	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public FrmThongKeCongNhan() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THỐNG KÊ CÔNG NHÂN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(280, 0, 186, 29);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Th\u00E1ng:");
		lblNewLabel_1.setBounds(10, 51, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E3 NV:");
		lblNewLabel_2.setBounds(10, 85, 46, 14);
		add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 47, 59, 22);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(66, 82, 59, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("N\u0103m:");
		lblNewLabel_3.setBounds(135, 51, 46, 14);
		add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(191, 47, 59, 22);
		add(comboBox_1);
		
		JButton btnNewButton = new JButton("Th\u1ED1ng K\u00EA");
		btnNewButton.setBounds(36, 131, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("In");
		btnNewButton_1.setBounds(161, 131, 89, 23);
		add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(10, 172, 252, 303);
		add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(257, 40, 558, 114);
		add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã CN", "Tên CN", "CMND", "Ngày Sinh", "Giới Tính", "Phòng Ban", "Số Ngày Làm", "Số Ca Tăng", "Lương", "Số Sản Phẩm"
			}
		));

	}

}
