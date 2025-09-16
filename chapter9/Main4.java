public class Main4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("Java");  // バッファとして StringBuilder型のインスタンスに追加
            // StringBuilder クラスは可変（mutable）なクラスとして設計されているため、不可変（immutable）な String クラスを文字列作成の度に使い捨てるよりも圧倒的に処理が速くなる
        }
        String s = sb.toString(); // 完成した文字列を取り出し
        System.out.println(s);
    }
}
