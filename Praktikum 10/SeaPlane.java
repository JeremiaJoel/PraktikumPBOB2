
/*
 * Nama : Jeremia Joel Richard Ramalael
 * NIM : 24060122140109
 * Nama File : SeaPlane.java
 * Deskripsi : File class dari SeaPlane
 */

public class SeaPlane extends Airplane {
    public double maxLoad;

    public SeaPlane(double maxLoad) {
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
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
