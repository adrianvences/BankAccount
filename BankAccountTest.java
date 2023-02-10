public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(0, 0);
    BankAccount account2 = new BankAccount(0, 0);
    account1.deposit("checkingAccount",200);
    account1.withdraw("checkingAccount", 110);
    account1.deposit("savingsAccount",200);
    account1.withdraw("savingsAccount", 110);
    // account2.deposit("savingsAccount",200);
    // account2.withdraw("savingsAccount", 210);

    // System.out.println("Checking: " + account1.getCheckingBalance());
    // System.out.println("Savings: " + account1.getSavingsBalance());
    System.out.println("Savings: " + account1.total());


    // System.out.println("Checking: " + account2.getCheckingBalance());
    // System.out.println("Savings: " + account2.getSavingsBalance());
  }
}
