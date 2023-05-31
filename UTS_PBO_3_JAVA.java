/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pbo2.uts_pbo_3_java;

import java.util.Scanner;

/**
 *
 * @author Win 10
 */
public class UTS_PBO_3_JAVA {

    public static void main(String[] args) {
        System.out.println("==== Siti aswinah / 1202211009 sistem informasi ====");
       
/**
 *
 * @author siti aswinah
 */
       

       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();



        // Masukkan bobot nilai
        double bobotKehadiran = 0.1;
        double bobotPerilaku = 0.1;
        double bobotTugas = 0.2;
        double bobotUTS = 0.25;
        double bobotUAS = 0.35;

        // Masukkan nilai dari masing-masing komponen
        System.out.print("Masukkan nilai kehadiran: ");
        double nilaiKehadiran = scanner.nextDouble();

        System.out.print("Masukkan nilai perilaku: ");
        double nilaiPerilaku = scanner.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (nilaiKehadiran * bobotKehadiran) +
                            (nilaiPerilaku * bobotPerilaku) +
                            (nilaiTugas * bobotTugas) +
                            (nilaiUTS * bobotUTS) +
                            (nilaiUAS * bobotUAS);

        // Tampilkan nilai akhir
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // Tentukan grade berdasarkan nilai akhir
        String grade;
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 69 && nilaiAkhir < 85) {
            grade = "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 69) {
            grade = "C";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Tampilkan grade
        System.out.println("==================================");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

    }
}
    

