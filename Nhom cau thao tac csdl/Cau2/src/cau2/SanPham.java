/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HM
 */
public class SanPham {
    private  String Masp;
    private String Tensp;
    private long dongia;
    Csdl csdl;

    public SanPham() {
    }

    public SanPham(String Masp, String Tensp, long dongia) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.dongia = dongia;
    }
    

    public String getMasp() {
        return Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public long getDongia() {
        return dongia;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }
    
     public  ArrayList<SanPham> SanPhamList() {
        ArrayList<SanPham> SanPhamList = new ArrayList<SanPham>();
        try {
            Connection con = csdl.getConnection();
            String query1 = "SELECT * FROM SanPham";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
          
            while (rs.next()) {
                SanPham nv = new SanPham(rs.getString("MaSP"), rs.getString("tenSP"),rs.getInt("DonGia"));
                SanPhamList.add(nv);
            }
            con.close();
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, c);
        }
        
        return SanPhamList;
    }
}
