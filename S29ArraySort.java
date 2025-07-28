public class S29ArraySort {
    public static void main(String args[]) {
        int[] heights = {172,149,152,191,155};
        java.util.Arrays.sort(heights); // Javaの組み込み機能(API)を利用
        for (int h: heights) {
            System.out.println(h);
        }
    }
}
