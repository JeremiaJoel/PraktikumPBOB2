/* Nama File : AngkaSial.java
   Nama /NIM : Jeremia Joel Richard Ramalael / 24060122140109
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati - hati dalam memasukkan angka");
        }
    }
}
// Ketika eksepsi terjadi, baris 12 pada AngkaSial.java tidak akan dieksekusi,
// karena saat angka yang dilewatkan ke metode `cobaAngka()` adalah 13, sebuah
// eksepsi `AngkaSialException` akan dilemparkan pada baris 8, dan eksekusi
// program akan langsung melompat ke blok `catch` pada baris 19.

// Baris 21 pada AngkaSial.java akan dieksekusi setelah eksepsi terjadi, karena
// itu adalah bagian dari blok `catch` yang menangani eksepsi
// `AngkaSialException`. Jadi, setelah mencetak pesan kesalahan pada baris 20,
// program akan melanjutkan untuk mencetak "Hati - hati dalam memasukkan angka"
// pada baris 21 sebelum menyelesaikan eksekusi.