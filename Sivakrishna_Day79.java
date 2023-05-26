import java.util.Scanner;
public class Sivakrishna_Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            String str = sc.next();
            int count=0,adg=0;
            for(int i=0;i<str.length()-1;i++) {
                if(str.charAt(i) == '1') {
                    if(str.charAt(i) == str.charAt(i+1)) {
                        adg++;
                    }
                    count++;
                }
            }
            if(count == 0 &&  str.charAt(N-1)=='1') {
                System.out.println(1);
            } else if (count == 0) {
                System.out.println(0);
            } else {
               System.out.println((adg == 0) ? 1 : 2);
            }
        }
        sc.close();
    }    
}
