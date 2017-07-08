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
     * Viết chương trình thòa mãn các yêu cầu sau:
a.	Xây dựng một phương thức để xác định xem một số nguyên N có phải là số chẵn và chia hết cho 3 hay không.
b.	Sử dụng phương thức vừa viết ở trên để tìm 1000 số nguyên N thỏa mãn điều kiện là số chẵn và chia hết cho 3.

     */
    private static boolean Kiemtra(int i){
        if(i%3==0 && i%2==0)return true;return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int dem=0;
        int i=6;
        while(dem<1000){
            if(Kiemtra(i)==true){
                dem++; System.out.println(dem+"["+i+"]");
            }
               i++;
        }
    }
    
}
