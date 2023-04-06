import java.util.Scanner;
public class Sivakrishna_Day35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i)) == true) {
                sum += Character.getNumericValue(str.charAt(i));;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
