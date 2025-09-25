import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<Integer>();

        // 上記の ArrayList には Integer型しか入れられないが、以下のプリミティブ型のような書き方でも自動で Integer型に変換してくれる。
        points.add(10);
        points.add(80);
        points.add(75);

        // 拡張for文
        for (int i : points) {
            System.out.println(i);
        }

        // 以下でもOK
        for (int i = 0; i < points.size(); i++) {
            System.out.println(points.get(i));
        }
    }
}
