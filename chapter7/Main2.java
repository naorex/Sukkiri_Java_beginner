public class Main2 {
    public static void main(String[] args) {
        Hero h = new Hero();
        King k = new King();
        k.talk(h);
        h.setName(""); // -> setName()に記載したチェック機構が正しく働いてエラーを返す
    }
}
