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
public class Cau3 {

    /**
     * Vi?t ch??ng trình thòa mãn các yêu c?u sau: a.	Xây d?ng m?t ph??ng th?c
     * ?? xác ??nh xem m?t s? nguyên N có ph?i là s? ch?n và chia h?t cho 3 hay
     * không. b.	S? d?ng ph??ng th?c v?a vi?t ? trên ?? tìm in ra màn hình s?
     * nguyên N th?a mãn ?i?u ki?n là s? ch?n và chia h?t cho 3 c?a dãy s?
     * nguyên A, dãy s? ???c cho tr?c ti?p trong mã l?nh (ví d?: int
     * a[20]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20})
     *
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
