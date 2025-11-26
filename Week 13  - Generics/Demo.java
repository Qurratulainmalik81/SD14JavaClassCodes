public class Demo {

    public static <X> void display(X pram)
    {
        System.out.println(pram);
    }
   public static void main(String[] args) {
    System.out.println("Generics Demo");
    MyPoint<Integer> ipoint = new MyPoint<>(4,4);
    MyPoint<Double> dpoint  = new MyPoint<>(4.5,4.5);
    System.out.println(ipoint);
    System.out.println(dpoint);
    ipoint.displayPoint("this is my generic message");
        ipoint.displayPoint(100001);

    display(4);
    display(4.5);
    display("hello");
    display('A');

   }
}
