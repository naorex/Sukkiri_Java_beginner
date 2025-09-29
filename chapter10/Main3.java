import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("楓");
        names.add("アサカ");
        names.add("菅原");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {  // 矢印（イテレータ）を次に進められるなら繰り返す指示
            String e = it.next();  // 内容を取り出す
            System.out.println(e);
        }
    }
}
