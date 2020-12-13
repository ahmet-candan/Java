public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

    public void dogagaz_kullan(int miktar){
        if((this.bakiye-miktar)<0){
            System.out.println("Yeterli bakiye yok");
        }

        else{
            this.bakiye-=miktar;
            if(this.bakiye<=0){
                System.out.println("Bakiye bitti");
            }

            else{
                System.out.println("Yeni bakiye:"+ bakiye);
            }
        }
    }

    public void bakiye_ogren(){
        System.out.println(bakiye);
    }
}
