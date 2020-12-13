public class Test {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);

        Monitör monitör = new Monitör("vsde","asus","12.5",resolution);
        Kasa kasa = new Kasa("Shadow","balde","cam");

        Anakart anakart = new Anakart("B230","ASUS","10","LİNUX");

        Bilgisayar pc = new Bilgisayar(monitör,kasa,anakart);

        pc.getKasa().pc_ac();
        pc.getMonitör().monitoru_kapa();
        pc.getAnakart().isletim_sistemi_yukle("ubuntu");

    }
}
