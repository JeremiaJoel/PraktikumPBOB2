/* Nama File : MPrismaSegitiga.java
 * Nama      : Jeremia Joel Richard Ramalael
 * Nim       : 24060122140109
 * Deskripsi : source code file main prisma segitiga
 */

public class MPrismaSegitiga {
    public static void main(String[] args) {
        segitiga S1 = new segitiga(3, 4);
        // Asumsikan prisma segitiga sama sisi

        PrismaSegitiga P = new PrismaSegitiga(S1, 0); // Asumsikan tinggi belum di input
        P.settinggiPrisma((5));

        System.out.println("Panjang alas segitiga adalah = " + S1.getAlas());
        System.out.println("Tinggi dari segitiga adalah = " + S1.getTinggi());
        System.out.println("Luas alas prisma segitiga adalah = " + S1.hitungLuas());
        System.out.println("Keliling segitiga adalah = " + S1.hitungKeliling());
        System.out.println("Tinggi prisma segitiga adalah = " + P.gettinggiPrisma());
        System.out.println("Volume prisma segitiga adalah = " + P.hitungVolume());
        System.out.println("Luas permukaan prisma segitiga dalah = " + P.hitungLuasPermukaan());
        // Asumsikan alas prisma berbentuk segitiga sama sisi

    }

}
