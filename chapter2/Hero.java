public class Hero {
    String name;
    int hp;

    // 剣クラスのフィールド（別途定義した Sword型）を定義しておく。"has-a" のクラス同士の関係。
    Sword sword;

    public void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }
    public void sleep() {
        this.hp = 100; // this は自身のインスタンスへの変数設定で用いる。（Python でいう self）
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec; // 秒数分をHP回復
        System.out.println(
            this.name + "は、" + sec + "ポイント回復した"
        );
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }

    public Hero(String name) {
        // コンストラクタ1
        // Java のコンストラクタ定義方法。
        // クラス名と同じメソッド名に設定、戻り値無しとする。
        this.hp = 100;
        this.name = name; // 引数でnameフィールドを初期化
    }

    public Hero() {
        // コンストラクタ2（引数無し）
        // コンストラクタをオーバーロードして、引数無しで動くバージョンも作っておくと、テストの際に楽。
        // コンストラクタ1を呼び出すように JVM へ依頼する書き方。"this()"
        this("ダミー");
    }
}
