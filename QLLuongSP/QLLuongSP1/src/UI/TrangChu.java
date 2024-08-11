package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class TrangChu extends JPanel {

	/**
	 * Create the panel.
	 */
	public TrangChu() {
		setLayout(null);
		setBounds(0, 00, 965, 559);
		
		JLabel lbIMG = new JLabel("");
		lbIMG.setIcon(new ImageIcon(TrangChu.class.getResource("/image/trangchu.jpg")));
		lbIMG.setBounds(10, 0, 945, 559);
		add(lbIMG);
		setVisible(true);

	}
}
