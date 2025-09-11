public class Hero {
    private String name;
    private int hp;

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
}
