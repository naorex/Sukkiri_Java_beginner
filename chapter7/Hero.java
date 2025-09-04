public class Hero {
    private int hp = 100;
    String name = "名無しヒーロー";

    void sleep() {
        // public のアクセス修飾子を付けない場合は package private 修飾子の扱いとなる
        this.hp += 100;
        System.out.println(this.name + "は眠って回復した");
        System.out.println("現在のHPは" + this.hp);
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAME OVER");
    }
}
