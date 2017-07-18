/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author HM
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class arraylist {

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField txt_Name;
	private JLabel lblAge;
	private JTextField txt_Age;
	private JLabel lblNewLabel_1;
	private JButton btn_Edit;
	private JButton btn_Del;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arraylist window = new arraylist();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public arraylist() {
		initialize();
		load_user();
	}
	
	public Connection getConnection(){
		Connection con;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	String url = "jdbc:sqlserver://localhost;databaseName=QLBH;integratedSecurity=true";
        	String userName = "";
        	String passWord = "";
        	con = DriverManager.getConnection(url, userName, passWord);
		}catch(Exception e){
			e.getStackTrace();
			return null;
		}
		return con;
	}
	
	
	
	public void executeSQLQuery(String query, String message){
		Connection con = getConnection();
		Statement st;
		try{
			st = con.createStatement();
			if(st.executeUpdate(query) >0){
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				load_user();
				JOptionPane.showMessageDialog(null,"Data"+ message + "Successful");
			}else{
				JOptionPane.showMessageDialog(null,"Data not"+ message);
			}
		}catch(Exception ex){
			ex.getStackTrace();
		}
	}
	
	public void load_user(){
		ArrayList<NhanVien> list = userList();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Object[] row = new Object[2];
		for(int i =0; i<list.size();i++){
			row[0] = list.get(i).getMaLH();
			row[1] = list.get(i).getTenLH();
			model.addRow(row);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 612, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"Name","Age"};
		model.addColumn("Ma LH");
		model.addColumn("Ten LH");
		
		
		//Object[] data = new Object[3];
		//Object[] columnHeaders = {"Name","Age"}; 
		//model = new DefaultTableModel();
		//DefaultTableModel model = (DefaultTableModel) table.getModel();
		//model.addColumn("STT");
		//model.addColumn("Name");
		//model.addColumn("Age");
		//table.setModel(model);
		//table.setRowHeight(30);
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel.setBounds(10, 11, 576, 353);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(289, 80, 277, 262);
		panel.add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Ma LH");
		lblNewLabel.setBounds(20, 81, 46, 14);
		panel.add(lblNewLabel);
		
		txt_Name = new JTextField();
		txt_Name.setBounds(62, 78, 132, 20);
		panel.add(txt_Name);
		txt_Name.setColumns(10);
		
		lblAge = new JLabel("Ten LH");
		lblAge.setBounds(20, 115, 46, 14);
		panel.add(lblAge);
		
		txt_Age = new JTextField();
		txt_Age.setColumns(10);
		txt_Age.setBounds(62, 112, 132, 20);
		panel.add(txt_Age);
		
		JButton btn_Add = new JButton("Thêm");
		btn_Add.setIcon(new ImageIcon("D:\\add.png_16x16.png"));
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String query = "INSERT INTO LOAIHANG VALUES('"+ txt_Name.getText()+ "','"+ txt_Age.getText() +"')";
				executeSQLQuery(query,"Inserted");
				
			}
		});
		btn_Add.setBounds(10, 169, 89, 23);
		panel.add(btn_Add);
		
		lblNewLabel_1 = new JLabel("THÔNG TIN LOẠI HÀNG");
		lblNewLabel_1.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(174, 11, 248, 38);
		panel.add(lblNewLabel_1);
		
		btn_Edit = new JButton("Sửa");
		btn_Edit.setBounds(10, 203, 89, 23);
		panel.add(btn_Edit);
		
		btn_Del = new JButton("Xóa");
		btn_Del.setBounds(10, 237, 89, 23);
		panel.add(btn_Del);
	}
}
