/*
Nama File : PrismaSegitiga.java
Nama      : Jeremia Joel Richard Ramalael
Nim       : 24060122140109
Deskripsi : Source code file body prisma segitiga
*/

public class PrismaSegitiga {
    private segitiga alasPrisma;
    private double tinggiPrisma;

    public PrismaSegitiga(segitiga alas, double tinggi) {
        alasPrisma = alas;
        this.tinggiPrisma = tinggi;
    }

    public void setalasPrisma(segitiga alas) {
        alasPrisma = alas;
    }

    public void settinggiPrisma(double tinggi) {
        tinggiPrisma = tinggi;
    }

    public segitiga getalasPrisma() {
        return alasPrisma;
    }

    public double gettinggiPrisma() {
        return tinggiPrisma;
    }

    public double hitungVolume() {
        double luasAlas = alasPrisma.hitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double hitungLuasPermukaan() {
        double kelilingSegitiga = 3 * alasPrisma.getAlas();
        double luasPermukaan = ((2 * alasPrisma.hitungLuas()) + (kelilingSegitiga * tinggiPrisma));
        return luasPermukaan;

    }
}
