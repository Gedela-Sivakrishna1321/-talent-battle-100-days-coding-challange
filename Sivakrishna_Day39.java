import java.util.Scanner;
import java.util.Arrays;
public class Sivakrishna_Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ");
        String str1 = sc.next();
        String str2 = sc.next();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean isAnagram = true;
            for(int i=0;i<ch1.length;i++) {
                if(ch1[i] != ch2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
        sc.close();
    }
}
