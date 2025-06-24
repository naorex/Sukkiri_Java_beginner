public class S14Array {
    public static void main (String[] args) {

        // 空の配列変数 scores を定義し、int型の要素5つを受ける配列を用意
        int[] scores = new int[5];

        // 配列の要素の数を確認
        int num = scores.length;
        System.out.println("要素の数:" + num);

        // 配列の要素に値を代入
        scores[1] = 30;
        System.out.println(scores[1]);

        // 省略した記法の例
        int[] scores2 = new int[] {20, 30, 40, 50, 60};
        int[] scores3 = {20, 30, 40, 50, 60};
        System.out.println(scores2[2] + ", " + scores3[3]); // => 40, 50
    }
}
