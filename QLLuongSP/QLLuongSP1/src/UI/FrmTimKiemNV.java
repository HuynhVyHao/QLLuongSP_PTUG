package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class FrmTimKiemNV extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public FrmTimKiemNV() {
		setBounds(0, 0, 965, 559);
		setVisible(true);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 286, 945, 262);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã NV", "Họ Tên NV", "Giới tính", "Địa chỉ","Đơn vị"
			}
		));
		
		JLabel lblmaNV = new JLabel("Mã NV:");
		lblmaNV.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblmaNV.setBounds(125, 111, 46, 14);
		add(lblmaNV);
		
		JLabel lblhoTenNV = new JLabel("Họ Tên NV:");
		lblhoTenNV.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhoTenNV.setBounds(326, 111, 75, 14);
		add(lblhoTenNV);
		
		JLabel lbgioiTinh = new JLabel("Giới Tinh:");
		lbgioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbgioiTinh.setBounds(125, 177, 56, 14);
		add(lbgioiTinh);
		
		JLabel lbldiaChi = new JLabel("Địa chỉ:");
		lbldiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbldiaChi.setBounds(355, 177, 46, 14);
		add(lbldiaChi);
		
		JLabel lbldonVi = new JLabel("Đơn Vị:");
		lbldonVi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbldonVi.setBounds(588, 177, 46, 14);
		add(lbldonVi);
		
		textField = new JTextField();
		textField.setBounds(181, 108, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(422, 109, 148, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Nam ", "Nữ"}));
		comboBox.setBounds(191, 174, 76, 22);
		add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(422, 175, 148, 20);
		add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Tài chính", "Sản xuất", "Marketing"}));
		comboBox_1.setBounds(644, 174, 75, 22);
		add(comboBox_1);
		
		JButton btnTim = new JButton("Tìm Kiém");
		btnTim.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTim.setBounds(630, 232, 119, 23);
		add(btnTim);
		
		JLabel lblNewLabel = new JLabel("Tìm Kiếm Nhân Viên");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(355, 31, 234, 29);
		add(lblNewLabel);
		
	}
}
