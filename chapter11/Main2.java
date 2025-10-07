import java.io.*;

// try-with-resources 文の利用で少し簡潔に記述
public class Main2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt");) {
            fw.write("hello!");
        } catch (Exception e) {
            System.out.println("何らかの例外が発生");
        }
    }
}
