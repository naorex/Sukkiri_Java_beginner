public class Main4 {
    public static void main(String[] args) {

        // Character 型の配列を作成してインスタンスを格納
        Character[] c = new Character[4];
        c[0] = new Hero();
        c[1] = new Hero();
        c[2] = new Wizard();
        c[3] = new Wizard();

        // 宿屋に泊まる処理
        // どれも Character 型として扱えるので、ループで一括処理できる
        for (Character ch : c) {
            ch.hp += 50;
        }
    }
}
