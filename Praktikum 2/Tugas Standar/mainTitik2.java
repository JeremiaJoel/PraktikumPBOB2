/*
Nama File : mainTitik2.java
Nama      : Jeremia Joel Richard Ramalael
Nim       : 24060122140109
Deskripsi : Source code file main Titik
*/

public class mainTitik2 {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(2);

        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(4);

        Titik T3 = new Titik(7, 1);

        System.out.println("Jumlah objek titik adalah = " + Titik.getCounterTitik());
        System.out.println("T1(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        System.out.println("T2(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        System.out.println("T3(" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
        System.out.println("Jarak titik T1 ke pusat adalah = " + T1.getJarakPusat());
        System.out.println("Jarak titik T2 ke pusat adalah = " + T2.getJarakPusat());
        System.out.println("Jarak titik T3 ke pusat adalah = " + T3.getJarakPusat());
        // Memakai fungsi refleksi
        T1.refleksiX();
        T2.refleksiY();
        T3.refleksiX();
        System.out.println(
                "T1 setelah direfleksikan thd sumbu X adalah = " + "(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        System.out.println(
                "T2 setelah direfleksikan thd sumbu Y adalah = " + "(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        System.out.println(
                "T3 setelah direfleksikan thd sumbu X adalah = " + "(" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
        // Memakai fungsi getRefleksi
        Titik TreflexsiX = T1.getRefleksiX();
        System.out.println("T1 refleksi sumbu X = (" + TreflexsiX.getAbsis() + "," + TreflexsiX.getOrdinat() + ")");
        Titik TreflexsiY = T2.getRefleksiY();
        System.out.println("T2 refleksi sumbu Y = (" + TreflexsiY.getAbsis() + "," + TreflexsiY.getOrdinat() + ")");
    }

    /*
     * Kesimpulan
     * Saya melakukan percobaan dengan mengganti modifier dari fungsi getAbsis()
     * yang awalnya public menjadi private. Hal tersebut saya lakukan karena pada
     * class Garis terdapat beberapa method yang menggunakan getAbsis() didalamnya.
     * Hal yang terjadi setelah saya ganti yaitu smua fungsi yang mengandung
     * setAbsis() akan menampilkan method tersebut error (not visible).
     * Kesimpulannya adalah modifier private menyebabkan method tersebut hanya bisa
     * dipanggil dalam class yang sama, sehingga yang sebelumnya dapat digunakan
     * pada file garis akan menjadi not visible setelah di private
     * 
     */
}