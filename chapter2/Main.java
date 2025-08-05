public class Main {
    public static void main(String[] args) {
        // 勇者のインスタンスを生成
        Hero h = new Hero();
        // 初期値をセット
        h.name = "ミナト";
        h.hp = 100;
        // System.out.println("勇者" + h.name + "を生み出した！");

        // 2つめのインスタンスの挙動
        Hero h2;
        h2 = h; // 参照渡し。コピーではない。
        h2.hp = 200;
        System.out.println(h.hp); //=> 200。参照渡しが前述で行われているため。

        // 敵のインスタンスを生成
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        // 勇者クラスのメソッドを呼び出し
        h.sit(5);
        h.slip();
        m1.run();
        m2.run();
        h.sit(25);
        h.run();
    }
}
