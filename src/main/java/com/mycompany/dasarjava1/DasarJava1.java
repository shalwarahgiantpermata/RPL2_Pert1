/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dasarjava1;

/**
 *
 * @author Shalwa Rahgiant
 */
import java.util.Scanner;

public class DasarJava1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        double uts;
        double uas;
        double hasil;
        
        System.out.println("---Program Hitung Nilai Ujian---");
        System.out.print("Masukkan Nama:");
        nama = input.nextLine();
        
        System.out.print("Masukkan Nilai UTS (Bobot 60%): ");
        uts = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS (Bobot 40%): ");
        uas = input.nextDouble();
        
        hasil = (uts * 0.6) + (uas * 0.4);
        
        System.out.println("\n---Hasil Perhitungan");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Nilai Hasil Ujian: " + hasil);
 
        
     
    }
}
