public class S27Array3 {
    // int型の配列を作成して返すメソッド
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray; // int配列を戻す
    }

    public static void main(String[] args) {
        int[] array = makeArray(3);
        for (int i : array) {
            System.out.println(i); // array の全要素を出力 (0,1,2)
        }
    }
}
