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
public class Cau1 {

    /**
     * @param args the command line arguments
     */
    private static boolean checkSNT(int i){
        double k =Math.sqrt(i);
        if(i<=1) {return false;}
        if(i<4){return true;}
        if(i%2==0 && i>2) return false;
        for(int j=2; j<=k;j++ ){
            if(i%j==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int dem=0;
        int i=1;
        while (dem<1000){
            if(checkSNT(i)==true){
                dem++;
                System.out.println(dem+"["+i+"] ");
            }
            i++;
                
            }
    }
    
}
