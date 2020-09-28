/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

/**
 *
 * @author Alvinkrwn
 */
public class TUGASPBO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Keramik h1 = new Keramik(0.3, 0.3);
        System.out.println("Luas Keramik " + h1.luasKeramik() + " satuan luas");
        
        Keramik h2 = new Keramik(100, 0.3, 0.3);
        System.out.println("Total Keramik yang dibutuhkan " + h2.totalKeramikDibutuhkan() + " pcs");
        
        Keramik h3 = new Keramik(100, 0.3, 0.3, 10);
        System.out.println("Total Box Keramik yang dibutuhkan " + h3.totalKeramikPerBox() + " box");
        
        Keramik h4 = new Keramik(100, 0.3, 0.3, 10, 54000);
        System.out.println("Total Harga Keramik A  RP " + h4.hitungTotalHargaKeramik());
        System.out.println("Daftar diatas adalah Rincian Keramik A");
        System.out.println(" ");
        System.out.println(" ");
        
        Keramik h5 = new Keramik(0.4, 0.4);
        System.out.println("Luas Keramik " + h5.luasKeramik() + " satuan luas");
        
        Keramik h6 = new Keramik(100, 0.4, 0.4);
        System.out.println("Total Keramik yang dibutuhkan " + h6.totalKeramikDibutuhkan() + " pcs");
        
        Keramik h7 = new Keramik(100, 0.4, 0.4, 5);
        System.out.println("Total Box Keramik yang dibutuhkan " + h7.totalKeramikPerBox() + " box");
        
        Keramik h8 = new Keramik(100, 0.4, 0.4, 5, 65000);
        System.out.println("Total Harga Keramik B  RP " + h8.hitungTotalHargaKeramik());
        System.out.println("Daftar diatas adalah Rincian Keramik B");
        System.out.println(" ");
        System.out.println(" ");
        
        Keramik h9 = new Keramik(0.3, 0.4);
        System.out.println("Luas Keramik " + h9.luasKeramik() + " satuan luas");
        
        Keramik h10 = new Keramik(100, 0.3, 0.4);
        System.out.println("Total Keramik yang dibutuhkan " + h10.totalKeramikDibutuhkan() + " pcs");
        
        Keramik h11 = new Keramik(100, 0.3, 0.4, 8);
        System.out.println("Total Box Keramik yang dibutuhkan " + h11.totalKeramikPerBox() + " box");
        
        Keramik h12 = new Keramik(100, 0.3, 0.4, 8, 60000);
        System.out.println("Total Harga Keramik C  RP " + h12.hitungTotalHargaKeramik());
        System.out.println("Daftar diatas adalah Rincian Keramik C");
        System.out.println(" ");
       
        System.out.println("Dari Data diatas, Pak Tejo memutuskan untuk membeli Keramik A");
        
    }
    
}
