import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("楓");
        names.add("アサカ");
        names.add("菅原");
        printList(names);
    }

    public static void printList(List<String> list) {
        // ArrayList でも、LinkedList でも受け付ける事が可能なメソッド定義にしている -> List<String>
        for (String s : list) {
            System.out.println(s);
        }
    }
}
