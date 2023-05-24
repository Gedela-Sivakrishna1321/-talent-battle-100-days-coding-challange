import java.util.Scanner;
public class Sivakrishna_Day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(N%K ==0) {
                System.out.println(N/K);
                continue;
            }
            System.out.println(-1);
        }
        sc.close();
    }    
}
