import java.util.Scanner;
public class Sivakrishna_Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        StringBuilder stb = new StringBuilder();
        String sub;
        for(int i=0;i<q;i++) {
            String query = sc.nextLine();
            String Q[] = query.split(" ");
            int start = Integer.valueOf(Q[1]);
            if(Q.length > 2) {
                if(Q[0].equals("+")) {
                     sub = Q[2];
                    stb.insert(start,sub);
                } else {
                   
                    int last = Integer.valueOf(Q[2]);
                    sub = stb.substring(start-1, start+last-1);
                    System.out.println(sub);
                }
            }
        }
        sc.close();
    }    
}
