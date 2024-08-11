package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class FrmSanPhamTimKiem extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FrmSanPhamTimKiem() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00CCM KI\u1EBEM S\u1EA2N PH\u1EA8M");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(329, 0, 172, 27);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 SP:");
		lblNewLabel_1.setBounds(145, 85, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ki\u1EC3u D\u00E1ng:");
		lblNewLabel_2.setBounds(145, 131, 58, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn SP:");
		lblNewLabel_3.setBounds(356, 85, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ch\u1EA5t li\u1EC7u:");
		lblNewLabel_4.setBounds(356, 131, 46, 14);
		add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(201, 77, 102, 22);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(201, 128, 102, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(412, 78, 254, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(412, 128, 136, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00CCM");
		btnNewButton.setBounds(577, 169, 89, 27);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 246, 744, 170);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã SP", "Tên SP", "Kiểu Dáng", "Chất Lượng", "Số Lượng"
			}
		));

	}
}
