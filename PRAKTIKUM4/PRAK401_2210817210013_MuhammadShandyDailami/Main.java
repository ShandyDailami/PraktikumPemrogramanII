package PRAKTIKUM4.PRAK401_2210817210013_MuhammadShandyDailami;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = input.nextLine();
        System.out.print("Ras: ");
        String ras = input.nextLine();

        HewanPeliharaan Hewan1 = new HewanPeliharaan(ras, nama);
        Hewan1.display();
    }
}
