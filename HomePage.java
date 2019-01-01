package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage hp=new HomePage();
					hp.setVisible(true);
					hp.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public HomePage() {
//		setEnabled(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 539);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u57FA\u672C\u8D44\u6599");
		mnNewMenu.setHorizontalAlignment(SwingConstants.TRAILING);
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		mnNewMenu.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu);
	
		JMenuItem SaleManData = new JMenuItem("\u9500\u552E\u5458\u8D44\u6599");
		SaleManData.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		
		mnNewMenu.add(SaleManData);
		SaleManData.addActionListener(new ActionListener() {
			                                      
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SaleManData sm=new SaleManData();
				sm.setVisible(true);
				sm.setalwaysontop(rootPaneCheckingEnabled);
				getContentPane().add(sm);
				sm.setClosable(true);
				sm.toFront();
				
			}
		});
		
		
//			SalesInformation frame = new SalesInformation();
//			frame.setVisible(true);
		
		
		JMenuItem CustomerData = new JMenuItem("\u5BA2\u6237\u8D44\u6599");
		mnNewMenu.add(CustomerData);
		CustomerData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CustomerData cus=new CustomerData();
				cus.setVisible(true);
				getContentPane().add(cus);
				cus.setClosable(true);
				cus.toFront();
			}
		});
		
		JMenuItem ProductData = new JMenuItem("\u5546\u54C1\u8D44\u6599");
		mnNewMenu.add(ProductData);
		
		JMenuItem SupplierData = new JMenuItem("\u4F9B\u5E94\u5546\u8D44\u6599");
		mnNewMenu.add(SupplierData);
		
		JMenu mnNewMenu_1 = new JMenu("\u91C7\u8D2D\u7BA1\u7406");
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem = new JMenuItem("\u91C7\u8D2D\u5355\u5F55\u5165");
		mnNewMenu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u8D27\u5355\u5F55\u5165");
		mnNewMenu_1.add(menuItem_1);
		
		JMenu DeliveryManage = new JMenu("\u9500\u552E\u7BA1\u7406");
		DeliveryManage.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(DeliveryManage);
		
		JMenuItem DeliveryLog = new JMenuItem("\u9500\u552E\u5355\u5F55\u5165");
		DeliveryManage.add(DeliveryLog);
		
		JMenuItem DeliveryBackLog = new JMenuItem("\u9000\u8D27\u5355\u5F55\u5165");
		DeliveryManage.add(DeliveryBackLog);
		
		JMenu Store = new JMenu("\u5E93\u5B58\u7BA1\u7406");
		Store.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(Store);
		
		JMenuItem StockQuery = new JMenuItem("\u5E93\u5B58\u67E5\u8BE2");
		Store.add(StockQuery);
		
		JMenu menu_5 = new JMenu("\u62A5\u8868\u5BFC\u51FA");
		menu_5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(menu_5);
		
		JMenu mnNewMenu_2 = new JMenu("\u7CFB\u7EDF\u7EF4\u62A4");
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_2);
		
		JMenu Help = new JMenu("\u5E2E\u52A9");
		Help.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		menuBar.add(Help);
		
		JMenuItem UseHelp = new JMenuItem("\u5E2E\u52A9");
		Help.add(UseHelp);
		
		JMenuItem About = new JMenuItem("\u5173\u4E8E");
		Help.add(About);
		
		JMenu menu_4 = new JMenu("");
		menuBar.add(menu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("F:/项目小图标/resource/xinxi.jpg"));
		toolBar.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("F:/项目小图标/resource/help.gif"));
		toolBar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("F:/项目小图标/resource/custbusirec.gif"));
		toolBar.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 =new JLabel(new ImageIcon("F:/项目小图标/resource/customer.gif"));
		toolBar.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(new ImageIcon("F:/项目小图标/resource/product.gif"));
		toolBar.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 =new JLabel(new ImageIcon("F:/项目小图标/resource/retsell.gif"));
		toolBar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel(new ImageIcon("F:/项目小图标/resource/purchasegather.gif"));
		toolBar.add(lblNewLabel_7);
	}

}
