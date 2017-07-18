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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giasutinhoc.vn
 */
public class Csdl {

    public static Connection conn = null;
    public static Statement stmt = null;

    private static String DB_URL = "";

    public Csdl() {
        DB_URL="jdbc:sqlserver://localhost\\sqlexpress;databaseName=QLSV;user=sa;password=123;port=1433;";
    }

    public void Open() {
        try {
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected...");
        } catch (SQLException ex) {
            Logger.getLogger(Csdl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connect fail...");
        }
    }

    /*
    thuc thi cau lenh sql update
    vidu:
    cmd="insert into table values ('a','b')"
     */
    public int ExcuteNonQuery(String cmd) {
        int rows = 0;
        System.out.println("Creating statement...");
        Open();
        System.out.println("Creating statement...");
        try {
            stmt = conn.createStatement();
            rows = stmt.executeUpdate(cmd);
        } catch (SQLException ex) {
            Logger.getLogger(Csdl.class.getName()).log(Level.SEVERE, null, ex);

        }
        System.out.println("Rows impacted : " + rows);

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Csdl.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rows;
    }

    public ResultSet executeQuery(String cmd) {
        ResultSet rs = null;

        try {
            Open();
            rs = stmt.executeQuery(cmd);
             stmt.close();
             conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Csdl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Csdl.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;
    }

    public static void main(String[] args) {
        Csdl csdl = new Csdl();
        try {

            //Execute a query
            // Let us select all the records and display them.
           String sql = "SELECT * FROM MonHoc";
          ResultSet rs=  csdl.executeQuery(sql);

            //Extract data from result set
            while (rs.next()) {
                //Retrieve by column name

                String MaMH = rs.getString("MaMH");
                String TenMH = rs.getString("TenMH");
                String DVHT = rs.getString("SoDVHT");

                //Display values
                System.out.print("MaMH: " + MaMH);
                System.out.print(", Ten mh: " + TenMH);
                System.out.print(", sdvht: " + DVHT);

            }

            //Clean-up environment
            rs.close();
            
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } finally {
            //finally block used to close resources
           
        }//end try
        System.out.println("Done!");
    }
}
