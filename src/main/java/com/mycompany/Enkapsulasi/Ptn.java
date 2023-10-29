/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Enkapsulasi;

/**
 *
 * @author elva
 */
public class Ptn {
   private String nama, jenis;
    
    Ptn(String nama, String jenis){
        this.nama = nama;
        this.jenis=jenis;
    }
    
    Ptn(){}
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
      public void infoPenerimaan(Siswa siswa,Ptn ptn, boolean diterima){
        System.out.println("========< Pengumuman Hasil Ujian Masuk Ptn >========");
        if(siswa.getNama().equalsIgnoreCase("Budi")){
            if(diterima){
            System.out.println("Nama Siswa: "+ siswa.getNama());
            System.out.println("Nama PTN: "+ this.getNama());
            System.out.println("Jenis PTN: "+this.getJenis());
            System.out.println("Tipe Ujian: Komputer");
            System.out.println("Lulus Ujian: Lulus");
            System.out.println("Selamat! "+siswa.getNama()+ ", Anda diterima di perguran tinggi "+ nama);
            System.out.println("-----------------------------------------------------------------------");    
            
            }else{
            System.out.println("Nama Siswa: "+ siswa.getNama());
            System.out.println("Nama PTN: "+ this.getNama());
            System.out.println("Jenis PTN: "+this.getJenis());
            System.out.println("Tipe Ujian: Komputer");
            System.out.println("Lulus Ujian: Tidak Lulus");
            System.out.println("Maaf "+ siswa.getNama()+", Anda belum diterima di perguruan tinggi "+ nama);
             System.out.println("----------------------------------------------------------------------");
            }
        }else if (siswa.getNama().equalsIgnoreCase("Toni")){
            if(diterima){
            System.out.println("Nama Siswa: "+ siswa.getNama());
            System.out.println("Nama PTN: "+ this.getNama());
            System.out.println("Jenis PTN: "+this.getJenis());
            System.out.println("Tipe Ujian: Tulis");
            System.out.println("Lulus Ujian: Lulus");
            System.out.println("Selamat! "+siswa.getNama()+ ", Anda diterima di perguran tinggi "+ nama);
            System.out.println("-----------------------------------------------------------------------");    

            }else{
            System.out.println("Nama Siswa: "+ siswa.getNama());
            System.out.println("Nama PTN: "+ this.getNama());
            System.out.println("Jenis PTN: "+this.getJenis());
            System.out.println("Tipe Ujian: Tulis");
            System.out.println("Lulus Ujian: Tidak Lulus");
            System.out.println("Maaf "+ siswa.getNama()+", Anda belum diterima di perguruan tinggi "+ nama);
            System.out.println("----------------------------------------------------------------------");
 
            }
        }
        System.out.println("");
    }
    
}
