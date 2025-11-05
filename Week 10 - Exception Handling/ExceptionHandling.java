public class ExceptionHandling {
    public static void main(String args[])
   {
      // try{
      //    int num1=30, num2=0;
      //    int output=num1/num2;
      //    System.out.println ("Result = " +output);
      // }
      // catch(ArithmeticException e){
      //    System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
      // }
//  try{
//          int a[]=new int[7];
//          a[8]=30/5;
//          System.out.println("First print statement in try block");
//      }
//      catch(ArithmeticException e){
//         System.out.println("Warning: ArithmeticException");
//      }
//      catch(ArrayIndexOutOfBoundsException e){
//         System.out.println("Warning: ArrayIndexOutOfBoundsException");
//      }
//      catch(Exception e){
//         System.out.println("Warning: Some Other exception");
//      }
//    System.out.println("Out of try-catch block...");


   //    try{
	//  int num=Integer.parseInt ("XYZ") ;
	//  System.out.println(num);
   //    }catch(NumberFormatException e){
	//   System.out.println("Number format exception occurred");
   //     }

   // try{
	//  String str="easysteps2buildwebsite";
	//  System.out.println(str.length());
	//  char c = str.charAt(0);
   //  System.out.println(c);
	//  char c1 = str.charAt(40);
	//  System.out.println(c1);
   //    }
   // catch(StringIndexOutOfBoundsException e){
	//   System.out.println("StringIndexOutOfBoundsException!!");
   //     }
// try{
// 		String str=null;
// 		System.out.println (str.length());
// 	}catch(NullPointerException e){
// 		System.out.println("NullPointerException..");
//       System.out.println(e.getMessage());
//       e.printStackTrace();
// 	}
//  try{
//     	   try{
//             System.out.println("Inside block1");
//             int b =45/0;
//             System.out.println(b);
//          }
//          catch(ArithmeticException e1){
//             System.out.println("Exception: e1");
//          }
//          try{
//             System.out.println("Inside block2");
//             int b =45/0;
//             System.out.println(b);
//          }
//          catch(ArrayIndexOutOfBoundsException e2){
//             System.out.println("Exception: e2");
//          }
//         System.out.println("Just other statement");
//     }
//     catch(ArithmeticException e3){
//     	 System.out.println("Arithmetic Exception");
//          System.out.println("Inside parent try catch block");
//     }
//     catch(ArrayIndexOutOfBoundsException e4){
//     	System.out.println("ArrayIndexOutOfBoundsException");
//          System.out.println("Inside parent try catch block");
//     }
//     catch(Exception e5){
//     	System.out.println("Exception");
//          System.out.println("Inside parent try catch block");
//      }
//      System.out.println("Next statement..");

  try{
    	//try-block2
        try{     
            //try-block3
            try{
            	int arr[]= {1,2,3,4};
            	/* I'm trying to display the value of
            	 * an element which doesn't exist. The
            	 * code should throw an exception
            	 */
            	System.out.println(arr[10]);
            }catch(ArithmeticException e){
            	System.out.print("Arithmetic Exception");
            	System.out.println(" handled in try-block3");
            }
        }
        catch(ArithmeticException e){
           System.out.print("Arithmetic Exception");
           System.out.println(" handled in try-block2");
        }
    }
    catch(ArithmeticException e3){
    	System.out.print("Arithmetic Exception");
     	System.out.println(" handled in main try-block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.print("ArrayIndexOutOfBoundsException");
     	System.out.println(" handled in main try-block");
    }
    catch(Exception e5){
    	System.out.print("Exception");
     	System.out.println(" handled in main try-block");
     }
  }
}


