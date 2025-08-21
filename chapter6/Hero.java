public class Hero extends Character {
    String name = "ミナト";
    int hp = 100;

    public void run() {
        // オーバーライド
        System.out.println(this.name + "は逃げ出した");
    }

    public Hero() {
        // コンストラクタ
        System.out.println("Heroのコンストラクタが動作");
    }
}
