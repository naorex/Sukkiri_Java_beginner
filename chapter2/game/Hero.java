public class Hero {
    String name;
    int hp;
    public void attack() {}
    public void sleep() {
        this.hp = 100; // this は自身のインスタンスへの変数設定で用いる。（Python でいう self）
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {}
    public void slip() {}
    public void run() {}
}
