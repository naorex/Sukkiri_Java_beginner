public class Wizard extends Character {
    int mp;

    public void run() {
        // オーバーライド
        System.out.println(this.name + "は逃げ出した");
    }

    public void attack(Matango m) {
        // オーバーライド
        System.out.println(this.name + "の攻撃！");
        m.hp -= 3;
        System.out.println("3ポイントのダメージを与えた！");
    }

    public void fireball(Matango m) {
        System.out.println(this.name + "は火の玉を放った！");
        m.hp -= 20;
        this.mp -= 5;
        System.out.println("20ポイントのダメージを与えた！");
    }
}
