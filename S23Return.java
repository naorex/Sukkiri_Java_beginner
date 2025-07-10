public class S23Return {
    public static int add(int x, int y) { // 戻り値を int で指定（add()の左側）
        int ans = x + y;
        return ans;
    }

    public static void main(String[] args) { // 何も戻り値が無いため main() の左は void
        int ans = add(100, 10); // => 110
        System.out.println(ans);

        System.out.println(add(add(10, 10), add(30, 40))); // => 20+70=90
    }
}
