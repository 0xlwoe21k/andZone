package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.ImageIcon;

import java.awt.CardLayout;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JToolBar;


public class gui extends JFrame {

	private JPanel contentPane;
	public JTable table;
	private int selectedRow= 0;
	JLabel toolLabel;
	public DefaultTableModel model;
	private JTable table_1;

	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1594, 862);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton bnt_callRecord = new JButton("\u901A\u8BDD\u8BB0\u5F55");
		bnt_callRecord.setBackground(SystemColor.control);
		bnt_callRecord.setForeground(Color.BLACK);
		bnt_callRecord.setFocusPainted(false);
		bnt_callRecord.setBorderPainted(false);
		bnt_callRecord.setBounds(25,13 , 110, 100);
		bnt_callRecord.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_callRecord.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_callRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		bnt_callRecord.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Record_64px_1179932_easyicon.net.png"));
		bnt_callRecord.setToolTipText("");
		bnt_callRecord.setSelectedIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\Contact_List_65.598519888992px_1195278_easyicon.net.png"));
		contentPane.add(bnt_callRecord);
		
		JButton bnt_message = new JButton("\u77ED\u4FE1\u5185\u5BB9");
		bnt_message.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Chat_65.284894837476px_1195276_easyicon.net.png"));
		bnt_message.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_message.setToolTipText("");
		bnt_message.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_message.setForeground(Color.BLACK);
		bnt_message.setFocusPainted(false);
		bnt_message.setBorderPainted(false);
		bnt_message.setBackground(SystemColor.menu);
		bnt_message.setBounds(178, 13, 110, 100);
		contentPane.add(bnt_message);
		
		JButton bnt_File = new JButton("\u6587\u4EF6\u7BA1\u7406");
		bnt_File.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Notes_63.221702525725px_1195281_easyicon.net.png"));
		bnt_File.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_File.setToolTipText("");
		bnt_File.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_File.setForeground(Color.BLACK);
		bnt_File.setFocusPainted(false);
		bnt_File.setBorderPainted(false);
		bnt_File.setBackground(SystemColor.menu);
		bnt_File.setBounds(343, 13, 110, 100);
		contentPane.add(bnt_File);
		
		JButton bnt_addressBook = new JButton("\u901A\u8BAF\u5F55");
		bnt_addressBook.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Contact_List_65.598519888992px_1195278_easyicon.net.png"));
		bnt_addressBook.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_addressBook.setToolTipText("");
		bnt_addressBook.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_addressBook.setForeground(Color.BLACK);
		bnt_addressBook.setFocusPainted(false);
		bnt_addressBook.setBorderPainted(false);
		bnt_addressBook.setBackground(SystemColor.menu);
		bnt_addressBook.setBounds(501, 13, 110, 100);
		contentPane.add(bnt_addressBook);
		
		JButton bnt_Postion = new JButton("\u5730\u56FE\u5B9A\u4F4D");
		bnt_Postion.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Map_65.382538253825px_1195280_easyicon.net.png"));
		bnt_Postion.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_Postion.setToolTipText("");
		bnt_Postion.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_Postion.setForeground(Color.BLACK);
		bnt_Postion.setFocusPainted(false);
		bnt_Postion.setBorderPainted(false);
		bnt_Postion.setBackground(SystemColor.menu);
		bnt_Postion.setBounds(667, 13, 110, 100);
		contentPane.add(bnt_Postion);
		
		JButton bnt_callVoice = new JButton("\u901A\u8BDD\u5F55\u97F3");
		bnt_callVoice.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Call_History_55.487378640777px_1195274_easyicon.net.png"));
		bnt_callVoice.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_callVoice.setToolTipText("");
		bnt_callVoice.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_callVoice.setForeground(Color.BLACK);
		bnt_callVoice.setFocusPainted(false);
		bnt_callVoice.setBorderPainted(false);
		bnt_callVoice.setBackground(SystemColor.menu);
		bnt_callVoice.setBounds(838, 13, 110, 100);
		contentPane.add(bnt_callVoice);
		
		JButton bnt_cemera = new JButton("\u6444\u50CF\u5934\u76D1\u63A7");
		bnt_cemera.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Cam_camera_66.63670411985px_1195275_easyicon.net.png"));
		bnt_cemera.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_cemera.setToolTipText("");
		bnt_cemera.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_cemera.setForeground(Color.BLACK);
		bnt_cemera.setFocusPainted(false);
		bnt_cemera.setBorderPainted(false);
		bnt_cemera.setBackground(SystemColor.menu);
		bnt_cemera.setBounds(993, 13, 110, 100);
		contentPane.add(bnt_cemera);
		
		
		JButton bnt_ctrlPhone = new JButton("\u63A7\u5236\u624B\u673A");
		bnt_ctrlPhone.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\game_controller_64px_1132433_easyicon.net.png"));
		bnt_ctrlPhone.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_ctrlPhone.setToolTipText("");
		bnt_ctrlPhone.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_ctrlPhone.setForeground(Color.BLACK);
		bnt_ctrlPhone.setFocusPainted(false);
		bnt_ctrlPhone.setBorderPainted(false);
		bnt_ctrlPhone.setBackground(SystemColor.menu);
		bnt_ctrlPhone.setBounds(1136, 13, 110, 100);
		contentPane.add(bnt_ctrlPhone);
		
		JButton bnt_MessageIntercetion = new JButton("\u77ED\u4FE1\u622A\u53D6");
		bnt_MessageIntercetion.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\Email_64.649087221095px_1195279_easyicon.net.png"));
		bnt_MessageIntercetion.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_MessageIntercetion.setToolTipText("");
		bnt_MessageIntercetion.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_MessageIntercetion.setForeground(Color.BLACK);
		bnt_MessageIntercetion.setFocusPainted(false);
		bnt_MessageIntercetion.setBorderPainted(false);
		bnt_MessageIntercetion.setBackground(SystemColor.menu);
		bnt_MessageIntercetion.setBounds(1286, 13, 110, 100);
		contentPane.add(bnt_MessageIntercetion);
		
		JButton bnt_exit = new JButton("\u9000\u51FA");
		bnt_exit.setIcon(new ImageIcon("C:\\Users\\Jee.DESKTOP-RJAIK3I\\Desktop\\icon\\zoom_out_64px_1159932_easyicon.net.png"));
		bnt_exit.setVerticalTextPosition(SwingConstants.BOTTOM);
		bnt_exit.setToolTipText("");
		bnt_exit.setHorizontalTextPosition(SwingConstants.CENTER);
		bnt_exit.setForeground(Color.BLACK);
		bnt_exit.setFocusPainted(false);
		bnt_exit.setBorderPainted(false);
		bnt_exit.setBackground(SystemColor.menu);
		bnt_exit.setBounds(1445, 13, 110, 100);
		contentPane.add(bnt_exit);
		


		Object []columnTitle = {"手机型号","手机版本号","网络状态","地址位置","上线时间","手机端IP","内部储蓄卡状态/GB","内存/GB"};
		model = new DefaultTableModel(null,columnTitle){
			public boolean isCellEditable(int row , int column) {
				return false;
			}
		};
		//Object []tmp = {"android","4.4","wifi","123456","12:20","172.36.32.2","25/54","56/85"};
		//model.addRow(tmp);
		//设置行数
		int count = 25;
		model.setRowCount(count);
		table = new JTable(model);
		
		
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setDefaultRenderer(Object.class, tcr);
		table.setRowHeight(25);
		table.setBounds(25, 126, 1530, 640);

		
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(table);
		jScrollPane.setVisible(true);
		jScrollPane.setBounds(25, 126, 1530, 650);
		
		contentPane.add(jScrollPane);
		toolLabel = new JLabel("                                                                              2017-3-22|                                                                              by Jee|");
		toolLabel.setFont(new Font("宋体", Font.BOLD, 16));
		
		JToolBar toolBar = new JToolBar();
		toolBar.add(toolLabel);
		
		toolBar.setBackground(SystemColor.control);
		toolBar.setBounds(-14, 800, 1604, 27);
		contentPane.add(toolBar);

		
		
		

		
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				selectedRow = table.getSelectedRow();
				int column = table.getSelectedColumn();
				
				String str = (String) table.getValueAt(selectedRow,column);
				System.out.println("select :"+str);
			}
		});


	}
}
