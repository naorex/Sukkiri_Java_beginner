public class S24Overload {
    // 同じメソッド名でも、引数の型もしくは個数が異なると異なるメソッドとして処理される

    // first add method
    public static int add(int x, int y) {
        return x + y;
    }

    // second add method
    public static double add(double x, double y) {
        return x + y;
    }

    // third add method
    public static String add(String x, String y) {
        return x + y;
    }

    // fourth add method
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));  // => 30
        System.out.println(add(3.5, 7.5)); // => 11.0
        System.out.println(add("Hello", "World")); // => HelloWorld
        System.out.println(add(10, 20, 30)); // => 60
    }
}
