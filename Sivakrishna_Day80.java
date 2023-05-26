import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Sivakrishna_Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            int type[] = new int[N];
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<type.length;i++) {
                type[i] = sc.nextInt();
                set.add(type[i]);
            }
            boolean possibile = true;
            for (int curr : set) {
                int count=0;
                for(int i=0;i<type.length;i++) {
                    if(curr == type[i])
                        count++;
                }
                if(count%2 != 0){
                    possibile = false;
                    break;
                }
            }
            System.out.println((possibile) ? "YES" : "NO");
           
        }
        sc.close();
    }    
}
