class BankAccount {
  private double myBal;
  public BankAccount() { myBal = 0; }
  public BankAccount(double amount) {this.myBal = amount;}
  public double getBalance() { return myBal; }
  public void setBalance(double amount){this.myBal = amount; }
  public String toString(){return ("Balance: " + this.myBal);}
}
