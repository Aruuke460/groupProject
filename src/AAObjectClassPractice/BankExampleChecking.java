package AAObjectClassPractice;

public class BankExampleChecking {
    public static void main(String[] args) {
        BankAccount AccInfo = new BankAccount();

        AccInfo.holderName = "Ashley";
        AccInfo.accountNumber = 111225767;
        AccInfo.type = "credit card";
        AccInfo.balance = 2000;

        AccInfo.deposit(300);
        AccInfo.transfer(800);
        AccInfo.info();
    }
}
