public class ProductManager {

    private BaseProductDao baseProductDao; //dependincy injection

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(Product product){
            baseProductDao.add(product);
            OracleProductDao oracleProductDao = new OracleProductDao("a");
            oracleProductDao.add(product);


        System.out.println("Ürün iş katamnı işlemleri");

    }
}
