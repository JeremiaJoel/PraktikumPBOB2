/**
 * File : bukuNovel.java
 * Penulis : Jeremia Joel Richard Ramalael
 * Deskripsi: source code class bukuNovel yang mewarisi bukuFiksi
 */

package bk.bukuFiksi;

public class bukuNovel extends bukuFiksi {
    public bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
}
