
public class Main {
    public static void main(String[] args) {
        Product product1=new Product(1,"LenevoV14",15000,"16 gb Ram",10);

        Product product2=new Product();
       /* product2.id=2;
        product2.name="Lenevo v15";
        product2.unitPrice=16000;
        product2.detail="32 GB Ram";
        product2.discount=10;
        product2.unitPriceafterDiscount=14400;*/ // private edende artiq buralar xeta atir ona setterler vasitesile deyer veririk

        product2.setId(2);
        product2.setName("Lenevo v15");
        product2.setUnitPrice(16000);
        product2.setDetail("32 GB Ram");
        product2.setDiscount(10);
        System.out.println(product2.getUnitPriceafterDiscount());

        Category category=new Category();
        category.setId(1);
        category.setName("icecek");

        Category category1=new Category();
        category1.setId(2);
        category1.setName("yiyecek");

        System.out.println(category.getName());
        System.out.println(category1.getName());
    }
}
