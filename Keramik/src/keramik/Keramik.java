/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;

/**
 *
 * @author Alvinkrwn
 */
public class Keramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // inisiasi
        HargaKeramik p1 = new HargaKeramik();
        
        p1.luastanah = 100;
        p1.ukuranA = 30;
        p1.ukuranB = 30;
        p1.jumlahsatubox = 10;
        p1.hargasatubox = 54000;
        p1.jumlahKeramik();
        p1.totalHarga();
        
        HargaKeramik p2 = new HargaKeramik();
        
        p2.luastanah = 100;
        p2.ukuranA = 40;
        p2.ukuranB = 40;
        p2.jumlahsatubox = 5;
        p2.hargasatubox = 65000;
        p2.jumlahKeramik();
        p2.totalHarga(); 
        
        HargaKeramik p3 = new HargaKeramik();
        
        p3.luastanah = 100;
        p3.ukuranA = 30;
        p3.ukuranB = 40;
        p3.jumlahsatubox = 8;
        p3.hargasatubox = 60000;
        p3.jumlahKeramik();
        p3.totalHarga();
        
        HargaKeramik p4 = new HargaKeramik();
        p4.luastanah = 100;
        p4.ukuranA = 30;
        p4.ukuranB = 30;
        p4.jumlahsatubox = 10;
        p4.hargasatubox = 54000;
        p4.pernyataanPakbejo();
              
        
    }
    
}
