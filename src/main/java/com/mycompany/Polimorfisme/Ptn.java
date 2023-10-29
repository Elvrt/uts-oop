/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Polimorfisme;

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
    
    public void infoPenerimaan(Siswa siswa,boolean diterima){
        if(diterima){
            System.out.println("Selamat! "+siswa.getNama()+ ", Anda diterima di perguran tinggi "+ nama);
            System.out.println("-----------------------------------------------------------------------");
        }else{
            System.out.println("Maaf "+ siswa.getNama()+", Anda belum diterima di perguruan tinggi "+ nama);
             System.out.println("----------------------------------------------------------------------");
        }
    }
}

