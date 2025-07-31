public class Hero {
    String name;
    int hp;
    public void sleep() {
        this.hp = 100; // this は自身のインスタンスへの変数設定で用いる。（Python でいう self）
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec; // 秒数分をHP回復
        System.out.println(
            this.name + "は、" + sec + "ポイント回復した"
        );
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
