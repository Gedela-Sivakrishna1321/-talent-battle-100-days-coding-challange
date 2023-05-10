import java.util.ArrayList;
public class exp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ab");
        list.add("bc");
        list.add("siva");
        list.add("Anil");
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+"\t");
        }
        
    }
}
