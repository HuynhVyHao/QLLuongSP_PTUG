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

public class FrmHopDongTimKiem extends JPanel {
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FrmHopDongTimKiem() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00CCM KI\u1EBEM S\u1EA2N PH\u1EA8M");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(289, 23, 172, 27);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E3 H\u0110:");
		lblNewLabel_1.setBounds(145, 85, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ng\u00E0y L\u1EADp H\u0110:");
		lblNewLabel_2.setBounds(145, 131, 67, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EAn Kh\u00E1ch:");
		lblNewLabel_3.setBounds(356, 81, 57, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ng\u00E0y Giao H\u0110:");
		lblNewLabel_4.setBounds(356, 131, 71, 14);
		add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(201, 77, 102, 22);
		add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(442, 78, 186, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00CCM");
		btnNewButton.setBounds(522, 169, 89, 36);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 215, 725, 186);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã HĐ", "Tên KH", "Mã NV", "Tên NV", "Ngày Lập HĐ", "Ngày Giao HĐ"
			}
		));

	}
}
