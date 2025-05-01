package pro;
import java.util.ArrayList;


public class Gise {
	private ArrayList<Bilet> satilanBiletler = new ArrayList<>();

    public void biletSat(Bilet bilet) {
        satilanBiletler.add(bilet);
        System.out.println("✅ Satış başarılı: " + bilet);
    }

    public void raporAl() {
        double toplam = 0;
        System.out.println("\n📊 Satılan Biletler:");
        for (Bilet b : satilanBiletler) {
            System.out.println("- " + b);
            toplam += b.getFiyat();
        }
        System.out.println("💰 Toplam Kazanç: " + toplam + " TL");
    }
}
