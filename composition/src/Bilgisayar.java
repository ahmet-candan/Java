public class Bilgisayar {
    private Monitör monitör;
    private Kasa kasa;
    private Anakart anakart;

    public Bilgisayar(Monitör monitör, Kasa kasa, Anakart anakart) {
        this.monitör = monitör;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    public Monitör getMonitör() {
        return monitör;
    }

    public void setMonitör(Monitör monitör) {
        this.monitör = monitör;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
}
