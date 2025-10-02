public class DemoBank {
    public static void main(String[] args)
    {
        BankAccount BA = new BankAccount(1000);
        CheckingAccount Ch1 = new CheckingAccount(0.4, 2000);
        TransactionFeeCheckingccount TFCA = new TransactionFeeCheckingccount();
        TransactionFeeCheckingccount TFCA1 = new TransactionFeeCheckingccount(0.8);
        TransactionFeeCheckingccount TFCA2 = new TransactionFeeCheckingccount(0.8,500);

System.out.println(Ch1.getBalance());
        
        System.out.println("Bank Account " + BA);
        System.out.println("CHecking Account " + Ch1);
        System.out.println("TFCA " + TFCA);
        System.out.println("TFCA1 " + TFCA1);
        System.out.println("TFCA2 " + TFCA2);
    }
    
}
