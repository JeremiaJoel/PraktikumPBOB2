/* Nama File : Asersi2.java
   Nama /NIM : Jeremia Joel Richard Ramalael / 24060122140109
 */

import static java.lang.Math.PI;

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 2;
        assert (jariJari > 0) : "Jari - jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

// penggunaan asersi mungkin tidak sepenuhnya mencakup semua kemungkinan kasus
// yang harus dipertimbangkan dalam validasi input.Konsepnya bisa diperluas
// dengan mempertimbangkan penanganan kasus-kasus khusus lainnya, misalnya,
// bagaimana jika jari-jari lingkaran bernilai negatif? Penggunaan asersi hanya
// untuk memeriksa bahwa jari-jari tidak nol mungkin terlalu sempit.
