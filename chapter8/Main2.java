public class Main2 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setName("ミナト");
        h1.setHp(100);

        Hero h2 = new Hero();
        h2.setName("ミナト");
        h2.setHp(100);

        // 等値（equality）の比較
        // 完全に同一かどうか。メモリの参照アドレスが同じである必要あり。
        // 標準の java.lang.Object クラスの equals() は == の比較と同じなので注意。（『スッキリわかる Java』の本はこの説明が間違っている）
        if (h1.equals(h2)) {
            System.out.println("同じ勇者です");
        } else {
            System.out.println("違う勇者です"); // -> こちらが該当（異なるインスタンスのため）
        }

        Hero h3 = h1;

        if (h1 == h3) {
            System.out.println("同じ勇者です"); // -> こちらが該当（同じインスタンス）
        } else {
            System.out.println("違う勇者です");
        }
    }
}
