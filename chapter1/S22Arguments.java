public class S22Arguments {
    public static void main(String[] args) {
        hello("Naorex");
        add(100, 20);
        add(200, 50);
    }

    public static void hello(String name) {
        System.out.println(name + "さん、こんにちは");
    }

    public static void add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }
}
