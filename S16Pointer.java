public class S16Pointer {
    public static void main (String[] args) {

        // 参照先が同じオブジェクト
        int[] arrayA = {1,2,3};
        int[] arrayB;
        arrayB = arrayA;
        arrayB[0] = 100;
        System.out.println(arrayA[0]); //=>100（変更が反映される）

        // 参照先が異なるオブジェクト
        String varA = "A";
        String varB;
        varB = varA;
        varB = "B";
        System.out.println(varA); //=>A（変更が反映されない）
    }
}
