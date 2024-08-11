package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FrmSanPhamCongDoan extends JPanel {
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public FrmSanPhamCongDoan() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00D4NG \u0110O\u1EA0N S\u1EA2N XU\u1EA4T");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(331, 0, 179, 44);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 C\u0110:");
		lblNewLabel_1.setBounds(26, 62, 36, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T\u00EAn C\u0110:\r\n");
		lblNewLabel_2.setBounds(26, 94, 46, 21);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gi\u00E1 C\u0110:");
		lblNewLabel_3.setBounds(26, 126, 46, 21);
		add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C\u00F4ng \u0111o\u1EA1n c\u1EA7n l\u00E0m tr\u01B0\u1EDBc");
		chckbxNewCheckBox.setBounds(40, 170, 145, 23);
		add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(205, 170, 105, 22);
		add(comboBox);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(72, 62, 114, 21);
		add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(72, 94, 114, 21);
		add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(71, 126, 114, 20);
		add(textPane_2);
		
		JLabel lblNewLabel_4 = new JLabel("M\u00E3 SP:");
		lblNewLabel_4.setBounds(205, 65, 46, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("T\u00EAn SP:");
		lblNewLabel_5.setBounds(205, 97, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("S\u1ED1 L\u01B0\u1EE3ng:");
		lblNewLabel_6.setBounds(205, 129, 56, 14);
		add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(261, 61, 67, 22);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(261, 93, 114, 22);
		add(comboBox_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(271, 126, 67, 20);
		add(spinner);
		
		JLabel lblNewLabel_7 = new JLabel("Danh s\u00E1ch s\u1EA3n ph\u1EA9m:\r\n");
		lblNewLabel_7.setBounds(441, 55, 114, 14);
		add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(441, 82, 399, 169);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã SP", "Tên SP", "Kiểu Dáng", "Chất Liệu", "Số Lượng"
			}
		));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 292, 814, 225);
		add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã CĐ", "Tên CĐ", "Giá CĐ", "Mã SP", "Tên SP", "Số Lượng", "Công Đoạn Yêu Cầu"
			}
		));
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBounds(26, 228, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("S\u1EEDa");
		btnNewButton_1.setBounds(125, 228, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X\u00F3a");
		btnNewButton_2.setBounds(224, 228, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X\u00F3a r\u1ED7ng");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(323, 228, 89, 23);
		add(btnNewButton_3);

	}
}
