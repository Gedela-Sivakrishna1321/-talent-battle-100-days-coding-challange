import java.util.ArrayList;
import java.util.Scanner;
public class Sivakrishna_Day66 {

    public static void getSubStrings(ArrayList<String> list,String str) {
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            for(int j=i;j<ch.length;j++) {
                String Str = "";
                for(int k=i;k<=j;k++) {
                   Str =  Str.concat(String.valueOf(ch[k]));
                }
                list.add(Str);
            }
        }
    }

    public static boolean Ispalindrome(String str) {
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length/2;i++) {
            if(ch[i] != ch[ch.length-1-i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            String A = sc.next();
            String B = sc.next();
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            getSubStrings(list1,A);
            getSubStrings(list2, B);
          
            // Compare
            boolean found = false;
            for(int i=0;i<list1.size();i++) {
                String curr = list1.get(i);
                for(int j=0;j<list2.size();j++) {
                    String str = curr + list2.get(j);
                    if(Ispalindrome(str)) {
                        found = true;
                        break;
                    }
                }
                if(found) 
                    break;
            }

            System.out.println(found ? "Yes" : "No");

        }
        sc.close();
    }
}
