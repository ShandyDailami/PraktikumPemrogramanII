package PRAKTIKUM5.PRAK402_2210817210013_MuhammadShandyDailami;

public class Kucing extends HewanPeliharaan {
    String warnaBulu;
    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }
    public void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu: " + this.warnaBulu);
    }
}
