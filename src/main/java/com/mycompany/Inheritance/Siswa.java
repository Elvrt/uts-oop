/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Inheritance;

/**
 *
 * @author elva
 */
public class Siswa {
    private String nama;

    
   Siswa(String nama){
       this.nama = nama;
    }
   
   Siswa(){}
   
  public void setNama(String nama){
        this.nama = nama;
    }
   
   public String getNama() {
        return nama;
    }
   
   public void mengecekPersyaratan(Ptn ptn){
       System.out.println("========< Cek Persyaratan >========");
       if(ptn.getNama().equalsIgnoreCase("Polinema")){
        System.out.println("Anda telah memenuhi persyaratan lulus SMA/SMK dan memiliki ijazah ");
        System.out.println("Anda telah memenuh passing grade Polinema");
        System.out.println("");
       }else{
        System.out.println("Anda telah memenuhi persyaratan lulus SMA/SMK dan memiliki ijazah ");
        System.out.println("Anda telah memenuh passing grade Universitas Indonesia");
        System.out.println("");
       }
       System.out.println("");
   }
   
     public void memilihJalur(Ptn ptn, String jalur){
        
        if(jalur.equalsIgnoreCase("mandiri")){
            if(ptn.getNama().equalsIgnoreCase("Polinema")){
                System.out.println("========< Informasi Ujian Masuk Polinema >========");
                System.out.println("Tipe Ujian Anda adalah berbasis komputer");
                System.out.println("Silahkan mengikuti ujian masuk mandiri di kampus "+ ptn.getNama() +" sesuai jadwal yang tersedia");
                
            }else {
                System.out.println("========< Informasi Ujian Masuk Universitas Indonesia >========");
                System.out.println("Tipe Ujian Anda adalah berbasis tulis");
                System.out.println("Silahkan mengikuti ujian masuk mandiri di kampus "+ ptn.getNama() +" sesuai jadwal yang tersedia");
            }      
    }else{
            System.out.println("Maaf pilihan anda tidak tersedia!");
    }
   }
     public void mengerjakanUjian(Siswa siswa, boolean sudah){
       if(sudah){
           System.out.println("Selamat " + siswa.nama + ", Ujian Anda telah selesai! ");
           System.out.println("Silahkan menunggu pengumuman! ");
       }else{
           System.out.println("Anda harus mengikuti ujian terlebih dahulu! ");
       }
         System.out.println("");
    }
}
