import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz");

        String islemler = "İslemler...\n"
                        +"1. Yazılımcı İşlemleri\n"
                +"2. Yönetici İşlemleri\n"
                        +"q. Çıkış İşlemleri\n";
        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");

        while (true) {
            System.out.print("İşlemi Seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor");
                break;
            }

            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Ahmet","Candan",1,"Python,java");
                String yazilimci_islem = "1. Format at\n"+
                                        "2. Bilgileri Göster\n"
                                        +"Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
                while(true){
                    System.out.println("İşleminizi Girin:");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    }

                    else if (y_islem.equals("1")){
                        System.out.println("İşletim Sistemi: ");
                        String isletim = scanner.nextLine();
                        yazilimci.formatAt(isletim);
                    }

                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }

                    else{
                        System.out.println("Yanlış bir işlem seçtiniz..");
                    }
                }
            }

            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("İsmail","Saygılı",2,10);
                String yonetici_islem = "1. Zam Yap\n"+
                        "2. Bilgileri Göster\n"
                        +"Çıkış için q'ya basın";
                System.out.println(yonetici_islem);

                while(true){
                    System.out.println("İşleminizi Girin:");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor.");
                        break;
                    }

                    else if (y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zam_yap(miktar);
                    }

                    else if (y_islem.equals("2")){
                        yonetici .bilgileriGoster();
                    }

                    else{
                        System.out.println("Yanlış bir işlem seçtiniz..");
                    }
                }
            }

            else{
                System.out.println("Geçersiz işlem....");
            }



        }
    }
}
