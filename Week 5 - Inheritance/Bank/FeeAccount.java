 public class FeeAccount extends BankAccount {
  private static final double FEE = 2.00;

  public FeeAccount()
  {
    super();
  }
  public FeeAccount(double bal)
  {
    super(bal);
  }
  public void deposit(double amount)
  {
    if((super.getBalance()+amount)>=FEE)
    {
     super.deposit(amount);
     super.withdraw(FEE);
    }
    else
    System.out.println("No enough funds for the Fee");
  }
  public void withdraw(double amount)
  {
    super.withdraw(amount + FEE);
  }
  public String toString() {     // overriding
    return super.getBalance()+ " (Fee: $" + FEE + ")";
} 

}
 