import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Sivakrishna_Day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Queries = sc.nextInt();
        // Set Declaration
        Set<Integer> set = new HashSet<>();
        while(Queries -- >0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 1) {
                set.add(y);
            } else if (x == 2 && set.contains(y)) {
                set.remove(y);
            } else if ( x== 3) {
                System.out.println(set.contains(y) ? "Yes" : "No");
            }
        }
        sc.close();
    }
}
