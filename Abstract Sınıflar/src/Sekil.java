public abstract class Sekil {

    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

    public void ismini_soyle(){
        System.out.println("Bu obje "+ isim+" objesidir");
    }

    abstract void alan_hesapla (); // soyut bir metod (gövdesiz) yazdığımız için alt classlar bu metodu yazmak zorundadır

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
