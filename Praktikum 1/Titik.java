/**Jeremia Joel Richard Ramalael */
/** 24060122140109 */

public class Titik
{
    double absis;
    double ordinat;
    static double counterTitik;

    Titik()
    {
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }

    Titik(double a , double o)
    {
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    void setAbsis(double a)
    {
        absis = a;
    }

    void setOrdinat(double o)
    {
        ordinat = o;
    }

    double getAbsis()
    {
        return absis;
    }

    double getOrdinat()
    {
        return ordinat;
    }

    static double getCounterTitik()
    {
        return counterTitik;
    }
}
