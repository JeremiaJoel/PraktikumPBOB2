
/*
 * Nama : Jeremia Joel Richard Ramalael
 * NIM : 24060122140109
 * Nama File : Vehicle.java
 * Deskripsi : File class dari Vehicle
 */

public abstract class Vehicle {
    public double calcFuelEffiecency;
    public double caclTripDistance;

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
