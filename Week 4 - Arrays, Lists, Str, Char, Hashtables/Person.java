public class Person {
    private String firstName;
    private String lastName;
    Person(String fn, String ln)
    {
        this.firstName = fn;
        this.lastName = ln;

    }
    public String toString()
    {
        return (this.firstName + " " + this.lastName);
    }
    
}
