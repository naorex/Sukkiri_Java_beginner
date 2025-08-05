public class Main5 {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name); // => ミナト
        Hero h2 = new Hero();
        System.out.println(h2.name); // => ダミー
    }
}
