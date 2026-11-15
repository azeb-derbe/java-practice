/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package occurance;
import java.util.Scanner;

/**
 *
 * @author Azebd
 */
public class Occurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        int Lindex=-1;
         int Findex=-1;
        
        for (int i = 0; i < n; i++) {
            if (num[i]==key) {
               found=true;
               Findex=i;
               break;
            }
        }
        for (int i = num.length-1; i >=0 ; i--) {
            
             if (num[i]==key) {
               found=true;
               Lindex=i;
               break;
        }
        
        
    }
        if (found) {
            System.out.println("first occurence is at index "+ Findex);
        System.out.println("last occurance is at index "+Lindex);
        }
        else System.out.println("number not found!");
        
    
}
}
