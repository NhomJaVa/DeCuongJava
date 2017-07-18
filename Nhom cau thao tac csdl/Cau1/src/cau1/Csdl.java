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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author giasutinhoc.vn
 */
public class Csdl {

    public static Connection conn = null;
    public static Statement stmt = null;
    private static String connectionString = null;


    /*  public Csdl() {
        DB_URL = "jdbc:sqlserver://localhost\\sqlexpress;databaseName=QLNV;user=sa;password=123;port=1433;";
    }*/
    public static Connection getConnection() {
        Connection con;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connectionString = "jdbc:sqlserver://localhost\\sqlexpress;databaseName=QLNV;port=1433;";
            String userName = "sa";
            String passWord = "123";
            System.out.println("Connecting..");
            con = DriverManager.getConnection(connectionString, userName, passWord);
            System.out.println("Connected..");

        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Disconnect...");

            return null;
        }
        return con;
    }

    public ResultSet GetData(String str) {
        ResultSet bang = null;
        try {
            Statement lenh = this.conn.createStatement();
            bang = lenh.executeQuery(str);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi tải dữ liệu");
        }
        
        return bang;
    }

    public boolean CapNhat( PreparedStatement lenh) {
        try {
            lenh.executeUpdate();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật");
            return false;
        } 
       
        return true;
    }



    public static void main(String[] args) {
        Csdl csdl = new Csdl();
        csdl.getConnection();
      
    }
}
