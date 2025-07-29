package calcapp.main; // クラスをパッケージに所属させる

public class S28CalcMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = calcapp.logics.S28CalcLogic.tasu(a, b); // 呼び出し元のパッケージおよびクラス名をメソッドの前に付ける。FQCN（full qualified class name, 完全修飾クラス名 or 完全限定クラス名）
        int delta = calcapp.logics.S28CalcLogic.hiku(a, b); // 同様
        System.out.println(total + ", " + delta);
    }
}
