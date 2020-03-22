package AAObjectClassPractice;

public class CheckBankAcc {
    public static void main(String[] args) {
       BankAccount Accounts = new BankAccount();

       Accounts.holderName = "Erica";
       Accounts.accountNumber = 245428261;
       Accounts.balance = 2200;
       Accounts.type = "checking";

        Accounts.deposit(100);
        Accounts.transfer(400);
        Accounts.info();

    }
}
