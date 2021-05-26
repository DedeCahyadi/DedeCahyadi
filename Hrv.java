public class Hrv extends Mobil implements Bensin{
    private String warna;
    public Hrv (String nama, int jumlah, String warna){
        super(nama, jumlah);
        this.warna=warna;
    }
    public void displayMakan(){
        System.out.println("Jenis Bahan Bakar: "+jenisB);
        System.out.println("Bahan Bakar: "+bahanbakarB);
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