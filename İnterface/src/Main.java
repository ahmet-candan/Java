public class Main { // interfacin metodlarının kod blokları yazılmaz, ve obje oluşturamayız sadece interfaceye uyanan claswlara referans olabiliriz
                    // interfacelerin içinde özellik bulunmaz sadece final ve static bulunabilir
                    // interface sadece onu implement eden classların objelerine referans olabilir
    public static void main(String[] args) {

        PcMuhendisi mühendis = new PcMuhendisi(false,false);

        mühendis.Askerlik_sorgula();
        mühendis.adli_sicil_sorgula();
        System.out.println(mühendis.mezuniyet_ortalaması((3.07)));
        String[] tecrube ={"Vestel","havelsan"};
        mühendis.is_tecrübesi(tecrube);

        MakineMühendisi mühendis2 = new MakineMühendisi(false,false);

        String[] tecrübe= { };
        String[] referans = {"İsmail saygılı"};

        mühendis2.adli_sicil_sorgula();
        mühendis2.Askerlik_sorgula();
        System.out.println(mühendis2.mezuniyet_ortalaması(2.31));
        mühendis2.is_tecrübesi(tecrube);
        mühendis2.referans_getir(referans);



    }


}
