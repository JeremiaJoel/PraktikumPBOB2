/**
 * File :MPoligon.java 16/03/2024
 * Penulis :Jeremia Joel Richard Ramalael
 * Deskripsi: source code file main untuk memanggil bangundatar
 */
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        persegiPanjang persegi = new persegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang : " + persegi.hitungLuas());

        segitiga Segitiga = new segitiga(10, 12, 3);
        Segitiga.printInfo();
        System.out.println("Luas segtiga :" + Segitiga.hitungLuas());
    }
}
