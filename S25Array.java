public class S25Array {
    // int型配列を受け取り、すべての要素を表示するメソッド
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        printArray(array); // 配列を渡す（厳密には参照先のポインターを渡している。参照渡し）
    }
}
