/*
Nama File : mainGaris.java
Nama      : Jeremia Joel Richard Ramalael
Nim       : 24060122140109
Deskripsi : Source code file main garis
*/

public class mainGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(2, 4);
        Titik t2 = new Titik(3, 6);

        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();

        System.out.println("Titik awal = (" + tAwal.getAbsis() + "," + tAwal.getOrdinat() + ")");
        System.out.println("Titik akhir = (" + tAkhir.getAbsis() + "," + tAkhir.getOrdinat() + ")");
        ;
        Garis GrefleksiY = G.getRefleksiY();
        Titik tAwalRefleksiY = GrefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GrefleksiY.getTitikAkhir();

        System.out.println(
                "Refleksi Titik awal = (" + tAwalRefleksiY.getAbsis() + "," + tAwalRefleksiY.getOrdinat() + ")");
        System.out
                .println("Refleksi Titik akhir = (" + tAkhirRefleksiY.getAbsis() + "," + tAkhirRefleksiY.getOrdinat()
                        + ")");
        System.out.println("Garis G tegak lurus dengan garis GRefleksiY = " + G.isTegakLurus(GrefleksiY));
    }

}
