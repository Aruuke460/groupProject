package AAObjectClassPractice;

public class BankAccountPractice {
/*. Create a class BankAccount
Instance variables: type, accountNumber, balance,
holderName Methods:
deposit. Method accepts double and it doesn't return anything.
 Method should simply print “%double is deposited to your account”
  and add given double to the balance.
transfer -> accepts double -> Method should print
 “%double $ is transferred from your account” and decrement
  balance by given amount.
info -> Method doesn't accept or return anything.
 It should simply print the information about the BankAccount as below format
Name: %holderName
Balance: %balance
Type: %type
Account Number: %accountNumber*/
 String type;
 int accountNumber;
 double balance;
 String holderName;

 public void deposit(double amount){
     System.out.println(balance + "is deposited to your account");
     balance += amount;
 }
 public void transfer(double givenAmount) {
     if (givenAmount <= balance) {
         System.out.println(givenAmount + "is transferred from your account ");
         balance -= givenAmount;
     } else {
         System.out.println("Not enough money");
     }

 }
 public void info(){
     System.out.println("Name: " + holderName);
     System.out.println("Balance: " + balance);
     System.out.println("Type: " + type);
     System.out.println("Account number: " + accountNumber);

 }
}
