import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r)
    {
        this.jejari = r;
    }

    public double hitungLuas()
    {
        return PI*jejari*jejari;
    }
}
