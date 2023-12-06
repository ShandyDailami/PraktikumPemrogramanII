package PRAKTIKUM3.PRAK301_2210817210013_MuhammadShandyDailami;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }
    public void acakNilai() {
        Random acak = new Random();
        nilai = acak.nextInt(6) + 1;
    }
    public int getNilai() {
        return nilai;
    }
}