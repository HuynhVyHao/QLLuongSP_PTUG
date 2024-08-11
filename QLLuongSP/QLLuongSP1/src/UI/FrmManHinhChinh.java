package UI;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.BorderLayout;

public class FrmManHinhChinh extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane,subPanel;
	private JTabbedPane tabbedPane;
	private FrmCapNhatNV frmCapNhatNV;
	private TrangChu trangchu;
	private FrmTimKiemNV frmTimKiemNV;
	private FrmChamCongNV frmChamCongNV;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManHinhChinh frame = new FrmManHinhChinh();
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
	public FrmManHinhChinh() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("HỆ THỐNG QUẢN LÝ LƯƠNG SẢN PHẨM");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		frmCapNhatNV=new FrmCapNhatNV();
		trangchu=new TrangChu();
		frmTimKiemNV=new FrmTimKiemNV();
		frmChamCongNV=new FrmChamCongNV();
		//setIcon
		
		URL urliconHome=FrmManHinhChinh.class.getResource("Home.png");
		Image img=Toolkit.getDefaultToolkit().createImage(urliconHome);
		this.setIconImage(img);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 255, 255));
		menuBar.setBounds(0, 0, 965, 40);
	
		contentPane.add(menuBar);
		
		JMenu mnTrangChu = new JMenu("Trang chủ");
		
		mnTrangChu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnTrangChu);
		
		JMenu mnNhanVien = new JMenu("Nhân Viên");
		mnNhanVien.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNhanVien.setBackground(new Color(255, 0, 0));
		mnNhanVien.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrmManHinhChinh.class.getResource("nhanvien.png"))));
	
		menuBar.add(mnNhanVien);
		
		JMenuItem mntmCapNhat = new JMenuItem("Cập nhật");
		mntmCapNhat.setBorderPainted(true);
		mntmCapNhat.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnNhanVien.add(mntmCapNhat);
		
		JMenuItem mntmTimKiem = new JMenuItem("Tìm Kiếm");
		
		mntmTimKiem.setBorderPainted(true);
		mntmTimKiem.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnNhanVien.add(mntmTimKiem);
		
		JMenuItem mntmChamCong = new JMenuItem("Chấm Công");
		
		mntmChamCong.setBorderPainted(true);
		mntmChamCong.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnNhanVien.add(mntmChamCong);
		
		JMenuItem mntmLuongNV = new JMenuItem("Lương");
		mntmLuongNV.setBorderPainted(true);
		mntmLuongNV.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnNhanVien.add(mntmLuongNV);
		
		JMenu mnCongNhan = new JMenu("Công Nhân");
		mnCongNhan.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnCongNhan.setBackground(Color.RED);
		mnCongNhan.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrmManHinhChinh.class.getResource("congnhan.png"))));
		menuBar.add(mnCongNhan);
		
		JMenuItem mntmCapNhatCN = new JMenuItem("Cập nhật");
		mntmCapNhatCN.setHorizontalAlignment(SwingConstants.LEFT);
		mntmCapNhatCN.setForeground(Color.BLACK);
		mntmCapNhatCN.setBorderPainted(true);
		mntmCapNhatCN.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mntmCapNhatCN.setBackground(new Color(255, 255, 255));
		mnCongNhan.add(mntmCapNhatCN);
		
		JMenuItem mntmTimKiemCN = new JMenuItem("Tìm Kiếm");
		mntmTimKiemCN.setBorderPainted(true);
		mntmTimKiemCN.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnCongNhan.add(mntmTimKiemCN);
		
		JMenuItem mntmChamCongCN = new JMenuItem("Chấm Công");
		mntmChamCongCN.setBorderPainted(true);
		mntmChamCongCN.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnCongNhan.add(mntmChamCongCN);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Phân Công");
		mntmNewMenuItem.setBorderPainted(true);
		mntmNewMenuItem.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnCongNhan.add(mntmNewMenuItem);
		
		JMenuItem mntmLuongCN = new JMenuItem("Lương");
		mntmLuongCN.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mntmLuongCN.setBorderPainted(true);
		mnCongNhan.add(mntmLuongCN);
		
		JMenu mnSanPham = new JMenu("Sản Phẩm");
		mnSanPham.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnSanPham.setBackground(Color.RED);
		mnSanPham.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrmManHinhChinh.class.getResource("dongho.png"))));
		menuBar.add(mnSanPham);
		
		JMenuItem mntmCapNhatSP = new JMenuItem("Cập nhật");
		mntmCapNhatSP.setHorizontalAlignment(SwingConstants.LEFT);
		mntmCapNhatSP.setForeground(Color.BLACK);
		mntmCapNhatSP.setBorderPainted(true);
		mntmCapNhatSP.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mntmCapNhatSP.setBackground(new Color(255, 255, 255));
		mnSanPham.add(mntmCapNhatSP);
		
		JMenuItem mntmTimKiemSP = new JMenuItem("Tìm Kiếm");
		mntmTimKiemSP.setBorderPainted(true);
		mntmTimKiemSP.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnSanPham.add(mntmTimKiemSP);
		
		JMenuItem mntmCongDoan = new JMenuItem("Công Đoạn");
		mntmCongDoan.setBorderPainted(true);
		mntmCongDoan.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnSanPham.add(mntmCongDoan);
		
		JMenu mnHopDong = new JMenu("Hợp Đồng");
		mnHopDong.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnHopDong.setBackground(Color.RED);
		mnHopDong.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrmManHinhChinh.class.getResource("hopdong.png"))));
		menuBar.add(mnHopDong);
		
		JMenuItem mntmCapNhatHD = new JMenuItem("Cập nhật");
		mntmCapNhatHD.setHorizontalAlignment(SwingConstants.LEFT);
		mntmCapNhatHD.setForeground(Color.BLACK);
		mntmCapNhatHD.setBorderPainted(true);
		mntmCapNhatHD.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mntmCapNhatHD.setBackground(new Color(255, 255, 255));
		mnHopDong.add(mntmCapNhatHD);
		
		JMenuItem mntmTimKiemHD = new JMenuItem("Tìm Kiếm");
		mntmTimKiemHD.setBorderPainted(true);
		mntmTimKiemHD.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnHopDong.add(mntmTimKiemHD);
		
		JMenu mnThongKe = new JMenu("Thống Kê");
		mnThongKe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnThongKe.setBackground(Color.RED);
		mnThongKe.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrmManHinhChinh.class.getResource("thongke.png"))));
		menuBar.add(mnThongKe);
		
		JMenuItem mntmThongKeNV = new JMenuItem("Nhân Viên");
		mntmThongKeNV.setHorizontalAlignment(SwingConstants.LEFT);
		mntmThongKeNV.setForeground(Color.BLACK);
		mntmThongKeNV.setBorderPainted(true);
		mntmThongKeNV.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mntmThongKeNV.setBackground(new Color(255, 255, 255));
		mnThongKe.add(mntmThongKeNV);
		
		JMenuItem mntmThongKeCN = new JMenuItem("Công Nhân");
		mntmThongKeCN.setBorderPainted(true);
		mntmThongKeCN.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnThongKe.add(mntmThongKeCN);
		
		JMenuItem mntmThongKeHD = new JMenuItem("Hợp Đồng");
		mntmThongKeHD.setBorderPainted(true);
		mntmThongKeHD.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnThongKe.add(mntmThongKeHD);
		
		JMenuItem mntmThongKeSP = new JMenuItem("Sản Phảm");
		mntmThongKeSP.setBorderPainted(true);
		mntmThongKeSP.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		mnThongKe.add(mntmThongKeSP);
		
		JPanel panelBody = new JPanel();
		panelBody.setBounds(0, 39, 965, 559);
		contentPane.add(panelBody);
		panelBody.setLayout(new BorderLayout(0, 0));
		
		mntmCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBody.removeAll();
				panelBody.add(frmCapNhatNV);
				panelBody.validate();
				
				
			}
		});
		mntmTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTimKiemNV=new FrmTimKiemNV();
				panelBody.removeAll();
				panelBody.add(frmTimKiemNV);
				panelBody.validate();
			}
		});
		mntmChamCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmChamCongNV=new FrmChamCongNV();
				panelBody.removeAll();
				panelBody.add(frmChamCongNV);
				panelBody.validate();
			}
		});
		
	
		panelBody.add(trangchu);
		menuClick(trangchu);
		
		
	}
	
	
	public void menuClick(JPanel panel) {
		trangchu.setVisible(false);
		panel.setVisible(true);
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
