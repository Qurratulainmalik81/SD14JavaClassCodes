public class TransactionFeeCheckingccount extends CheckingAccount {
private static final double FEE = 2.00;
public TransactionFeeCheckingccount()
{
    
}
public TransactionFeeCheckingccount(double interest) {
super(interest);
}
public TransactionFeeCheckingccount(double interest, double amount) 
{
    super(interest,amount);
}

  public void chargeFee() {
    withdraw(FEE);
  }
  public void deposit(double amount)
  {
    this.chargeFee();
    super.deposit(amount);
  }
  public void withdraw(double amount)
  {
    super.withdraw(amount + FEE);
  }

public String toString()
{
    return (super.toString() + " TFCA Fee: " + FEE);
}

}
