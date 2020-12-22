public class Main { // anonim inner classlarda classa ihtiyaç duymadan obje oluşturabiliriz

    public static void main(String[] args) {

        IOgrenci ogrenci = new IOgrenci() {

            @Override
            public void ders_calis() {
                System.out.println("DERS çalışıyorum");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum");


            }
        };

    ogrenci.ders_calis();
    ogrenci.derse_gir();
    System.out.println("******************");

    AOgrenci ogrenci1 = new AOgrenci("ahmet candan",123){

        @Override
        void kayıt_yaptır() {
            System.out.println("Kayıt yapılıyor.. "+getIsim());
        }
    };
    ogrenci1.kayıt_yaptır();
    ogrenci1.selamla();
    }

    public static abstract class AOgrenci{

        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }



        abstract void kayıt_yaptır(); // soyut metod
        public void selamla(){
            System.out.println("Selamlarr");
        }
    }


    public interface IOgrenci{

        void ders_calis();
        void derse_gir();
    }
}
