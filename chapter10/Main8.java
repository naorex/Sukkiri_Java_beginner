import java.util.*;

class Hero {
    public String name;
}

public class Main8 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);
        h.name = "スガワラ";  // 格納しているのは参照アドレスなので、この部分の処理でインスタンスのフィールドが "ミナト" -> "スガワラ" へ書き換わってしまう
        System.out.println(list.get(0).name);
    }
}
