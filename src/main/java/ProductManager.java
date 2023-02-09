public class ProductManager {
    public void addToCart(Product product){
        System.out.println("Sepete eklendi"+product.getName());//product.name xeta atdi cunki private olub ve ona kenardan ulasmaq ucun getterden istifade etmek lazimdir
    }
}
