/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uklsmt2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner uwog = new Scanner(System.in);
        Lelang proses = new Lelang();
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Laporan lapor = new Laporan();
        DaftarMember info = new DaftarMember();
        do {
        boolean buss=true;    
        int milih=0;
        System.out.println("==========  Welcome To Negro Auction  ==========");
        System.out.println("Login Sebagai: ");
        System.out.println("1. Penawar\n2. Staff\n3. Aku Pergi");
        System.out.print("Input: ");
        int pilih = uwog.nextInt();
        if (pilih==1) {
            while(milih>2||milih<1){
            System.out.println("Pilih Aksi: \n1. Liat Info\n2. Back");
            System.out.print("Input: ");
            milih = uwog.nextInt();
            if(milih==1){
                milih=3;
                System.out.print("Masukkan ID: ");
                int idmu = uwog.nextInt();
                if (idmu>masyarakat.getJmlMember()-1||idmu<1) {
                    System.out.println("WRONG ID");                    
                }
                else{
                info.PrintMasyarakat(idmu);
                }
                
            }
            else if(milih==2){
                System.out.println("Log Out Berhasil");
                continue;
            }
            else{
                System.out.println("Pilihan Tidak Ada!");
            }
            }
        }
        
        else if (pilih==2) {
            while(buss){
            System.out.print("Masukkan ID Staff: ");
            int id = uwog.nextInt();
            if (id>petugas.getJmlPetugas()-1||id<1) {
                if(id==99){
                    buss=false;
            }
                else{
                System.out.println("ID ERROR, PRESS 99 TO BACK");    
                }
            }
            else{
            while(buss){
            System.out.println("Login Sebagai "+petugas.getNama(id));

            System.out.println("1. Mulai Lelang\n2. Cek Laporan Client\n3. Cek Laporan Staff\n4. Cek Laporan Barang\n5. Log Out");
            int staffaction = uwog.nextInt();
            switch(staffaction){
                case 1: 
                    proses.prosesLelang(masyarakat,barang,petugas, 0);
                    break;
                case 2:
                    lapor.laporan(masyarakat);
                    break;
                case 3:
                    lapor.laporan(petugas);
                    break;
                case 4:
                    lapor.laporan(barang);
                    break;
                case 5:
                    System.out.println("Log Out Berhasil");
                    buss=false;
                    break;
            }
            }
        }
        }
        }
        else if(pilih==3){
            System.exit(0);
        }
        else{
            System.out.println("PILIHAN TIDAK TERSEDIA");
            
        }
        } while (true);
    }
}
