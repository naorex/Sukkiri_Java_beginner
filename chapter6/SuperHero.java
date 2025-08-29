public class SuperHero extends Hero {

    public void fly() {
        System.out.println(this + "は飛び上がった！");
    };

    public SuperHero() {
        super();
        System.out.println("SuperHeroのコンストラクタが動作");
    }
}
