package AAObjectClassPractice;

public class AccountBankTestCheck {
    public static void main(String[] args) {
        AccountBank  bankAcc =  new AccountBank();

        bankAcc.holderName = "jenifer";
        bankAcc.accNumber = 1234568261;
        bankAcc.type = "saving";
        bankAcc.balance = 1000;

        bankAcc.deposit(500);
        bankAcc.transfer(200);
        bankAcc.info();

    }
}
