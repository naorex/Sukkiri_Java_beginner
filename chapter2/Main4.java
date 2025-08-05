public class Main4 {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト");
        System.out.println(h.hp); // コンストラクタで定義した 100が代入される。
        System.out.println(h.name); // インスタンス生成時に引数で渡した名前が代入される
    }
}
