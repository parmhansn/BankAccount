import java.util.Random;
import java.util.Scanner;


public class BankAccount{
    String accountNumber;
    private double checkingAcct = 0;
    private double savingAcct = 0; 
    private static int numOfAccounts = 0;
    private static int accountCount = 0;

    private String AcctNumber(){ //the AcctNumber method uses the Math.random method. 
        Random rand = new Random();
        String accountNumber = "";
        for (int i = 0; i < 10; i++){
            Integer number = rand.nextInt(9);

            accountNumber += Integer.toString(number);
        }
        return accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public BankAccount(){  //this is a constructor method.
        this.accountNumber = AcctNumber();
        this.checkingAcct = checkingAcct;
        this.savingAcct = savingAcct;
        accountCount++;
    }
    
    //Methods
    public void Deposit(String accountType, double Amount){
        if(accountType == "Checking Account"){
            this.setcheckingAcct(Amount);
            accountCount += Amount;
        }
        else if(accountType == "Saving Account"){
            this.setsavingAcct(Amount);
            accountCount+= Amount;
        }
        else{
            System.out.println("Enter 'Checking Account' or 'Saving Account'");
        }
    }

    public void Withdraw(String accountType, double Amount) {
        double checkBalance = this.getcheckingAcct();
        double savingBalance = this.getsavingAcct();
        if (accountType == "Checking Account"){
            if (checkBalance < Amount){
                System.out.print("Insufficient Funds");
            }else{
                this.setcheckingAcct(-Amount);
                accountCount-= Amount;
                System.out.println(("You have $" +Amount + " from your checking account!"));
            }
        }
        else if(accountType == "Saving Account"){
            if (savingBalance < Amount){
                System.out.println("Insufficient Funds");
            }else{
                this.setsavingAcct(-Amount);
                accountCount -= Amount;
                System.out.println("You have $" +Amount+ " from your saving account");
            }
        }else{
            System.out.println("Enter 'checking account' or 'saving account'");
        }
        
    }

    public void displayAccount(){
        double total = this.checkingAcct + this.savingAcct;
        System.out.println("***************");
        System.out.println("Account #: " + this.accountNumber);
        System.out.println("Checking Account Balance: $" + this.checkingAcct);
        System.out.println("Saving Account Balance: $" + this.savingAcct);
        System.out.println("Total: $" + total);
        System.out.println("***************");
    }

    //getters
    public double getcheckingAcct() {
        return this.checkingAcct;
    }

    public void setcheckingAcct(double Amount){
        this.checkingAcct += Amount;
    }

    public double getsavingAcct(){
        return this.savingAcct;
    }

    public void setsavingAcct(double Amount){
        this.savingAcct += Amount;
    }

    
}