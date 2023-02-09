package inheritance2;

public class CustomerManager {
    public void add(Logger logger){
        //musteri ekleme kodlari
        System.out.println("musteri eklendi");
       /* DatabaseLogger logger=new DatabaseLogger();
        logger.log();*/ // bu bele yazilmaz bunun ucun gedub add metodunun icine Logger logger atiriq
    }
}
