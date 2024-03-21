/**
 * File : buku.java
 * Penulis : Jeremia Joel Richard Ramalael
 * Deskripsi: representasi dasar dari objek buku
 */

package bk.buku;

public class Buku {
    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String gettahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String Judul) {
        judul = Judul;
    }

    public void setPenulis(String Penulis) {
        penulis = Penulis;
    }

    public void view() {
        System.out.println("Buku berjudul " + getJudul() + " dengan penulis " + getPenulis() + " dan terbit pada tahun "
                + gettahunTerbit());
    }
}