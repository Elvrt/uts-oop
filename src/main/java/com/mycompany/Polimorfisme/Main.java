/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Polimorfisme;

/**
 *
 * @author elva
 */
public class Main {
        public static void main(String[] args) {
        Siswa budi = new Siswa();
        Siswa toni = new Siswa();
        
        budi.setNama("Budi");
        toni.setNama("Toni");
        
        Polinema polinema = new Polinema("polinema","Vokasi");
        Ui ui = new Ui ("Universitas Indonesia", "Akademik");
        
        budi.mengecekPersyaratan(polinema);
        budi.memilihJalur(polinema, "mandiri");
        budi.mengerjakanUjian(budi, true);
        polinema.infoPenerimaan(budi,true);
        
        toni.mengecekPersyaratan(ui);
        toni.memilihJalur(ui, "mandiri");
        toni.mengerjakanUjian(toni, true);
        ui.infoPenerimaan(toni, false);

    }
}
