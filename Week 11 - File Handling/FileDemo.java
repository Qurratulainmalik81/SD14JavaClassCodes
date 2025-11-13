import java.io.*;

public class FileDemo {
     public static void main(String[] args) { 
      //   System.out.println("File Class in Java");s
      //   try{
      //    File file = new File("Java.txt");
      //   // FileWriter fw = new FileWriter(file);
      //    if(file.createNewFile())
      //    {
      //       System.out.println("New File has been created");
      //    }
      //    else
      //    System.out.println("File Already exists");
      //   }
      //   catch(IOException e)
      //   {System.out.println(e.getMessage());
      // }
      // System.out.println("--------------------------------");
   //    System.out.println("FileWriter Class in Java");
   //    try{
         
   //    FileWriter fw = new FileWriter("FileWriter.txt",false);
   //    fw.write("\nHello this is my second java text file\n");
     
   //   fw.close();

   //    }
   //    catch(IOException e)
   //      {System.out.println(e.getMessage());
   //    }
   //         System.out.println("--------------------------------");

//  System.out.println("FileReader Class in Java");
// try{
//    FileReader fr = new FileReader("FileWriter.txt");
//    int i;
//    while((i = fr.read())!=-1)
//    System.out.print((char)i);
//    fr.close();

// }
// catch(IOException e)
// {System.out.println(e.getMessage());}

//  System.out.println("--------------------------------");

// System.out.println("FileOutputStream Class in Java");
// try{
//    FileOutputStream fout = new FileOutputStream("Binary.txt");
//    String S = "This is out first binary file";
//    byte b[] = S.getBytes();
//    fout.write(b);
//    fout.close();
// }
// catch(IOException e)
// {System.out.println(e.getMessage());}

//  System.out.println("--------------------------------");
System.out.println("FileInputStream Class in Java");
try{
   FileInputStream fin = new FileInputStream("Binary.txt");
   int i;
while((i = fin.read())!=-1)
    System.out.print((char)i);
   fin.close();

}
catch(IOException e)
{System.out.println(e.getMessage());}

 System.out.println("\n--------------------------------");
     }
}
