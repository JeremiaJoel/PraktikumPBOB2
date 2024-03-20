import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai jejari lingkaran : ");
        Lingkaran l = new Lingkaran(scan.nextDouble());
        System.out.println("Luas lingkaran adalah " + l.hitungLuas());
    }
}
