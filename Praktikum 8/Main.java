/**
 * Jeremia Joel Richard Ramalael
 * 24060122140109
 */

class Kupu {
    void gerak() {
    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("ulat merayap");
    }
}

class Kepompong extends Kupu {
    void gerak() {
        System.out.println("kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    void gerak() {
        System.out.println("kupu terbang");
    }
}

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        Kepompong kepompong = new Kepompong();
        KupuDewasa kupuDewasa = new KupuDewasa();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(kepompong);
        anu.getIsi().gerak();

        anu.setIsi(kupuDewasa);
        anu.getIsi().gerak();
    }
}
