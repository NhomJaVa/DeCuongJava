/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author HM
 */
public class Cau2 {

    /**
     * a)	Xây dựng lớp SANPHAM (sản phẩm) với các thuộc tính Mã sản phẩm, tên
     * sản phẩm, đơn giá bán; Phương thức khởi tạo có tham số để gán giá trị cho
     * các thuộc tính; Các setter/getter b)	Viết chương trình có giao diện như
     * hình dưới, Khi thêm một sản phẩm, dữ liệu đó sẽ được lưu vào biến kiểu
     * ArrayList hoặc Vector, đồng thời đưa vào bảng để hiển thị.
     *
     */
    // Code Customize jPanel1.setBorder(BorderFactory.createTitledBorder("Thêm mới"));
    /**
     * Add row to Table SanPham e = new SanPham(); e.setMasp(txt_msp.getText());
     * e.setTensp(txt_tsp.getText());
     * e.setDongiaban(Integer.parseInt(txtgia.getText()));
     *
     * DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     *
     * Vector row = new Vector(); row.add(e.getMasp()); row.add(e.getTensp());
     * row.add(e.getDongiaban()); model.addRow(row);
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

}
