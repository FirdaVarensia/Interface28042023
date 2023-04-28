/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import BangunDatar.*;
/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Lingkaran");
        Lingkaran l1 = new Lingkaran();
        l1.jejari = 14;
        l1.tampilanHasil();
        
        System.out.println("");
        System.out.println("Persegi");
        Persegi S = new Persegi();
        S.sisi = 5;
        S.tampilanHasil();
        
        System.out.println("");
        System.out.println("Persegi Panjang");
        PersegiPanjang PL = new PersegiPanjang();
        PL.panjang = 3;
        PL.lebar = 3;
        PL.tampilHasil();
        
        System.out.println("");
        System.out.println("Segitiga");
        Segitiga S1 = new Segitiga();
        S1.alas = 5;
        S1.tinggi = 2;
        S1.tampilHasil();
        
    }
}
