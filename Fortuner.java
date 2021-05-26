public class Fortuner extends Mobil implements Diesel{
    private String warna;
    public Fortuner(String nama, int jumlah, String warna){
        super(nama,jumlah);
        this.warna=warna;
    }
    public void displayMakan(){
        System.out.println("Jenis Bahan Bakar: "+jenisD);
        System.out.println("Bahan Bakar: "+bahanbakarD);
    }
    public void displayMobil(){
        System.out.println("Nama Mobil: "+getNama());
        System.out.println("Jumlah Tersedia: "+getJumlah());
    }
    public void displayData(){
        displayMakan();
        displayMobil();
        System.out.println("Warna Mobil: "+warna);
    }
}