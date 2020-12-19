public class MakineMühendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMühendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void Askerlik_sorgula() {

        if (askerlik){
            System.out.println("Askerliğimi yaptım");
        }

        else {
            System.out.println("Askerliğimi henüz yapmadım");
        }

    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam:"+ derece;
    }

    @Override
    public void adli_sicil_sorgula() {

        if (adli_sicil){
            System.out.println("Adli sicil kaydım bulunuyor");
        }

        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor");
        }

    }

    @Override
    public void is_tecrübesi(String[] array) {

        if (array.length==0){
            System.out.println("Herhangi bir iş tecrübem bulunmuyor");
        }
        else {
            System.out.println("Makine mühendisi olarak şu şirketlered çalıştım");

            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i]);

            }
        }

    }

    public void referans_getir(String[] array){

        if (array.length == 0){
            System.out.println("Herhangi bir referansım bulunmuyor");
        }

        else{
            System.out.println("Referanslarım....");
            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i]);

            }
        }
    }
}
