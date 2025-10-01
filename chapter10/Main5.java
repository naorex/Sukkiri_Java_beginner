import java.util.HashSet;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤");  // Set型は重複は無視される
        System.out.println("色：" + colors.size() + "種類");

        for (String s : colors) {
            System.out.println(s);  // Set型の取り出し順はランダム
        }
    }
}
