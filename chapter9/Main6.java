public class Main6 {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String[] words = s.split("[,:]");  // 正規表現で分割処理
        for (String w : words) {
            System.out.println(w + "->"); // abc-> def-> ghi->
        }
    }
}
