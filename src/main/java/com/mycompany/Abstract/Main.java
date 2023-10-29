/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Abstract;

/**
 *
 * @author elva
 */
public class Main {
    public static void main(String[] args) {
        Siswa budi = new Siswa("Budi");
        Siswa toni = new Siswa("Toni");
        
        Polinema polinema = new Polinema("Polinema", "Vokasi");
        Ui ui = new Ui ("Universitas Indonesia", "Akademik");
        
        budi.mengecekPersyaratan(polinema);
        budi.memilihJalur(polinema, "mandiri");
        budi.mengerjakanUjian(budi, true);
        polinema.infoPenerimaan(budi, polinema, true);
        
        toni.mengecekPersyaratan(ui);
        toni.memilihJalur(ui, "mandiri");
        toni.mengerjakanUjian(toni, true);
        ui.infoPenerimaan(toni, ui, false);
        
    }
}
