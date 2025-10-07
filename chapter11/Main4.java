public class Main4 {
    public static void main(String[] args) {
        try {
            // ここでは意図的に例外を発生させているだけ
            throw new UnsupportedMusicFileException("未対応のファイルです");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
