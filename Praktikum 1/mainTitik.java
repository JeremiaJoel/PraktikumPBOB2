public class mainTitik
{
    public static void main(String[] args)
    {
        Titik T1 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(2);
        
        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(4);

        Titik T3 = new Titik(7,1);

        System.out.println("Jumlah objek titik adalah = " + Titik.getCounterTitik());
        System.out.println("t1(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        System.out.println("t1(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        System.out.println("t1(" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
        
    }    
}
