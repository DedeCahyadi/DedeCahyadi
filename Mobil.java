public abstract class Mobil{
    protected String nama;
    protected int jumlah;
    public Mobil(String nama, int jumlah){
        this.nama=nama;
        this.jumlah=jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void displayMobil(){
        System.out.println("Nama Mobil: "+getNama());
        System.out.println("Jumlah Tersedia: "+getJumlah());
    }
}