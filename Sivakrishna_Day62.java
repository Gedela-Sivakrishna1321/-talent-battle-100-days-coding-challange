import java.util.Scanner;
public class Sivakrishna_Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((N+1)*y >= x ? "Yes" : "NO");
        }
        sc.close();
    }    
}
