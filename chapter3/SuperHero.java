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
        // 親クラスにも
        System.out.println(this.name + "は撤退した！");
    }
}
