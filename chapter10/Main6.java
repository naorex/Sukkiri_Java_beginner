import java.util.Set;
import java.util.TreeSet;  // 自然順序付けで整列して格納

public class Main6 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for (String s : words) {
            System.out.println(s); // cat -> wolf の順で出力
        }
    }
}
