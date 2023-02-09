package inhetitance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer engin=new IndividualCustomer();
        engin.customerNumber="12345";

        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="678910";

        SendikaCustomer abc=new SendikaCustomer();
        abc.customerNumber="89654";

        CustomerManager customerManager=new CustomerManager(); //bu prosesler polimorfizim adlandi
       /* customerManager.add(engin);
        customerManager.add(hepsiBurada);
        customerManager.add(abc);*/

        Customer [] customers={engin,hepsiBurada,abc};/* yuxaridai prosesi bir dovre saldi*/
        customerManager.addMultiple(customers);

    }
}
