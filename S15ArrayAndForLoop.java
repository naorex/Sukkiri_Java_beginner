public class S15ArrayAndForLoop {
    public static void main (String[] args) {

        // 例1 ループにより配列の中身を順に表示
        int[] scores = {20, 30, 40, 50, 60};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // 例2 ループにより配列の中身を集計
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int avg = sum / scores.length;
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + avg);

        // 例3 条件と一致するものを集計する
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 50) {
                count++;
            }
        }
        System.out.println("50点以上の科目の数:" + count);
    }
}
