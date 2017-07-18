/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HM
 */
public class NhanVien {

    private String MaNV, tenNV;
    private int tuoi;
    Csdl csdl;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String tenNV, int tuoi) {
        this.MaNV = MaNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getTuoi(int i) {
        return Integer.toString(tuoi);
   
    }
    public int  getTuoi() {
        return tuoi;
   
    }

    public ArrayList<NhanVien> nhanvienList() {
        ArrayList<NhanVien> NhanVienList = new ArrayList<NhanVien>();
        try {
            Connection con = csdl.getConnection();
            String query1 = "SELECT * FROM NhanVien";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
          
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString("MaNV"), rs.getString("tenNV"),rs.getInt("tuoi"));
                NhanVienList.add(nv);
            }
            con.close();
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, c);
        }
        
        return NhanVienList;
    }
}
