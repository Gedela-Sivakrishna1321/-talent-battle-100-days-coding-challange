import java.util.Scanner;
public class Sivakrishna_Day37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.next();
        for(char ch = 'a';ch<='z';ch++) {
            int frequency=0;
            for(int i=0;i<str.length();i++) {
                if(ch == str.charAt(i)) {
                    frequency++;
                }
            }
            if(frequency != 0) {
                System.out.println("Frequency of "+ch+ " is : "+frequency);
            }
        }
        sc.close();
    }   
}
