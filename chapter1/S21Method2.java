public class S21Method2 {
    public static void main(String[] args) {
        methodA(); // => methodB の表示の次に methodA。python のようなスクリプト言語と異なり、記述する順番の制約無し。
    }

    public static void methodA() {
        methodB();
        System.out.println("methodA");
    }

    public static void methodB() {
        System.out.println("methodB");
    }
}
