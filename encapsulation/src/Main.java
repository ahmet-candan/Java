public class Main {

    public static void main(String[] args) {
        Abone abone = new Abone();
        abone.isim ="ahmet";
        abone.bakiye=32;
        abone.sehir="ankara";
        abone.bakiye_ogren();

        //bakiye 120 den büyük olamayacağı için
        Gelismisabone gelismisabone=new Gelismisabone(200);
        gelismisabone.bakiye_ogren();
        }
    }

