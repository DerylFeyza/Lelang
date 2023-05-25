/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uklsmt2;

/**
 *
 * @author ASUS
 */
public class DaftarMember extends Masyarakat{
    public void PrintMasyarakat(int id){
        System.out.println("Nama\t: "+super.getNama(id));
        System.out.println("Alamat\t: "+super.getAlamat(id));
        System.out.println("Telepon\t: "+super.getTelepon(id));
    }
}
