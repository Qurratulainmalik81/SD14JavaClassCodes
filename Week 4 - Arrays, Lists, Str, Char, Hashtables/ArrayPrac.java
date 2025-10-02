import java.lang.reflect.Method;
import java.util.Scanner;

public class ArrayPrac{
public static void main(String[] args) {
   // 1.	Java Method to Calculate Sum & Average of all elements of an integer Array size 10.
 // 2.	Java Method to Increment Every Element of the Array by One & Print Incremented Array
   int array1[] = new int[10];
   int array2[] = {1,2,3,4,5,6,7,8,9,10};
   int fact = 5;

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 10 integers:");
    // for(int i=0; i<array1.length; i++){
    //     array1[i] = sc.nextInt();
    // }
    //SumAvg(array1);
    // System.out.println("Factor before is: " + fact);
    // Increment(array2,fact);
    // System.out.println("Factor after is: " + fact);
    // System.out.println();
    // for (int i = 0; i < array2.length; i++) {
        
    //     System.out.print(array2[i] + " ");
    // }
    sqCu(array2);
    }
public static void SumAvg(int arr[])
{
int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / (double) arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
}
public static void Increment(int arr[], int fact)
{
    fact++;//incrementing the factor by 1
    System.out.println("Factor is: " + fact);
    for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] + fact;
        System.out.print(arr[i] + " ");
    }

}
//3.	Java Method to Input an Array, Store the Squares and cubes of these elements in new Arrays & Print those.
public static void sqCu(int arr[])
{
    int square[] = new int[arr.length];
     int cube[] = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
            square[i] = arr[i] * arr[i];
            cube[i] = arr[i] * arr[i] * arr[i];
           }
           System.out.println("Array\t\tSquare\t\tCubes");
           for (int i = 0; i < arr.length; i++)
           System.out.println(arr[i]+"\t\t"+square[i]+"\t\t"+cube[i]);
}
}