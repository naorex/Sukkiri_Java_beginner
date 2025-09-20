import java.time.*;

public class Main10 {
    public static void main(String[] args) {
        Instant il = Instant.now(); // 現在日時。new の代わりに静的メソッドの .now() を使用

        // Instant と long 値の相互変換
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();

        // ZonedDateTime の作成
        ZonedDateTime z1 = ZonedDateTime.now(); // 現在日時
        ZonedDateTime z2 = ZonedDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

        // Instant と ZonedDateTime の相互変換
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        // ZonedDateTime の利用方法
        System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
        System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
        if (z2.isEqual(z3)) {
            System.out.println("これらは同じ瞬間を指しています");
        }
    }
}
