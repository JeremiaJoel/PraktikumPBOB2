/**
 * File : Main.java
 * Penulis : Jeremia Joel Richard Ramalael
 * Deskripsi: SOurce code file main untuk menaggunakan semua class yang sudah dibuat menjadi sebuah output
 */

package bk.main;

import bk.bukuFiksi.bukuFiksi;
import bk.bukunonFiksi.bukuNonFiksi;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        // Membuat objek bukuFiksi
        bukuFiksi novel = new bukuFiksi("Matahari", "Alexander Sarr", "1978", "Romance", 200, 100.000);
        novel.view();

        System.out.println();

        // Membuat objek bukuNonFiksi
        bukuNonFiksi nonFiksi = new bukuNonFiksi("Life of Cristiano Ronaldo", "Luca Caoli", "2015", "Biography", 600,
                200.000);
        nonFiksi.view();

        System.out.println();

        // Membuat objek bukuAkademik
        bukuAkademik akademik = new bukuAkademik("Judul Awal", "Penulis Awal", "2024", 400, 200.0);
        akademik.setJudul("Informatika");
        akademik.setPenulis("Michael");
        akademik.setHarga(100.000);
        akademik.setJumlahHalaman(250);
        akademik.view();

        System.out.println();
    }
}
