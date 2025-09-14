public class Main4 {
    public static void main(String[] args) {
        Hero.setRandomMoney(); // 静的メソッド（クラスメソッド）なので、インスタンス生成していなくても呼び出せる
        System.out.println(Hero.money);
        Hero h1 = new Hero();
        System.out.println(h1.money); // 上記の文と同じ値が出力される
    }
}
