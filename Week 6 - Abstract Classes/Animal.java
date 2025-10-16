public abstract class Animal implements AnimalInt, MarkerInt{
    //abstract is a non access modifier
    //you cannot instatiate an abstract class
    //abstract class can have attributes and constructors
    //can have abstract methods and regular methods
    private String name;
    private String specie;
    private int age;
    Animal(String n, String s, int a)
    {
        this.name =  n;
        this.age = a;
        this.specie = s;
    }
   public abstract void greet();
   public abstract void eat();

    //set and ger method
    //toString
    //other methods
    public String toString()
    {
        return(this.name + " " + this.specie + " " + this.age);
    }
      public void move(){
        System.out.println("Animals can move");
      }
     public void sleep(){
                System.out.println("All Animals sleep");
     }
}