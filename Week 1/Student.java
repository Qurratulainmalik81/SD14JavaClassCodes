public class Student {
    //state
    String Name;
    String email;
    String RegNo;
    int age;

    //Constructor
    Student(String n, String e, String r, int a)
    {
        this.Name = n;
        this.email = e;
        this.RegNo = r;
        this.age = a;

    }
    //behaviors
    //methods
    public void display()
    {
        System.out.println(Name);
        System.out.println(email);
        System.out.println(RegNo);
             System.out.println(age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Cameron Boyer", "a.b@c.com", "SD14001", 20);
      //  s1.Name = "Cameron Boyer";
        s1.display();
      //  Student s2 = new Student();
      //  s2.age = 20;
      //  s2.display();
    }
    
}
