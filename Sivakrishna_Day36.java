import java.util.Scanner;
public class Sivakrishna_Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.next();
        str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
        str = str.replace(str.charAt(str.length()-1),Character.toUpperCase(str.charAt(str.length()-1)));
        System.out.println(str);
        sc.close();
    }   
}
