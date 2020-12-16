public class Main {
    public static void main(String[] args) {

        String a = "Ahmet";
        String b = new String("Candan");

        System.out.println("Harf sayısı:"+ b.length()); //Stringin boyutu

        System.out.println("0. index: "+ b.charAt(0)); // stringin indexini alma

        System.out.println(b.startsWith("Mu")); // b stringi mu ile başlıyorsa true gelmiyorsa false
        System.out.println(b.endsWith("an"));

        System.out.println(b.indexOf('a')); // harfi veya stringi bulur ve indexini verir

        System.out.println(b.toLowerCase()); // büyük karakterlerin hepsini küçültür
        System.out.println(b.toUpperCase()); // karakterlerin hepsi büyür

        String c = "1234";
        int d = Integer.parseInt(c); // c değişkenindeki stringi inte çevirdik
        System.out.println(d);

        String a1 = "Ahmet";
        String a2 = "Ahmet";
        if (a1==a2){
            System.out.println("Değişkenler Eşit");
        }

        String b1 = new String("Candan");
        String b2 = new String("Candan");
        if (b1==b2){
            System.out.println("Eşitler"); // buraya giremz çünkü iki metod farklı yeri gösteriyor
        }

        if (b1.equals(b2)){
            System.out.println("Metodların değerleri eşit"); // equals içeriğin eşit oluo olmadığını kontrol eder
        }

    }
}
