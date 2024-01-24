/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_8;

/**
 *
 * @author ACER
 */
public class Jajargenjang extends BangunDatar implements Keliling, Simetri {
    // attributes
    public int alas;
    public int tinggi;

    // methods

    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2.0;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt( 2 * alas + tinggi);
    }

    @Override
    public double hitungSimPutar() {
        return 3.0;
    }

    @Override
    public double hitungSimLipat() {
        return 3.0;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Trapesium");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }
}
