public class Main {
    public static void main(String[] args) {
        Empty e = new Empty();
        String s = e.toString(); // -> どこにも自分では定義していない
        System.out.println(s); // -> しかし、何かしら文字列が出る。Object クラスを継承しているため。
    }
}
