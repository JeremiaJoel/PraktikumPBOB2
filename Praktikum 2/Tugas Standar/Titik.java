/*
Nama File : Titik.java
Nama      : Jeremia Joel Richard Ramalael
Nim       : 24060122140109
Deskripsi : Source code file body Titik
*/
public class Titik {
    private double absis;
    private double ordinat;
    static double counterTitik;

    Titik(double absis, double ordinat) {

        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static double getCounterTitik() {
        return counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

}
