import java.sql.*;

public class Baglanti {

    private String kullanici_adi = "root";
    private String parola ="";
    private String db_ismi="demo";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public void preparedCalisanlarıGetir(int id){

        String sorgu = "Select * From calisanlar where id > ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String ad = rs.getString("ad");
                String soyad = rs.getString("soayd");
                String email = rs.getString("email");
                System.out.println(" Ad: "+ad+" Soyisim: "+soyad+" Email:"+email);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    private void calisanEkle(){

        try {
            statement =con.createStatement();
            String ad = "Semih";
            String soyad ="demir";
            String email = "deneme@ha";
            String sorgu = "insert into calisanlar (ad,soayd,email) values (" + "'"+ ad+"',"+"'"+soyad+"',"+"'"+email+"')";

            statement.executeUpdate(sorgu);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void bilgileriGoster(){

        String sorgu ="Select * From calisanlar";
        try {

            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()){
            int id = rs.getInt("İd");
            String isim = rs.getString("ad");
            String soyisim = rs.getString("soayd");
            String mail = rs.getString("Email");
            System.out.println("İd:"+id+" Ad: "+isim+" Soyisim: "+soyisim+" Email:"+mail);
        }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void guncelle() {
        try {
            statement = con.createStatement();
            String sorgu ="Update calisanlar Set email='candan@gmal.com' WHERE id =1";
            statement.executeUpdate(sorgu);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void sil(){
        try {
            statement = con.createStatement();
            String sorgu =" Delete From calisanlar where id>3";
            statement.executeUpdate(sorgu);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    public Baglanti(){
        String url = "jdbc:mysql://"+host+":"+port+"/"+db_ismi+"?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {

            System.out.println("Driver bulunamadı");

        }

        try {
            con = DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");
        }

    }

    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        baglanti.bilgileriGoster();
        System.out.println("*****************");
        baglanti.calisanEkle();
        baglanti.bilgileriGoster();
        System.out.println("*****************");
        baglanti.guncelle();
        baglanti.bilgileriGoster();
        System.out.println("*****************");
        baglanti.sil();
        baglanti.bilgileriGoster();
        System.out.println("*****************");
        baglanti.preparedCalisanlarıGetir(2);


    }
}
