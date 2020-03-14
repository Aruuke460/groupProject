package objectClass;

public class BankAccount {

    String acccountHolder;
    int acNumber;
    String type;
    int balance;


    public void transferMoney(int amount){
        if(amount > balance){
            System.out.println("You balance is not enough");
        }
        else{
            System.out.println("Your transfer is successful");
            balance -= amount;
        }
    }
   public void info(){
       System.out.println("Name: " + this.acccountHolder);
       System.out.println("Balance: " + this.balance + "$");
       System.out.println("Type: " + this.type);
       System.out.println("Account number: " + this.acNumber);
   }

}
