/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classObjek;

/**
 *
 * @author elva
 */
public class Ptn {
    String nama, jenis;
    Siswa siswa;
    
    Ptn(String nama, String jenis){
        this.nama = nama;
        this.jenis=jenis;
    }
    
    public void infoPenerimaan(Siswa siswa,Ptn ptn, boolean diterima){
        System.out.println("========< Pengumuman Hasil Ujian Masuk Ptn >========");
        if(siswa.nama.equalsIgnoreCase("Budi")){
            if(diterima){
            System.out.println("Nama Siswa: "+ siswa.nama);
            System.out.println("Nama PTN: "+ this.nama);
            System.out.println("Jenis PTN: "+this.jenis);
            System.out.println("Tipe Ujian: Komputer");
            System.out.println("Lulus Ujian: Lulus");
            System.out.println("Selamat! "+siswa.nama+ ", Anda diterima di perguran tinggi "+ nama);
            System.out.println("-----------------------------------------------------------------------");    
            
            }else{
            System.out.println("Nama Siswa: "+ siswa.nama);
            System.out.println("Nama PTN: "+ this.nama);
            System.out.println("Jenis PTN: "+this.jenis);
            System.out.println("Tipe Ujian: Komputer");
            System.out.println("Lulus Ujian: Tidak Lulus");
            System.out.println("Maaf "+ siswa.nama+", Anda belum diterima di perguruan tinggi "+ nama);
             System.out.println("----------------------------------------------------------------------");
            }
        }else if (siswa.nama.equalsIgnoreCase("Toni")){
            if(diterima){
            System.out.println("Nama Siswa: "+ siswa.nama);
            System.out.println("Nama PTN: "+ this.nama);
            System.out.println("Jenis PTN: "+this.jenis);
            System.out.println("Tipe Ujian: Tulis");
            System.out.println("Lulus Ujian: Lulus");
            System.out.println("Selamat! "+siswa.nama+ ", Anda diterima di perguran tinggi "+ nama);
            System.out.println("-----------------------------------------------------------------------");    

            }else{
            System.out.println("Nama Siswa: "+ siswa.nama);
            System.out.println("Nama PTN: "+ this.nama);
            System.out.println("Jenis PTN: "+this.jenis);
            System.out.println("Tipe Ujian: Tulis");
            System.out.println("Lulus Ujian: Tidak Lulus");
            System.out.println("Maaf "+ siswa.nama+", Anda belum diterima di perguruan tinggi "+ nama);
            System.out.println("----------------------------------------------------------------------");
 
            }
        }
        System.out.println("");
    }
     
}
