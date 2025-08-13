public class Dancer extends Character {

    public void dance() {
        System.out.println(this.name + "は情熱的に踊った！");
    }

    public void attack(Matango m) {
        // 抽象クラスの抽象メソッド attack() をオーバーライド
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージを与えた！");
        m.hp -= 3;
    }
}
