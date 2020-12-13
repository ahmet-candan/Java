public class ProductManager {

    public void add(Product product,int databaseType){

        if (databaseType==1){
            MysqlProductDao mysqlProductDao = new MysqlProductDao("rt ");
            mysqlProductDao.add(product);
        }

        else if ( databaseType==2) {
            //İş katmanı
            OracleProductDao oracleProductDao = new OracleProductDao("a");
            oracleProductDao.add(product);
        }

        System.out.println("Ürün iş katamnı işlemleri");

    }
}
