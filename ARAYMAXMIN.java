
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package araymaxmin;
import java.util.Scanner;
/**
 *
 * @author Azebd
 */
public class ARAYMAXMIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number of array");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than zero");
            return;
        }

        int[] num = new int[n];

        System.out.println("enter array elements");

        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }

        int min;
        min = num[0];

        for (int i = 0; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("min = " + min);

        int max;
        max = num[0];

        for (int i = 0; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("max = " + max);

        input.close();
    }
}