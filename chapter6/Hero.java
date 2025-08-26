public class Hero extends Character {
    String name = "ミナト";
    int hp = 100;

    public void run() {
        // オーバーライド
        System.out.println(this.name + "は逃げ出した");
    }

    public void attack(Matango m) {
        // オーバーライド
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    public Hero() {
        // コンストラクタ
        System.out.println("Heroのコンストラクタが動作");
    }
}
