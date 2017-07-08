/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau3;

/**
 *
 * @author HM
 */
public class Cau3 {

    /**
     * Viết chương trình thòa mãn các yêu cầu sau: a.	Xây dựng một phương thức
     * để xác định xem một số nguyên N có phải là số chẵn và chia hết cho 3 hay
     * không. b.	Sử dụng phương thức vừa viết ở trên để tìm in ra màn hình số
     * nguyên N thỏa mãn điều kiện là số chẵn và chia hết cho 3 của dãy số
     * nguyên A, dãy số được cho trực tiếp trong mã lệnh (ví dụ: int
     * a[20]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20})
     *
     *
     */
    private static boolean Kiemtra(int i) {
        if (i % 3 == 0 && i % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < a.length; i++) {
            if (Kiemtra(a[i]) == true) {
                System.out.println("[" + a[i] + "]");
            }
        }
    }
}
