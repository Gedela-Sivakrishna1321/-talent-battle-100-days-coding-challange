import java.util.*;
public class Sivakrishna_Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            String str = sc.next();
            int maxlength = 0;
            Set<Character> set = new HashSet<>();
            for(int i=0;i<N;i++) {
                char curr = str.charAt(i);
                if(set.contains(curr)) {
                    maxlength = Math.max(maxlength,1);
                } else {
                    set.add(curr);
                }
            }
            System.out.println(maxlength);
        }
        sc.close();
    }
}
