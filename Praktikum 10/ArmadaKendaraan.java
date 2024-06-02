
/*
* Nama : Jeremia Joel Richard Ramalael
* NIM  : 24060122140109
* Nama File : ArmadaKendaraan.java
* Deskripsi : File class dari ArmadaKendaraan
*/

import java.util.*;

public class ArmadaKendaraan {
    private List<Vehicle> allArmada = new ArrayList<>();

    public void tambahArmada(List<? extends Vehicle> armada) {
        allArmada.addAll(armada);
    }

    public List<Vehicle> getAllArmada() {
        return allArmada;
    }
}
