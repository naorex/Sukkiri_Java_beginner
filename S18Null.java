public class S18Null {
    public static void main (String[] args) {
        int[] array = {1,2,3};
        array = null;
        array[0] = 10; // => 配列の参照先がnullになっているため、格納不可
    }
}
