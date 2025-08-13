public abstract class Character {
    // 抽象メソッドを含むクラスの宣言
    String name;
    int hp;

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    public abstract void attack(Matango m);
        // attack() の中身の具体的な部分を曖昧なままにする抽象メソッドを定義
}
