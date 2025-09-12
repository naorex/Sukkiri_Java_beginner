public class Main3 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero.money = 100;
        System.out.println(h1.getHp()); // インスタンスへアクセス
        System.out.println(h1.money); // 下記と同じ値が出る
        System.out.println(Hero.money); // Hero クラスへアクセス

        h1.money = 300;
        System.out.println(h2.money); // -> 300
    }
}
