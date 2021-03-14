/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main{ 
    public static void main(String[] args) 
{
   Scanner scan = new Scanner(System.in); 
        System.out.println("Enter rows "); 
        int n = scan.nextInt(); 
        for (int i = 1; i <= n; i++) 
        {  
            for (int j = n; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 

}}

