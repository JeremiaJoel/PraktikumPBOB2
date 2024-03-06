/* Nama File : Asersi1.java
   Nama /NIM : Jeremia Joel Richard Ramalael / 24060122140109
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("Nilai x = " + x);
        } else {
            assert (x < 0) : "kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
