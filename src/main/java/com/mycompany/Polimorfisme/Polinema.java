/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Polimorfisme;

/**
 *
 * @author elva
 */
public class Polinema extends Ptn{
    
    Polinema(String nama, String jenis){
        super(nama, jenis);
    }
    
   @Override
    public void infoPenerimaan(Siswa siswa, boolean diterima) {
        System.out.println("========< Pengumuman Hasil Ujian Masuk Ptn >========");

        if (diterima) {
            System.out.println("Nama Siswa: " + siswa.getNama());
            System.out.println("Nama PTN: " + this.getNama());
            System.out.println("Jenis PTN: " + this.getJenis());
            System.out.println("Tipe Ujian: Komputer");
            System.out.println("Lulus Ujian: " + (diterima ? "Lulus" : "Tidak"));
            super.infoPenerimaan(siswa, diterima);
        } else {
            System.out.println("Maaf, nama Anda belum terdaftar");
        }

        System.out.println("");
    }
}
