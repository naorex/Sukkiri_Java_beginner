public class Main2 {
    public static void main(String[] args) {
        Wizard w = new Wizard(); // -> 通常のインスタンス生成は問題無し
        // Character w = new Wizard(); // -> こちらはエラー発生。なぜなら Character 型を呼び出す際に曖昧すぎて Wizard 型のインスタンスである事が認識されてないから。run()やattack()は曖昧でも共通して持っているメソッドのためエラーは起きないが、Wizard 型特有の fireball()は呼び出せなかった。
        Matango m = new Matango();
        w.name = "アサカ";
        w.attack(m);
        w.fireball(m);
    }
}
