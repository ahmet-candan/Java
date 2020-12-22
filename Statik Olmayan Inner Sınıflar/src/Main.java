import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*

        1. Statik olmayan Inner Classlar
        2.Statik Classlar
        3.Lokal(yerel) Inner Classlar
        4. Anonyimus (Anonim) Inner Classlar

         */

        Matematik.Faktoriyel faktoriyel = new Matematik().new Faktoriyel();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.Daire_alan dairealan = new Matematik().new Alan().new Daire_alan();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tane sayı giriniz: ");
        int sayi= scanner.nextInt();

        if(asal.asal_mi(sayi)){
            System.out.println("Bu sayı asaldır");
        }
        else{
            System.out.println("Bu sayı asal değildir");
        }
        faktoriyel.faktoriyel();
        //alan.daire_alan(5);
        dairealan.daire_alan(5);
    }
}
