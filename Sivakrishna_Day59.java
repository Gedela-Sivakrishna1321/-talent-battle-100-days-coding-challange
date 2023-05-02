import java.util.Scanner;
public class Sivakrishna_Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int W = sc.nextInt();
            int H = sc.nextInt();
            int bmi = W/(H*H);
            int result=0;
            if(bmi <= 18) {
                result = 1;
            } else if (bmi > 18 && bmi < 25) {
                result = 2;
            } else if (bmi >= 25 && bmi < 30) {
                result = 3;
            } else {
                result = 4;
            }
            System.out.println(result);
        }
        sc.close();
    }
}