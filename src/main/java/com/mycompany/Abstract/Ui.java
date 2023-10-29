/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Abstract;

/**
 *
 * @author elva
 */
public class Ui extends Ptn implements ISyaratDaftarPtn{
    
    Ui(String nama, String jenis){
        super(nama, jenis);
    }

    @Override
    public void lulus() {
        System.out.println("========< Cek Persyaratan >========");
        System.out.println("Anda sudah memenuhi persyaratan lulus SMA/SMK dan memiliki ijazah ");
    }

    @Override
    public void memenuhiPassingGrade() {
        System.out.println("Anda telah memenuhi passing grade Universitas Indonesia");
        System.out.println("");
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
            System.out.println("Selamat "+ siswa.getNama()+", Anda diterima di perguruan tinggi "+ ptn.getNama());
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
            System.out.println("Maaf "+siswa.getNama()+", Anda belum diterima di perguruan tinggi " + ptn.getNama());
        }else{
            System.out.println("Maaf, nama Anda belum terdaftar");
        }
         }
         System.out.println("----------------------------------------------------------------------");
        System.out.println("");
    }
}
