import java.util.Scanner;
public class Sivakrishna_Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        String Queries[] = new String[Q];
        for(int i=0;i<Q;i++) {
            Queries[i] = sc.next();
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<Queries.length;i++) {
           String currString = Queries[i];
           String QA[] = currString.split(" ");

           String opr = QA[0];
           int startIndex = Integer.valueOf(QA[1]);
           if(opr.equals("+")) {
            String subString = QA[2];
            result.insert(startIndex,subString);
           } else {
            if(opr.equals("?")) {
                int endIndex = Integer.valueOf(QA[2]);
                System.out.println(result.substring(startIndex-1, endIndex-1));
            }
           }
        }
    }    
}
