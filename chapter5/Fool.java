public class Fool extends Character implements Human {
    // extends と implements を両方使う例。
    // 抽象クラス Character から hp や name 等のフィールドを継承

    // 抽象クラス Character から継承した抽象メソッド attack() をオーバーライド
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わず遊んでいる");
    }

    // インターフェース Human から継承した抽象メソッドを実装
    public void talk() {}
    public void watch() {}
    public void hear() {}
    public void run() {}
}
