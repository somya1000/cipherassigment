/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in); 
        System.out.println("Enter rows "); 
        char z='A';
        int n = scan.nextInt(); 
        for (int i = 1; i <= n; i++) 
        {  
            for (int j = n; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print(z); 
                z++;
            }
            System.out.println(); 
        } 
	}
}

