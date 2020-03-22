package objectClass;

public class MyAccountAccess {
    public static void main(String[] args) {
        BankAccount credentials =  new BankAccount();

        credentials.acccountHolder = "Aruuke";
        credentials.acNumber = 12345;
        credentials.balance = 5000;
        credentials.type = "checking";

        //credentials.transferMoney(1100);
        //System.out.println(credentials.balance);
        credentials.info();
        credentials.transferMoney(5000);



    }

}
