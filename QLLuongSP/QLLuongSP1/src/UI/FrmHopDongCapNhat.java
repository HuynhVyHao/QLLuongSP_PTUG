package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class FrmHopDongCapNhat extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	private JTextField textField_3;
	private JTable table_2;

	/**
	 * Create the panel.
	 */
	public FrmHopDongCapNhat() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1EE2P \u0110\u1ED2NG");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(344, 0, 88, 34);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 H\u0110:");
		lblNewLabel_1.setBounds(28, 41, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T\u00EAn Kh\u00E1ch H\u00E0ng:");
		lblNewLabel_2.setBounds(28, 66, 82, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn Nh\u00E2n Vi\u00EAn:");
		lblNewLabel_3.setBounds(28, 91, 82, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ng\u00E0y L\u1EADp H\u0110:");
		lblNewLabel_4.setBounds(28, 128, 82, 14);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(111, 38, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 63, 225, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(111, 87, 225, 22);
		add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Ng\u00E0y Giao H\u0110:");
		lblNewLabel_5.setBounds(182, 128, 71, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0110\u01A1n Gi\u00E1:");
		lblNewLabel_6.setBounds(182, 156, 46, 14);
		add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 153, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(407, 45, 381, 144);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã SP", "Tên SP", "Kiểu Dáng", "Chất Liệu"
			}
		));
		
		JButton btnNewButton = new JButton("L\u00E0m M\u1EDBi");
		btnNewButton.setBounds(250, 206, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("In");
		btnNewButton_1.setBounds(307, 275, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X\u00F3a ");
		btnNewButton_2.setBounds(208, 275, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("S\u1EEDa");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(108, 275, 89, 23);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Th\u00EAm");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(10, 275, 89, 23);
		add(btnNewButton_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(407, 243, 381, 80);
		add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã SP", "Tên SP", "Số Lượng"
			}
		));
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(567, 207, 88, 20);
		add(spinner);
		
		JLabel lblNewLabel_7 = new JLabel("M\u00E3 NV:");
		lblNewLabel_7.setBounds(207, 41, 34, 14);
		add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(250, 38, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 337, 784, 142);
		add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã HĐ", "Tên KH", "Mã NV", "Tên NV", "Ngày Lập", "Ngày Giao", "Đơn Giá"
			}
		));

	}

}
