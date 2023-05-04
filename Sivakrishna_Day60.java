import java.util.*;
public class Sivakrishna_Day60 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int temp[] = new int[7];
            int Rdays=0,Sdays=0;
            for(int i=0;i<temp.length;i++) {
                temp[i] = sc.nextInt();
                if(temp[i] == 1) {
                    Sdays++;
                    continue;
                }
                Rdays++;
            }
            System.out.println((Sdays > Rdays) ? "Yes" : "NO");
        }
        sc.close();
    }
}
