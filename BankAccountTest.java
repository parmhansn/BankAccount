public class BankAccountTest{
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.getAccountNumber());
        System.out.println(bankAccount1.getAccountNumber());
        bankAccount1.Deposit("Checking Account", 800);
        bankAccount1.Deposit("Saving Account", 500);
        bankAccount1.displayAccount();
        bankAccount1.Withdraw("Checking Account", 100);
        bankAccount1.Withdraw("Checking Account", 1000000);
    }
}