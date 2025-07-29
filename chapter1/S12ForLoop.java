public class S12ForLoop {
    public static void main (String[] args) {
        // 10回繰り返すプログラム
        // 【NOTE】Java は for ループ内の変数はローカル変数がデフォルト（変数スコープがローカル）
        for (int i = 0; i < 10; i++) {
            System.out.println("こんばんは");
            System.out.println("現在" + (i + 1) + "周目");
        }
    }
}
