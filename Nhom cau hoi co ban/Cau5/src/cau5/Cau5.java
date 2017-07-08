/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau5;

/**
 *
 * @author HM
 */
public class Cau5 {

    /**
     * @param args the command line arguments
     */
   private static boolean SoChan(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < a.length; i++) {
            if (SoChan(a[i]) == true) {
                System.out.println("[" + a[i] + "]");
            }
        }
    }
    
}
