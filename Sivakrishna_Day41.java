import java.util.Scanner;
import java.util.Arrays;
public class Sivakrishna_Day41 {

    static boolean matches(char[]  wild, char[] str)  {
        int len1 = wild.length,len2 = str.length;
        // Check if they reached the end 
        if (len1 == 0 && len2 == 0) {
            return true;
        }

        // Check, If '*' is encountered and No characters are present in str2
        if((len1 > 1 && wild[0] == '*') && len2 == 0) {
            return false;
        }

        if ((len1 > 1 && wild[0] == '?') || (len1 != 0 && len2 !=0 && wild[0] == str[0])) {
            return matches(Arrays.copyOfRange(wild, 1, len1), Arrays.copyOfRange(str, 1, len2));
        }

        // Case 4 
        if(len1!= 0  && wild[0] == '*') {
            return matches(wild,Arrays.copyOfRange(str, 1, len2)) || matches(Arrays.copyOfRange(wild, 1, len1),str);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the wild String : ");
        String wild = sc.next();
        System.out.print("Enter the String to be matched : ");
        String str = sc.next();
        if(matches(wild.toCharArray(),str.toCharArray())) {
            System.out.println("Yes ! It Matches");
        } else {
            System.out.println("No ! It doesn't Match");
        }
        sc.close();
    }    
}
