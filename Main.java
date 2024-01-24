/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_8;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // hitung luas, keliling, dan simetri dari suatu lingkaran A dg r=19 satuan
        Lingkaran A = new Lingkaran();
        A.jejari = 19;
        A.tampilHasil();

        // hitung luas, keliling, dan simetri dari suatu persegi panjang B dg panjang=10 & lebar=5 satuan
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 15;
        B.lebar = 15;
        B.tampilHasil();

        // hitung luas dari segitiga C dg alas=12 & tinggi=8 satuan
        Segitiga C = new Segitiga();
        C.alas = 15;
        C.tinggi = 15;
        C.tampilHasil();
        
        Jajargenjang D = new Jajargenjang();
        D.alas = 4;
        D.tinggi = 8;
        D.tampilHasil();
    }
}
