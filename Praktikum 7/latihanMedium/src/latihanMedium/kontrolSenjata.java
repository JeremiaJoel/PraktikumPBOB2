
package latihanMedium;


public class kontrolSenjata {
    private Senjata senjata;
    
    public kontrolSenjata(Senjata S)
    {
        this.senjata = S;   
    }
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public int isiPeluru(int jumPeluru){
        int sisaPeluru = senjata.getPeluru();
        int peluruNow = sisaPeluru + jumPeluru;
        senjata.setPeluru(peluruNow);
        System.out.println("Peluru berhasil ditambah: " + peluruNow);
        return peluruNow;
    }
    public void menembak(int jumlah){
        if(isAdaPeluru()){
            System.out.println("Siap menembak: " + jumlah + " kali");
            if(senjata.getPeluru() > jumlah){
                for (int i = 0; i < jumlah; i ++){
                    System.out.println(senjata.getBunyi());
                }
                int sisaPeluru = senjata.getPeluru() - jumlah;
                System.out.println("Sisa Peluru: " + sisaPeluru);
            }else{
                for (int i = 0 ; i < senjata.getPeluru(); i ++){
                    System.out.println(senjata.getBunyi());
                }
                int notEnough = jumlah - senjata.getPeluru();
                for (int i = 0 ; i < notEnough ; i ++){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
           
        }else{
            System.out.println("Siap menembak: " + jumlah + " kali");
            System.out.println("Peluru Habis");
        }
    }

    
}
