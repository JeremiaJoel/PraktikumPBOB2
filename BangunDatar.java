/**
 * BangunDatar.java
 * Penulis: Jeremia Joel Richard Ramalael
 * Deskripsi:
 */
public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l)
    {
        luas = l;
    }

    public double getLuas()
    {
        return luas;
    }
}