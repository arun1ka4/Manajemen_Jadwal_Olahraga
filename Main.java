/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jadwallatihanolahraga;

/**
 *
 * @author nitro
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> jadwalLatihan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("===JADWAL LATIHAN MINGGUAN===");
            System.out.println("1. Tambah Jadwal");
            System.out.println("2. Lihat Jadwal");
            System.out.println("3. Update Jadwal");
            System.out.println("4. Hapus Jadwal");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            input.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan Jenis Latihan: ");
                String latihan = input.nextLine();

                System.out.print("Masukkan Hari: ");
                String hari = input.nextLine();

                String jadwal = hari + "-" + latihan;
                jadwalLatihan.add(jadwal);
                System.out.println("Jadwal telah ditambahkan.");
            } else if (pilih == 2) {
                if (jadwalLatihan.size() == 0) {
                    System.out.println("Belum ada jadwal latihan.");
                } else {
                    System.out.println("==Jadwal Latihan==");
                    for (int i = 0; i < jadwalLatihan.size(); i++) {
                        System.out.println((i + 1) + ". " + jadwalLatihan.get(i));
                    }
                }
            } else if (pilih == 3) {
                if (jadwalLatihan.size() == 0) {
                    System.out.println("Belum ada jadwal latihan.");
                } else {
                    System.out.println("Pilih jadwal yang ingin diperbarui: ");
                    for (int i = 0; i < jadwalLatihan.size(); i++) {
                        System.out.println((i + 1) + ". " + jadwalLatihan.get(i));
                    }
                    System.out.print("Masukkan nomor: ");
                    int noUpdate = input.nextInt();
                    input.nextLine();

                    if (noUpdate > 0 && noUpdate <= jadwalLatihan.size()) {
                        System.out.print("Masukkan jenis latihan: ");
                        String latihanUpdate = input.nextLine();

                        System.out.print("Masukkan hari: ");
                        String hariUpdate = input.nextLine();

                        jadwalLatihan.set(noUpdate - 1, hariUpdate + "-" + latihanUpdate);
                        System.out.println("Jadwal berhasil diperbarui.");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }
            } else if (pilih == 4) {
                if (jadwalLatihan.size() == 0) {
                    System.out.println("Belum ada jadwal latihan.");
                } else {
                    System.out.println("Pilih nomor jadwal yang ingin dihapus: ");
                    for (int i = 0; i < jadwalLatihan.size(); i++) {
                        System.out.println((i + 1) + ". " + jadwalLatihan.get(i));
                    }
                    System.out.print("Masukkan nomor: ");
                    int noHapus = input.nextInt();
                    input.nextLine();
                    if (noHapus > 0 && noHapus <= jadwalLatihan.size()) {
                        jadwalLatihan.remove(noHapus - 1);
                        System.out.println("Jadwal berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }
            } else if (pilih == 5) {
                System.out.println("Terima kasih telah mencoba.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5); 

    }
}
