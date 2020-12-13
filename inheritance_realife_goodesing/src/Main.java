public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new OracleProductDao("orackle string"));
        productManager.add(new Product(2,"çikolata",3));
    }
}
