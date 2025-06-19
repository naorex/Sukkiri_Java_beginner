public class S11SwitchOldCase {
    public static void main (String[] args) {
        System.out.println("あなたを運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch (fortune) {
            case 1, 2:
                System.out.println("いいね！");
                System.out.println("case 1 or 2");
                // break; // <= when forget to add "break", can complie but cause malfunction
            case 3:
                System.out.println("普通です");
                System.out.println("case 3");
                break;
            case 4, 5:
                System.out.println("微妙でした");
                System.out.println("case 4 or 5");
                break;
        }
    }
}
