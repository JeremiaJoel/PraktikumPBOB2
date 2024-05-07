// Jeremia Joel Richard Ramalael
// 24060122140109


package latihanveryeasy;
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    private String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
       System.out.println(getBunyi());
       int sisaPeluru = getPeluru() - 1;
       System.out.println("Sisa Peluru = " + sisaPeluru);
    }
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    
    
    
}
