
package arrays;
import java.util.Scanner;
public class Arraysoccurrence {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=input.nextInt();
        int[]num=new int[n];
        System.out.println("enter elements of the array");
        for (int i = 0; i < n; i++) {
            num[i]=input.nextInt();
            
        }
        System.out.println("enter the number to be found");
        int key=input.nextInt();
        boolean found =false;
        
         int count=0;
    
            
        
        for (int i = 0; i < n; i++) {
            if (num[i]==key) {
               found=true;
              
               System.out.println(key+" found at index "+ i);
                count++;
               
              
            }
        }
         
        if (found) {
            
        
            System.out.println("number "+key +" found "+count+" times");
        }
        else System.out.println("number not found!");
        
    
}
}
