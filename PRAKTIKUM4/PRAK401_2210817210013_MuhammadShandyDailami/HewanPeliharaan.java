package PRAKTIKUM4.PRAK401_2210817210013_MuhammadShandyDailami;
public class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}