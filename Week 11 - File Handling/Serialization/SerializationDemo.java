import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo {
    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();
        try{
            FileInputStream fin = new FileInputStream("Emp.txt");
            ObjectInputStream ObjIn = new ObjectInputStream(fin);
            Object temp = null;
            while(true)
            {
            try{
            temp = ObjIn.readObject();
            }
            catch(EOFException e)
            {
                break;
            }
            emp.add((Employee)temp);
            }
            fin.close();
            ObjIn.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
System.out.println(emp);

// for(int i = 0;i<emp.size();i++)
// System.out.println(emp.get(i));

       Employee E1 = new Employee(1,"Abiodun", "Oyedele", 5000);
       Employee E2 = new Employee(2,"Cameron", "Boyer", 5000);
       Employee E3 = new Employee(3,"Kassaundra", "Fequet", 5000);
       Employee E4 = new Employee(4,"Taylor", "Carter", 5000);
 try{
            FileOutputStream fout = new FileOutputStream("Emp.txt");
            ObjectOutputStream ObjectOut = new ObjectOutputStream(fout);
            ObjectOut.writeObject(E1);
            ObjectOut.writeObject(E2);
            ObjectOut.writeObject(E3);
            ObjectOut.writeObject(E4);
          
            fout.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
         System.out.println("Success");
        
   }
    
}
