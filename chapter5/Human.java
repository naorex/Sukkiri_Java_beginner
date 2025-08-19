public interface Human extends Creature {
    // Creature インターフェースの継承だが、
    // 以下の通りメソッドのオーバーライドはしておらず新規に抽象メソッドを追加しているだけなので、
    // この場合は extends で宣言する。
    void talk();
    void watch();
    void hear();
}
