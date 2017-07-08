/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau4;

import java.util.Scanner;

/**
 *
 * @author HM
 */
public class Cau4 {

    /**
     * Viết chương trình giải phương trình bậc hai ax2+bx+c=0; giao diện console hoặc GUI tùy sinh viên lựa chọn.
     */
    private static void GPTB2(int a, int b, int c) {
        if (a == 0) {
            
            if (b==0) {
                System.out.println("Trong pt bac 2 a va b ko the cung bang 0!");
            }
                System.out.println("x=" + (float) (-c) / b);
            
            
        } else {
            int d = b * b - 4 * a * c;
            if (d <0) {
                System.out.println("PT vo nghiem");
            } else {
                System.out.println("x1= " + (float) (b - Math.sqrt((double) d)) / (2 * a));
                System.out.println("x2= " + (float) (b + Math.sqrt((double) d)) / (2 * a));
            }
        }
    }

    public static void main(String[] args) {

        int a, b, c;
        Scanner scan = new Scanner(System.in);
    
            System.out.println("Nhap a b c");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            GPTB2(a, b, c);

       
    }

}
