import java.util.ArrayList;

public class Main {

    public static void yazdır(ArrayList<String> a){

        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element "+ (i+1)+ ": "+ a.get(i));
        }
    }
    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>(); // arraylist isimli bir referans oluşturduk
        arraylist.add("Ahmet");
        arraylist.add("candan");
        arraylist.add("alper");
        arraylist.add("araba");
        System.out.println(arraylist.get(0));

        System.out.println(arraylist.size()); // arraylistin boyutunu bastırdık

        arraylist.remove(2); // 2. indexdeki elemanı çıkardık

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

        System.out.println(arraylist.indexOf("araba")); // index srası olarak karşısına çıkan ilk arabanın index numarasını verir
        System.out.println(arraylist.indexOf("bu değer yok"));// arraylistte olmayan -1 değer döner

        arraylist.set(0,"alper"); // arraylisti değiştirme

        yazdır(arraylist); //metoda arraylist gönderme

    }

}
