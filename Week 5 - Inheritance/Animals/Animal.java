
public class Animal{
    private String name;

    public Animal()
    {
        this.name = "no name";
    }
    public Animal(String name)
    {
        this.name = name;

    }

    public String toString()
    {
        return ("Animal:" + this.name);
    }
}