/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uklsmt2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */

public class Lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    boolean waduh = true;
    boolean keluarLelang = true;
    boolean acumalaka = true;
    int wadaw = 0;
    String winner;
    public void prosesLelang(Masyarakat masyarakat, Barang barang, Petugas petugas, int index){
        
        
        do {
            System.out.print("Masukkan ID Barang Lelang: ");
            index = input.nextInt();
            this.idBarang.add(index);
            if (index>barang.getJmlBarang()) {
                System.out.println("Invalid Id");
            }
            else{
                System.out.print("\n--------------- BARANG AUCTION ----------------");
                System.out.print(
                        "\nId Barang   : " + barang.getId(index) +
                                "\nDengan Nama : " + barang.getNamaBarang(index) +
                                "\nHarga Awal  : " + barang.getHarga(index) +
                                "\nBerstatus   : " + barang.getStatus(index) +
                                "\n--------------------------------------------------\n");
         while (waduh) {
         if(barang.getStatus(index) == false){
                        System.out.println("Barang yang akan dilelang sudah tidak ada!");
                        break;
                    }
                    System.out.print("\nMasukan ID Anda : ");
                    int IndexPenawar = input.nextInt(); 
                    this.idPenawar.add(IndexPenawar);
                    if (IndexPenawar > masyarakat.getJmlMember()) {
                        System.out.println("Id Anda Salah");
                    }
                    else {
                    barang.getHarga(index);
                    System.out.println("Login Sebagai : " + masyarakat.getNama(IndexPenawar));
                    
                    while(acumalaka){
                    System.out.println("Silahkan masukkan harga penawaran");
                    System.out.print("Harga : Rp.");
                    int hargaTawar = input.nextInt();

                    if (barang.getHarga(index) < hargaTawar) {
                        if (wadaw < hargaTawar) { 
                            wadaw = hargaTawar;
                            setId(IndexPenawar);
                            setHarga(hargaTawar);
                        } else {
                            System.out.println("sudah ada yang menawar lebih tinggi");
                            continue;
                            
                        }
                    
                    } else {
                        System.out.println("Harga Dibawah Harga Awal");
                    }
                    System.out.println("--------------------------------------------------\n");

                    System.out.println("Apakah Ada Yang Ingin Menawar Lebih? true/false ");
                    System.out.print("Pilihan : ");
                    keluarLelang = input.nextBoolean();

                        if (!keluarLelang && (wadaw > barang.getHarga(index))) {
                            barang.editStatus(index, false);
                            System.out.println("\n---------------- Hasil Pelelangan ---------------");
                            System.out.print(
                                    "Id Barang       : " + barang.getId(index) +
                                            "\nDengan Nama     : " + barang.getNamaBarang(index) +
                                            "\nHarga Awal      : " + barang.getHarga(index) +
                                            "\nBerstatus       : " + barang.getStatus(index) +
                                            "\nDengan Harga    : " + wadaw +
                                            "\nDimenangkan Oleh: " + masyarakat.getNama(getPemenang(0))+
                                            "\n--------------------------------------------------\n");

                        }
                         if (barang.getStatus(index) == false) {
                            System.out.println("Barang " + barang.getNamaBarang(index) + " Sudah terjual");
                            break;
                        }
                }
            }
            }
            }
            System.out.println("\nApakah Anda Ingin melanjutkan lelang? true / false ");
            System.out.print("Pilihan : ");
            keluarLelang = input.nextBoolean();

        }while(keluarLelang);
    }

            
    public void setIdBarang(Barang barang, int index){
        this.idBarang.add(barang.getId(index));
    }
    
    public void setId(int idPenawar) {
        this.idPenawar.set(0,idPenawar);
    }
    
    public int getPemenang(int index){
        return this.idPenawar.get(index);
    }
    
    public void setHarga(int harga) {
        this.hargaTawar.add(harga);
    }


    public int getHarga(int index) {
        return this.hargaTawar.get(index);
    }

    public int getId(int index) {
        return this.getId(index);
    }
}
