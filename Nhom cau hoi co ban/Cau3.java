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
     * Vi?t ch??ng tr�nh th�a m�n c�c y�u c?u sau: a.	X�y d?ng m?t ph??ng th?c
     * ?? x�c ??nh xem m?t s? nguy�n N c� ph?i l� s? ch?n v� chia h?t cho 3 hay
     * kh�ng. b.	S? d?ng ph??ng th?c v?a vi?t ? tr�n ?? t�m in ra m�n h�nh s?
     * nguy�n N th?a m�n ?i?u ki?n l� s? ch?n v� chia h?t cho 3 c?a d�y s?
     * nguy�n A, d�y s? ???c cho tr?c ti?p trong m� l?nh (v� d?: int
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
