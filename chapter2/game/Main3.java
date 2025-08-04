public class Main3 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1); // 110
        System.out.println(h1.hp);
        w.heal(h2); // 110
        w.heal(h2); // 120
        System.out.println(h2.hp);
    }
}
