/* Nama File : segitiga.java
 * Nama      : Jeremia Joel Richard Ramalael
 * Nim       : 24060122140109
 * Deskripsi : source code file body dari class Segitiga
 */

public class segitiga {
    private double alas;
    private double tinggi;

    segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;

    }

    segitiga() {
        alas = 0;
        tinggi = 0;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        return (0.5 * alas * tinggi);
    }

}