/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Inheritance;

/**
 *
 * @author elva
 */
public class Ui extends Ptn {
    
    Ui(String nama, String jenis){
        super(nama, jenis);
    }
    
    
   public void infoPenerimaan(Siswa siswa, Ptn ptn, boolean diterima){
         System.out.println("========< Pengumuman Hasil Ujian Masuk Ptn >========");
         
         if(diterima){
             if(siswa.getNama().equalsIgnoreCase("Toni")){
            System.out.println("Nama Siswa: "+ siswa.getNama());
            System.out.println("Nama PTN: "+ this.getNama());
            System.out.println("Jenis PTN: "+this.getJenis());
            System.out.println("Tipe Ujian: Tulis");
            System.out.println("Lulus Ujian: Lulus");
            super.infoPenerimaan(siswa, diterima);
        }else{
            System.out.println("Maaf, nama Anda belum terdaftar");
        }
         }else{
             if(siswa.getNama().equalsIgnoreCase("Toni")){
            System.out.println("Nama Siswa: "+ siswa.getNama());
            System.out.println("Nama PTN: "+ this.getNama());
            System.out.println("Jenis PTN: "+this.getJenis());
            System.out.println("Tipe Ujian: Tulis");
            System.out.println("Lulus Ujian: Tidak");
            super.infoPenerimaan(siswa, diterima);
        }else{
            System.out.println("Maaf, nama Anda belum terdaftar");
        }
         }
        System.out.println("");
    }
    
}
