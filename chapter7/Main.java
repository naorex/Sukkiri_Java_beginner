public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        // h.hp -= 5; // -> private アクセス修飾子の変数なので外部からアクセス不可
        h.sleep(); // -> sleep()メソッド経由ならばアクセス可能
        // h.die(); // die()メソッドは private なので外部からアクセス不可
    }
}
