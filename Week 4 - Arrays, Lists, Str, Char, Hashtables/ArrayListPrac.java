import java.util.ArrayList;
public class ArrayListPrac {
    public static void main(String[] args)
    {
        ArrayList<String> obj = new ArrayList<String>();
        System.out.println(obj.size());
        obj.add("One");
        System.out.println(obj.size());
        obj.add("two");
        System.out.println(obj.size());
        ArrayList<Person> PersonList = new ArrayList<>();
        Person p1 = new Person("Kevin","green");
        PersonList.add(p1);
        PersonList.add(new Person("Brandon","Maloney"));
        System.out.println(PersonList);
        PersonList.add(0,new Person("Cameron","Boyer"));
        for(int i = 0;i<PersonList.size();i++)
        System.out.println(PersonList.get(i));


    }
    
}
