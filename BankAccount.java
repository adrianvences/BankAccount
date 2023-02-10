public class BankAccount {

  // member variables
  private double checkingBalance;
  private double savingsBalance; 
  static int numberOfAccounts = 0;
  static double totalMoneyInAccounts = 0.0;

  // constructor
  public BankAccount(double checkingBalance, double savingsBalance) {
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    BankAccount.numberOfAccounts++;
    }

  // methods

  // Deposit method
  public double deposit(String account ,double amount) {
    if(account == "checkingAccount") {
    this.checkingBalance = this.checkingBalance + amount;
    return this.checkingBalance;
  }
    else {
      this.savingsBalance = this.savingsBalance + amount;
      return this.savingsBalance;
    }
    }

  // Withdraw method
  public double withdraw (String account,double amount) {
    if(account == "checkingAccount") {
      if(amount <= this.checkingBalance){
      this.checkingBalance = this.checkingBalance - amount;
      return this.checkingBalance; }
      else{
        System.out.println("You are over drafting in your checking !!!");
        return 0.0;
      }
    } else {
      if (amount <= this.savingsBalance){
        this.savingsBalance = this.savingsBalance - amount;
      return this.savingsBalance;
      }
      else{
        System.out.println("You are over drafting in your savings!!!");
        return 0.0;
      }
    
    } 
  }
  
  public double total() {
    double sum = 0.0;
    sum += this.checkingBalance + this.savingsBalance;
    return sum;
  }


  


  //getter

  public double getCheckingBalance() {
    return this.checkingBalance;
  }

  public void setCheckingBalance(double checkingBalance) {
    this.checkingBalance = checkingBalance;
  }

  // 
  public double getSavingsBalance() {
    return this.savingsBalance;
  }

  public void setSavingsBalance(double savingsBalance) {
    this.savingsBalance = savingsBalance;
  }



}