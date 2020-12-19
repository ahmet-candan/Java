import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listeyi_bas(LinkedList<String> gidilecek_yerler){// linklist objemizin referansını gönderdik
       /* for (String a:gidilecek_yerler) {

            System.out.println(a);
        }*/

        ListIterator<String> iterator = gidilecek_yerler.listIterator(); // linklist üzerinde gezinmek için iteratör oluşturduk

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void sıralı_ekle(LinkedList<String> gidilecek_yerler,String yeni){//sıralı değer ekleme
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()){         //iteratör bir yeri gösteriyor mu hiçbir yeri göstermiyorsa linklist boş demektir yani döngüye girmeyiz ?

            int karsilastir = iterator.next().compareTo(yeni);    //yeni değeri küçükse karşılaştır 1 çıkar büyükse -1

            if (karsilastir == 0){
                //iki değer eşit
                System.out.println("Listenizde bu eleman zaten var...");
                return;
            }

            else if (karsilastir<0){
                //yeni değeri daha büyük
            }

            else if (karsilastir>0){
                //yeni değeri daha küçük

                iterator.previous(); // iteratörümüz 1 geri gelecek ve yeni değerimizi buraya ekledik
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);

    }

    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        /*gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor salonu");
        gidilecek_yerler.add("Ev");

        listeyi_bas(gidilecek_yerler);

        System.out.println("----------------------------");
        gidilecek_yerler.add(4,"Alışveriş merkezi");
        listeyi_bas(gidilecek_yerler);
        System.out.println("----------------------------");

        gidilecek_yerler.remove(3);
        listeyi_bas(gidilecek_yerler);*/

        sıralı_ekle(gidilecek_yerler,"Postane");
        sıralı_ekle(gidilecek_yerler,"Market");
        sıralı_ekle(gidilecek_yerler,"Ev");
        listeyi_bas(gidilecek_yerler);

    }

}
