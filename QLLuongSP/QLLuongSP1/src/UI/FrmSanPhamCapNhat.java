package UI;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;

public class FrmSanPhamCapNhat extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public FrmSanPhamCapNhat() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ki\u1EC3u D\u00E1ng:\r\n");
		lblNewLabel.setBounds(133, 125, 59, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1EA2N PH\u1EA8M");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(341, 21, 90, 23);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E3 SP:");
		lblNewLabel_2.setBounds(133, 79, 46, 25);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn S\u1EA3n Ph\u1EA9m:\r\n");
		lblNewLabel_3.setBounds(341, 79, 80, 25);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ch\u1EA5t Li\u1EC7u:");
		lblNewLabel_4.setBounds(341, 125, 59, 25);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("S\u1ED1 L\u01B0\u1EE3ng:\r\n");
		lblNewLabel_5.setBounds(557, 125, 59, 25);
		add(lblNewLabel_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(626, 123, 108, 23);
		add(spinner_1);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBounds(133, 228, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("S\u1EEDa");
		btnNewButton_1.setBounds(287, 228, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X\u00F3a ");
		btnNewButton_2.setBounds(437, 228, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X\u00F3a R\u1ED7ng");
		btnNewButton_3.setBounds(594, 228, 89, 23);
		add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 290, 833, 151);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		
		textField = new JTextField();
		textField.setBounds(175, 81, 108, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 127, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(440, 81, 294, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(440, 127, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);

	}
}
