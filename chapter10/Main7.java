import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);  // Map型はKey-Value形式で値を格納
        prefs.put("東京都", 1261);
        prefs.put("熊本", 181);
        int tokyo = prefs.get("東京都");  // Key指定で値を取り出し
        System.out.println("東京都の人口は" + tokyo);
        prefs.remove("京都府");
        prefs.put("熊本県", 182); // 上書き
        int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は" + kumamoto);
    }
}
