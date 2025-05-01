package pro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in)) {
			Gise gise = new Gise();

	        while (true) {
	            System.out.println(" 🏛️ 25 Aralık Panorama  Müzesi 🏛️ ");
	            System.out.println("1. Tam Bilet (50 TL)");
	            System.out.println("2. Öğrenci Bileti (30 TL)");
	            System.out.println("3. Yaşlı Bileti (20 TL)");
	            System.out.println("4. Rapor Al");
	            System.out.println("0. Çıkış");
	            System.out.print("Seçiminiz: ");
	            int secim = scanner.nextInt();

	            switch (secim) {
	                case 1 -> gise.biletSat(new Bilet("Tam", 50));
	                case 2 -> gise.biletSat(new Bilet("Öğrenci", 30));
	                case 3 -> gise.biletSat(new Bilet("Yaşlı", 20));
	                case 4 -> gise.raporAl();
	                case 0 -> {
	                    System.out.println("Programdan çıkılıyor...");
	                    return;
	                }
	                default -> System.out.println("❌ Geçersiz seçim.");
	            }
	        }
		}
	    }

	}


