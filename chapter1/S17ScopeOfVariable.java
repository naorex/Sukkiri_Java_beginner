public class S17ScopeOfVariable {
    public static void main (String[] args) {
        boolean judge = true;
        if (judge == true) {
            int[] array = {1,2,3};
            System.out.println(array[0]);
        }
        // System.out.println(array[0]); //=> 変数のスコープ外のためガベージコレクションで削除され、コンパイルエラーとなる
    }
}
