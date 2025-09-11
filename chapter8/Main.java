public class Main {
    public static void main(String[] args) {
        Empty e = new Empty();
        String s = e.toString(); // -> どこにも自分では定義していない
        System.out.println(s); // -> しかし、何かしら文字列が出る。Object クラスを継承しているため。

        // Object クラスは全ての大元なので、以下のようにどんなインスタンスも代入できる。
        Object o1 = new Empty();
        Object o2 = "こんにちは";
        Object o3 = 1234;

        Printer p = new Printer();
        p.printAnything(o1);
        p.printAnything(o2);
        p.printAnything(o3);

        Hero h = new Hero();
        h.setName("ミナト");
        h.setHp(100);
        System.out.println(h.toString());
    }
}
