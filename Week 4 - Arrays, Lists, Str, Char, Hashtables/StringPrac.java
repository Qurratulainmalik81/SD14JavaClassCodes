public class StringPrac {
    public static void main(String[] args)
    {
        char letter = 'A';
        char[] letters = {'H','e','l','l','o'};
        String st1 = "Hello";
        String message = new String("Welcome to Java");
        String s = new String();
        
	String s1 = new String("Welcome");
	String s2 = "welcome";
    String s3 = "Welcome";
	
//   if (s3.equals(s2)){  
//     System.out.println("Contents are Same"); 
//   }
 
//   if (s3 == s2) {
//     System.out.println("References are Same"); 
//   }
if (s1.compareTo(s2) > 0) {  
   System.out.println("S1 is greater"); 
  }
  else if (s1.compareTo(s2) == 0) { 
       System.out.println("Both strings are equal"); 

  }
  else 
        System.out.println("S2 is greater"); 


    }
}
