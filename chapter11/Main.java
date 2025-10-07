import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello!");
        } catch (Exception e) {  // Exception はどれでもキャッチする書き方
            System.out.println("何らかの例外が発生しました");
        } finally {
            if (fw != null) {
                try {
                    fw.close();  // どんな時でも実施する処理は finally へ書く
                } catch (IOException e) {
                    ;  // 空文。本来はエラーはもみ消さないほうがベター
            }
            }
        }
    }
}
