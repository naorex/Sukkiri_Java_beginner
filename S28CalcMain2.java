package calcapp.main;
import calcapp.logics.S28CalcLogic;
import calcapp.logics.*; // => 全てのクラスをインポートする場合の記述

public class S28CalcMain2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = S28CalcLogic.tasu(a, b); // import すれば短縮可能
        int delta = S28CalcLogic.hiku(a, b); // 同様
        System.out.println(total + ", " + delta);
    }
}
