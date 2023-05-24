import java.util.ArrayList;
import java.util.Scanner;
public class Sivakrishna_Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int N = sc.nextInt();
            String str = sc.next();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<str.length();i++) {
                for(int j=i;j<str.length();j++) {
                    String currSubString="";
                    for(int k=i;k<=j;k++) {
                        currSubString = currSubString + str.charAt(k);
                    }
                    list.add(currSubString);
                }
            }
            
            String arr[][] = new String[list.size()][];
            for(int i=0;i<list.size();i++) {
                if(Isboring(String.valueOf(list.get(i)))) {
                    arr[i][0] = list.get(i);
                    arr[i][1] = String.valueOf(list.size());
                }
            }

            // Finally Display
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<2;j++) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static boolean Isboring(String str) {
        for(int i=0;i<str.length()-2;i++) {
            if(str.charAt(i) != str.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
