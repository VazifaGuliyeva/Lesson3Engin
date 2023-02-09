package inheritance2;

public class Main {
    public static void main(String[] args) {
        LogManager logManager=new LogManager();
        /*logManager.log(2);// -> file e loglandi
        logManager.log(3); // ->emaile loglandi */
        CustomerManager customerManager=new CustomerManager();
        customerManager.add(new DatabaseLogger());/* CustomerManager in icinde olan add metoduna Logger logger yazdigimiz ucun burda istediyimizi iceri daxil ede bilirik ister Filelogger
          ister Emailloger*/

    }
}
