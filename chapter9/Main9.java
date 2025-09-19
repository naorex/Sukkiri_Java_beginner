import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Main9 {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            // 文字列からDateインスタンスを生成
            Date d = f.parse("2023/09/18 05:53:20");
            System.out.println(d); // -> Mon Sep 18 05:53:20 UTC 2023
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the exception here
        }

        // Dateインスタンスから文字列を生成
        Date now = new Date();
        String s = f.format(now);
        System.out.println("現在は" + s + "です");
    }
}
