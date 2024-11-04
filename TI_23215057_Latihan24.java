/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * NAma  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk membandingkan besar kecilnya antara dua bilangan
 */
import java.util.Scanner;

public class TI_23215057_Latihan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukkan nilai pertama: ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            int nilai2 = input.nextInt();

            if (nilai1 > nilai2) {
                System.out.println("Hasil: " + nilai1 + " lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println("Hasil: " + nilai1 + " lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil: " + nilai1 + " sama dengan " + nilai2);
            }

            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("Ya"));
    }
}
