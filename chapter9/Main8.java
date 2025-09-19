import java.util.*;

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
        System.out.println(past); // -> Sun Sep 17 20:53:20 UTC 2023

        Calendar c = Calendar.getInstance();
        // 6つのint値からDateインスタンスを生成
        c.set(2023, 8, 18, 5, 53, 20);
        c.set(Calendar.MONTH, 9); // 9月を10月に変更 (0~11の範囲)
        Date d = c.getTime();
        System.out.println(d); // -> Wed Oct 18 05:53:20 UTC 2023
        // Dateインスタンスからint値を生成
        Date now2 = new Date();
        c.setTime(now2);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は" + y + "年です"); // -> 今年は2025年です
    }
}
