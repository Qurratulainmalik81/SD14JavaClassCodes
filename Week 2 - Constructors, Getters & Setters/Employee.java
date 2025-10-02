public class Employee {
    //4  instance variables
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //Constructor
    public Employee(int id, String firstName, String lastName, int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName()
    {
        return (this.firstName + " " + this.lastName);
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary()
    {
        return (12*this.salary);
    }
    public int raiseSalary(int percent)
    {
        double raise = this.salary * ((double)percent/100);
        this.salary = this.salary + ((int)raise);
        return this.salary;
    }
    public String toString()
    {
        return ("Id = " + this.id + " Name: " + this.getName() + " Salary = "+ this.salary);
    }
}
