class BankAccount {
  private double myBal;

  public BankAccount() { myBal = 0; }
  public BankAccount(double amount) {this.myBal = amount;}
  public double getBalance() { return myBal; }
  public void setBalance(double amount){this.myBal = amount; }
  public String toString(){return ("Balance: " + this.myBal);}
  public void deposit(double amount)
  {
    this.myBal = this.myBal + amount;
  }

  public void withdraw(double amount)
  {
    if(this.myBal>=amount)
    this.myBal = this.myBal - amount;
    else
    System.out.println("Don't have enough balance");

  }
  public static void test()
  {

  }
}
