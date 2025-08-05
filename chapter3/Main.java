public class Main {
    public static void main (String[] args) {
        SuperHero sh = new SuperHero();
        sh.run(); // 親クラスのメソッドを継承して使える
        sh.fly();
    }
}
