/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classObjek;

/**
 *
 * @author elva
 */
public class Main {
    public static void main(String[] args) {
        Siswa budi = new Siswa ("Budi");
        Siswa toni = new Siswa("Toni");
        
        
        
        Ptn polinema = new Ptn("Polinema", "Vokasi");
        Ptn ui = new Ptn("Universitas Indonesia", "Akademik");
        
        budi.mengecekPersyaratan(polinema);
        budi.memilihJalur(polinema,"mandiri");
        budi.mengerjakanUjian(budi, true);
        budi.melihatPengumuman(budi,polinema, true);
        
        toni.mengecekPersyaratan(ui);
        toni.memilihJalur(ui, "mandiri");
        budi.mengerjakanUjian(toni, true);
        toni.melihatPengumuman(toni,ui, false);
        
        
    }
}
