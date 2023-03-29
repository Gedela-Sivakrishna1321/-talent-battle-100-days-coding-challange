import java.util.Scanner;
public class Sivakrishna_Day27 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input = ");
	int num = sc.nextInt();
    int temp=num;
    for(int i=1;i<=temp;i++) {
        num++;
    }
	System.out.println((num));
	sc.close();
	}
}