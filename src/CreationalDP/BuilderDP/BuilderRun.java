package CreationalDP.BuilderDP;

public class BuilderRun {
    public static void main(String[] args) {
        // bu uzun cözüm ve tavsiye edilmiyor,
        // 40 tane variable olsa yazmak zorlasir.
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("Descr");
        product1.setName("Name");
        product1.setPrice(100);

        // BuilderDP ile obje oluşturalım
        Product product2 = new Product.ProductBuilder().id(12L).
                                                        name("Name").
                                                        description("decr").
                                                        price(100).build();

        System.out.println("************* Product1 *********");
        System.out.println(product1);
        System.out.println("");
        System.out.println("************* Product2 *********");
        System.out.println(product2);




    }
}
