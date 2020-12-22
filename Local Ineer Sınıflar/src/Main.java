public class Main {

    public static void main(String[] args) { // local innerde public ve static kullanamayız

        class Alan{ // bu metod bittiğinde clasımız yok olur dier metodlardan erişemeyiz
            public void daire_alan(int yaricap){
                System.out.println("Dairenin alanı: "+(yaricap*yaricap*Math.PI));


            }
        }

        Alan alan = new Alan();
        alan.daire_alan(10);
    }

    public static void deneme(){

    }
}
