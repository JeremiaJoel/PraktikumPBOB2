
/*
 * Nama : Jeremia Joel Richard Ramalael
 * NIM : 24060122140109
 * Nama File : Helicopter.java
 * Deskripsi : File class dari helicopter
 */

public class Helicopter extends Airplane {
    public double maxLoad;

    public Helicopter(double maxLoad) {
        super(maxLoad);
    }

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
