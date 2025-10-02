public class CheckingAccount extends BankAccount {
 private double myInterest;

 public CheckingAccount()
 {
    this.myInterest = 0.0;
    super(0.0);
 }
  public CheckingAccount(double interest) 
  {
    this.myInterest = interest;  
  }
  public CheckingAccount(double interest, double amount)
  {
    this.myInterest = interest;
    super(amount);
  }
  public double getInterest() { return myInterest; }
  public void setInterest(double interest){this.myInterest = interest;}
  public void applyInterest() {  }

  public String toString()
  {
    return( super.toString() + " Interest: " + this.myInterest);
  }
    
}
