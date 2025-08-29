public class Main {
    public static void main(String[] args) {

        // 通常のインスタンス生成
        // 箱の型も中身も SuperHero とするインスタンス生成
        SuperHero h = new SuperHero();

        // 箱の型を Character の扱いとし、中身は SuperHero とするインスタンス生成
        // SuperHero の親を辿ると Character 型があるため、この定義が可能
        Character c = new SuperHero();

        if (c instanceof SuperHero sh) {
            // オブジェクトc を SuperHero 型の sh へ代入しなおす
            // instanceof を付ける事で安全に動作するかをチェックできる
            sh.fly();
        }
    }
}
