public class Hero extends Character {
    String name = "ミナト";
    int hp = 100;

    public void run() {
        // オーバーライド
        System.out.println(this.name + "は逃げ出した");
    }

    public void attack(Monster m) {
        // オーバーライド
        // Monster 型のインスタンスになら攻撃できる attack()メソッド
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10のダメージを与えた");
        m.hp -= 10;
    }

    public Hero() {
        // コンストラクタ
        System.out.println("Heroのコンストラクタが動作");
    }
}
