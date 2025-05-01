package pro;

public class Bilet {
	private String tur;// private : dışarıdan doğrudan erişilmesini engeler 
    private double fiyat;
// Public Constructor ile değer atanıyor
    public Bilet(String tur, double fiyat) {
        this.tur = tur;
        this.fiyat = fiyat;
    }
// Getter ile güvenli hale getiriyoruz 
    public String getTur() {
        return tur;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return tur + " bileti - " + fiyat + " TL";
    }
}
