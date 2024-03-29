/**
 * File :persegiPanjang.java 16/03/2024
 * Penulis :Jeremia Joel Richard Ramalael
 * Deskripsi: file source code class persegiPanjang
 */

package org.bangundatar;

import org.poligon.Poligon;

public class persegiPanjang extends Poligon {
    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
