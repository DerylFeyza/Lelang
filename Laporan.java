/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uklsmt2;

/**
 *
 * @author ASUS
 */
public class Laporan {
    public void laporan(Barang barang){
        int x = barang.getJmlBarang();
        System.out.println("\\n==========  NEGRO AUCTION - List Barang  ==========\\n");
        for(int i=1;i < x;i++){
            System.out.println("Id Barang\t: " + barang.getId(i) +
                    "\nDengan Nama\t: "+ barang.getNamaBarang(i) +
                    "\nSeharga\t: Rp." + barang.getHarga(i) +
                    "\nBerstatus\t: "+ barang.getStatus(i) +
                    "\n--------------------------------------------------");
        }
        }
    public void laporan(Petugas petugas){
        int x = petugas.getJmlPetugas();
        System.out.println("\\n==========  NEGRO AUCTION - List Employee  ==========\\n");
        for(int i=1;i < x;i++){
            System.out.println("Nama Petugas\t: " + petugas.getNama(i) +
                    "\nAlamat\t:"+ petugas.getAlamat(i) +
                    "\nContact\t: " + petugas.getTelepon(i) +                   
                    "\n--------------------------------------------------");
        }
    }
    public void laporan(Masyarakat masyarakat){
        int x = masyarakat.getJmlMember();
           System.out.println("\\n==========  NEGRO AUCTION - List Client  ==========\\n");
           for(int i=1;i < x;i++){
               System.out.println("Nama Petugas\t: " + masyarakat.getNama(i) +
                       "\nAlamat\t:"+ masyarakat.getAlamat(i) +
                       "\nContact\t: " + masyarakat.getTelepon(i) +                   
                       "\n--------------------------------------------------");
        }
    }
    }
