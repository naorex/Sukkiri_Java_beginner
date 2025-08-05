public class Wizard {
    String name;
    int hp;
    public void heal(Hero h) {
        // 対象のHeroインスタンスを引数として受け取る
        h.hp += 10;
        System.out.println(h.name + "のHPを10回復した！");
    }
}
