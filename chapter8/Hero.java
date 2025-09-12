public class Hero {
    private String name;
    private int hp;
    static int money; // 静的フィールド（クラス変数とも呼ぶ）

    public String toString() {
        // オーバーライドして既定の動作を決めておく
        return "名前:" + this.getName() + "/HP:" + this.getHp();
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断");
        }
        this.name = name;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            throw new IllegalArgumentException("HPが0以下。処理を中断");
        }
        this.hp = hp;
    }

    public boolean equals(Object o) {
        // 等値判定の equals() を等価判定の働きになるようにオーバーライド
        if (this == o) {
            // 等値判定（等価判定に内包されている）
            return true;
        }
        if (o instanceof Hero h) {
            // 名前が等しければ等価判定を追加
            if (this.name.equals(h.name)) {
                return true;
            }
        }
        return false;
    }
}
