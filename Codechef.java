/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    // GCD
		    int GCD = 0;
		    for(int i=Math.min(A,B);i>=1;i--) {
		        if(A%i==0 && B%i==0) {
		            GCD = i;
		            break;
		        }
		    }
		    // LCM
		    int LCM = (A*B)/GCD;
		    System.out.println(GCD+" "+LCM);
		}
        sc.close();
	}
}

