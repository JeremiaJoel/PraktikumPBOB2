/**
 * File :segitiga.java 16/03/2024
 * Penulis :Jeremia Joel Richard Ramalael
 * Deskripsi: file source code class segitiga
 */
package org.bangundatar;

import org.poligon.Poligon;

public class segitiga extends Poligon {
    private double alas, tinggi;

    public segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public void printInfo() {
        System.out.println("Bangun segitiga berisi " + this.getJumlahSisi() + "sisi");
    }
}
