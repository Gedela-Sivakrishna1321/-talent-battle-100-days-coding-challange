import java.util.Scanner;
public class Sivakrishna_Day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            System.out.println(((x*3 - (N-x)) > p) ? "Pass" : "Fail");
        }
        sc.close();
    }
}
