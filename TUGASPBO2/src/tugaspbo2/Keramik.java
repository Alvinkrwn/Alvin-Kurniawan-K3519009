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
public class Keramik {
    
    //attribut
    double luaslantai;
    double sisikeramika;
    double sisikeramikb;
    int jumlah;
    double harga;
    
    //constructor
    Keramik(double a, double b){
        this.sisikeramika = a;
        this.sisikeramikb = b;
                
    }
    
    Keramik(double ta, double sia, double sib){
        this.luaslantai = ta;
        this.sisikeramika = sia;
        this.sisikeramikb = sib;
    }
    
    Keramik(double lan, double sisia, double sisib, int jum){
        this.luaslantai = lan;
        this.sisikeramika = sisia;
        this.sisikeramikb = sisib;
        this.jumlah = jum;
    }
    
    Keramik(double l, double sa, double sb, int j, double h){
        this.luaslantai = l;
        this.sisikeramika = sa;
        this.sisikeramikb = sb;
        this.jumlah = j;
        this.harga = h;
    }
    
    //methods 
    double luasKeramik(){
        double totaljumlah;
        totaljumlah = this.sisikeramika * this.sisikeramikb;
        return totaljumlah;
    }
    
    double totalKeramikDibutuhkan(){
        double totalbutuh;
        totalbutuh = this.luaslantai / this.luasKeramik();
        return totalbutuh;
    }
    
    double totalKeramikPerBox(){
        double totalperbox;
        totalperbox = this.totalKeramikDibutuhkan() / this.jumlah;
        return totalperbox;
    }
    
    double hitungTotalHargaKeramik(){
       double totalharga;
       totalharga = this.totalKeramikPerBox() * this.harga;
       return totalharga;
    }
}
