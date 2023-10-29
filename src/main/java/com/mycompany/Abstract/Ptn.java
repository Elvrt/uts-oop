/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Abstract;

/**
 *
 * @author elva
 */
public abstract class Ptn {
    private String nama;
    private String jenis;
    
    protected Ptn(String nama, String jenis){
            this.nama = nama;
            this.jenis = jenis;
    }
    
    Ptn(){}
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(){
        this.jenis= jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void infoPenerimaan(){}
    
}
