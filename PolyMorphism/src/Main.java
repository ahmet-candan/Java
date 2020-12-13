class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "HAYVAN KONUŞUYOR";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor";
    }
}

class Köpek extends Hayvan{
    public Köpek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor";
    }
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor";
    }
}

public class Main { // çok biçimlilik : bir nesenenin birden farklı nesene gibi davranmasıdır

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {

       /* Hayvan hayvan = new Kedi("Limon"); // polymorphism
        Hayvan hayvan2= new Köpek("Karabasş");
        Hayvan hayvan3 = new At("Şahbaturr");

        System.out.println(hayvan.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/

        konustur(new Kedi("tekirr"));
        konustur(new Köpek("karabasş"));
        konustur((new At("Şahbaturr")));

        Köpek köpek = new Köpek("Karabşşşşş");


        if (köpek instanceof Köpek){ //
            System.out.println("Bu nesne köpek ve hayvan sınıfındandır");
        }

    }
}
