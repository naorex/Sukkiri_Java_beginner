public class Main {
    public static void main (String[] args) {

        Hero h = new Hero();
        h.run();

        SuperHero sh = new SuperHero();
        sh.run(); // 親クラスのメソッドを継承して使える（オーバーライドがあれば適用）
        sh.fly();
    }
}
