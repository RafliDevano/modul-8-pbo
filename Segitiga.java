/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_8;

/**
 *
 * @author ACER
 */
public class Segitiga extends BangunDatar{
    public int alas;
    public int tinggi;

    @Override
    public double hitungLuas() {
        return this.alas * this.tinggi / 2.0;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Segitiga");
        System.out.println("-----------");
        System.out.println("Luasnya; " + this.hitungLuas());
    }
}
