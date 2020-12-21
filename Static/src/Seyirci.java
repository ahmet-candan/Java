public class Seyirci {

    private String isim;

    private static int seyirci_sayısı=0;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayısı++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyun_seyret(){
        System.out.println(isim+" oyun seyrediyor");
    }

    public static int getSeyirci_sayısı(){
        return seyirci_sayısı;
    }
}
