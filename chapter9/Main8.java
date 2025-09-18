import java.util.Date;

public class Main8 {
    public static void main(String[] args) {

        // long 型の日時
        long start = System.currentTimeMillis();
        // ここで何らかの時間がかかる処理
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");

        // Date インスタンスを利用（中身は long 型で日時を保持）
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime()); // -> long型を返す
        Date past = new Date(1694984000000L);
        System.out.println(past);
    }
}
