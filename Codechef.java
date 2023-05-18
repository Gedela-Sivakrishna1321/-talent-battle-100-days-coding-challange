/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
		    int N = sc.nextInt();
		    boolean Isprime = true;
		    if(N == 1) {
		        System.out.println("No");
		        continue;
		    }
		    for(int i=2;i<=Math.sqrt(N);i++) {
		        if(N%i == 0) {
		            Isprime = false;
		            break;
		        }
		    }
		    System.out.println(Isprime ? "Yes" : "No");
		}
	}
}
