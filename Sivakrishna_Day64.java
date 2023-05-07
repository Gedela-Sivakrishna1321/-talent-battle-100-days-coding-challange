import java.util.Scanner;
public class Sivakrishna_Day64 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- >0) {
        String str = sc.next();
        char ch[] = str.toCharArray();
        boolean found = false;
        for(int i=0;i<ch.length-2;i++) {
            if((ch[i]=='0' && ch[i+1] == '1' && ch[i+2]=='0') || (ch[i]=='1' && ch[i+1] == '0' && ch[i+2]=='1') ) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Good" : "Bad");
    }        
    sc.close();
    }
}
