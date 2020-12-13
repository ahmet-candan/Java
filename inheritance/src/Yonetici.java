public class Yonetici extends Calisan{

    private int sorumlu_kişi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kişi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kişi_sayisi = sorumlu_kişi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu lişi sayısı: "+sorumlu_kişi_sayisi);
    }

    public void zam_yap(int zamMiktarı){

        System.out.println(getAd()+ " çalışanlara "+ zamMiktarı + " kadar zaman yapılıyor.");

    }
}
