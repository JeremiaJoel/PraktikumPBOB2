/* Nama File : ExceptionOnArray.java
   Nama /NIM : Jeremia Joel Richard Ramalael / 24060122140109
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instalasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            // arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }

    }

}
