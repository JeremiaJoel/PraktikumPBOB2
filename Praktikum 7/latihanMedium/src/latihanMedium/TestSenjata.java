
package latihanMedium;

/**
 *
 * @author Jeremia Joel Richard
 */
public class TestSenjata {
    public static void main(String[] args){
        Senjata AK47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        kontrolSenjata kontrolAK47 = new kontrolSenjata(AK47);
        kontrolSenjata kontrolm16 = new kontrolSenjata(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("===============================");
            
        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
        
    }
}
