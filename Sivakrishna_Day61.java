import java.util.Scanner;
public class Sivakrishna_Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            int result=0;
            if(sum < 3) {
                result = 1;
            } else if (sum >= 3 && sum <= 10) {
                result = 2;
            } else if (sum >= 11 && sum <= 60) {
                result = 3;
            } else {
                result = 4;
            }
            System.out.println(result);
        }
        sc.close();
    }    
}
