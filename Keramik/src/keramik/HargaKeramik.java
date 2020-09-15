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
public class HargaKeramik {
    // memnbuat atribut
    int luastanah;
    int ukuranA;
    int ukuranB;
    int jumlahsatubox;
    int hargasatubox;
    
    // membuat methods
    void totalHarga (){
        int harga;
        harga = this.luastanah / this.ukuranA * this.ukuranB * this.jumlahsatubox * this.hargasatubox;
        System.out.println("Total Harga: " + harga );
    }   
    
    void jumlahKeramik (){
        int jumlahkeramik;
        jumlahkeramik = (this.ukuranA * this.ukuranB) / this.luastanah;
        System.out.println("Jumlah keramik: " + jumlahkeramik );
    }  
    
    void pernyataanPakbejo(){
        int pernyataan;
        pernyataan = this.luastanah / this.ukuranA * this.ukuranB * this.jumlahsatubox * this.hargasatubox;
        System.out.println("Jadi Pak Bejo memilih untuk membeli Keramik A: " + pernyataan );
    }
}
