
/*
 * Nama : Jeremia Joel Richard Ramalael
 * NIM : 24060122140109
 * Nama File : Animal.java
 * Deskripsi : File class dari Animal
 */

public abstract class Animal {
    public abstract void eat();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
