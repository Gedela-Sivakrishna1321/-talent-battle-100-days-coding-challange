
import java.util.Scanner;
public class Codechef {
	public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-- >0) {
		int N = sc.nextInt();
		String ans = "";
		for(int i=0;i<N;i++) {
			String str = sc.next();
			if(str.charAt(i) == '1')
				ans += 0;
			else 
				ans += 1;
		}
		System.out.println(ans);
	}		
	}
}