public class Main5 {
    public static void main(String[] args) {

        String name01 = "SATOSHI1"; // true
        System.out.println(isValidPlayerName(name01));

        String name02 = "SATd%1"; // false
        System.out.println(isValidPlayerName(name02));

    }

    public static boolean isValidPlayerName(String name) {
        // 8文字で、使える文字は A~Z と 0~9 のみ
        return name.matches("[A-Z][A-Z0-9]{7}"); // 正規表現
    }
}


