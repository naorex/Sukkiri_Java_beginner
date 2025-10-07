// 継承によりオリジナル例外を定義
public class UnsupportedMusicFileException extends Exception {
    public UnsupportedMusicFileException(String msg) {
        super(msg);
    }
}
