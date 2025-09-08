public class Hero {
    private int hp = 100;
    private String name = "名無しヒーロー";

    void sleep() {
        // public のアクセス修飾子を付けない場合は package private 修飾子の扱いとなる
        this.hp += 100;
        System.out.println(this.name + "は眠って回復した");
        System.out.println("現在のHPは" + this.hp);
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAME OVER");
    }

    public String getName() {
        // private フィールドへのアクセス用のメソッドを設定する
        // いわゆる getter メソッド、もしくはアクセサーと慣習的に呼ばれている
        return this.name;
    }

    public void setName(String name) {
        // private フィールドへのアクセス用のメソッドを設定する
        // いわゆる setter メソッド、もしくはアクセサーと慣習的に呼ばれている
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断");
        }
        // 検査完了。代入しても大丈夫
        this.name = name;
    }
}
