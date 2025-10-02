import java.lang.*;
public class Circle{
    private double radius = 1.0;
    private String color = "red";
    private static int count = 0;
    
//If you havnt provided any constructor, then default constructor is used
    //no argument constructor
    public Circle()
    {
        this.radius = 0.0;
        this.color = null;
        count++;
    }
    //3 parameterised constructors
    public Circle(double r)
    {
        this.radius = r;
        this.color = null;
         count++;
    }
    public Circle(double r, String c)
    {
        this.radius = r;
        this.color = c;
    count++;
    }
    public Circle(String c)
    {
        
        this.color = c;
     count++;
    }
//Copy Constructor
    public Circle(Circle c)
    {
this.color = c.color;
this.radius = c.radius;
count++;
}
//Accessors Mutators or getters setter
    public void setRadius(double r)
{
    this.radius = r;
}
    public void setColor(String c)
{
    this.color = c;
}
    public double getRadius()
{
    return this.radius;
}
    public String getColor() {
    return color;
}
    public double getArea()
    {
        double Area = Math.PI * this.radius*this.radius;
    
        return (Area);
    }
    // public static void main(String[] args) {
    //             Circle C1 = new Circle();
    //     Circle C2 = new Circle(5);
    //     C1.color = "orange";
    // }

    public static void display()
    {
        System.out.println(count);
    }
    public String toString()
    {
        return("Circle radius: " + this.radius + " and color is: "+ this.color + " Count = " );
    }

}