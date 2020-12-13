public class Anakart {

    private String model;
    private String üretici;
    private String yuva;
    private String isletim_sistemi;

    public Anakart(String model,String üretici,String yuva,String isletim_sistemi){

        this.model = model;
        this.üretici = üretici;
        this.yuva = yuva;
        this.isletim_sistemi = isletim_sistemi;
    }

    public  void isletim_sistemi_yukle(String isletim_sistemi){

        this.isletim_sistemi = isletim_sistemi;
        System.out.println("İşletim sistemi yüklendi:"+isletim_sistemi);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public String getYuva() {
        return yuva;
    }

    public void setYuva(String yuva) {
        this.yuva = yuva;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }


}
