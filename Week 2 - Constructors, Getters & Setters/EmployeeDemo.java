public class EmployeeDemo {
    
    public static void main(String[] args) {
        Employee E1 = new Employee(1,"Abiodun", "Oyedele", 5000);
        System.out.println(E1);    
        E1.raiseSalary(50) ;
         System.out.println(E1);  
    }
    
}
