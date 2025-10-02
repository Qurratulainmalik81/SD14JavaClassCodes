public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;
    public Instructor(String fn, String ln, String on)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.officeNumber = on;
    }
    public Instructor(Instructor ins)
    {
        this.firstName = ins.firstName;
        this.lastName = ins.lastName;
        this.officeNumber = ins.officeNumber;
    }
    public void set(String fn, String ln, String on)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.officeNumber = on;
    }

    public String toString()
    {
        return (this.firstName + " " + this.lastName + "(Office Number = " + this.officeNumber+ ")");
    }
    
}
