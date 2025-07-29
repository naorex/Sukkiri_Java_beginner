public class S19Array {
    public static void main (String[] args) {
        int[][] scores = new int[2][3]; // 2行3列の配列
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = i*2 + j*2;
                System.out.println(scores[i][j]);
            }
        }
    }
}
