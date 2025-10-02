public class DemoCircle {
    public static void main(String[] args) {
        Circle C1 = new Circle();
     //   Circle c7 = C1;
        C1.setRadius(10);
        C1.setColor("Purple");
        Circle C2 = new Circle(5);
        Circle C3 = new Circle(5,"yellow" );
        Circle C4 = new Circle("Pink");
        Circle C5 = new Circle();
        Circle C6 = new Circle(C5);
        System.out.println("C1 = " + C1);
        System.out.println("C2 = " + C2);
        System.out.println("C3 = " + C3);
        System.out.println("C4 = " + C4);
        System.out.println("C5 = " + C5);
        System.out.println("C6 = " + C6);

    //     Circle.display();
   
    //   System.out.println(C1.getArea());
    //   System.out.println(C2.getArea());
    }
}
