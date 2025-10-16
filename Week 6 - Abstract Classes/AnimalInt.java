public interface AnimalInt {
    static final double g = 10.0;
    //constants
    //cannot have instant variables
    //list of abstract methods
    //default methods
    //cannot have concrete method definitions
    //cannot have constructors
   public abstract void move();
    void sleep();

    public static void temp(){
         System.out.println("this is a static interface method");
    }
    default void display()
    {
        System.out.println("Hello");
    }

}
