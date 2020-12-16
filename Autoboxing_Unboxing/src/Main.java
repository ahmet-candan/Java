import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); //Wrapper class kullandık çünkü ilkel veritipi kullanamayız

        for (int i = 0; i <10 ; i++) {
            arrayList1.add(Integer.valueOf(i*4));  // int olan i değerini kutuya aldık wrapper class cinside arrayliste atadık
        }                                           // Autoboxing
        for (int i = 0; i < arrayList1.size(); i++) {

            System.out.println(arrayList1.get(i).intValue());  //Unboxing java bu iki işlemi kendisi yapar bizim yapmamıza gerek yok

        }
    }
}
