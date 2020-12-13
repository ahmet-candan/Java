public class Gelismisabone {

    private int bakiye=120;

    public Gelismisabone(int bakiye){

        if(bakiye>=0 && bakiye<=120){
            this.bakiye=bakiye;
        }

    }

    public void bakiye_ogren(){
        System.out.println(bakiye);
    }
}
