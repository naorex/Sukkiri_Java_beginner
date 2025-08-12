public class SuperHero extends Hero {
    // クラスの継承 extends
    // 以降は親クラスに追加分のメソッド等を書く

    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }

    public void run() {
        // 親クラスにあるメソッドをオーバーライド
        System.out.println(this.name + "は撤退した！");
    }

    public void attack(Matango m) {
        // 親クラスのメソッドを呼び出しつつオーバーライドする場合は "super"をつける。
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }

    public SuperHero() {
        super(); // 親クラスのコンストラクタを書くのが正式な作法。（インスタンス生成の際には親クラスのコンストラクタから呼び出される仕様のため。記載自体は省略しても同じ動作をする。コンストラクタ自体は継承しているわけではない。）
        System.out.println("SuperHeroのコンストラクタが動作");
    }

}
