public class Main3 {
    public static void main(String[] args) {
        Slime s = new Slime();
        Monster m = new Slime();
        s.run(); // -> スライムはサササっと逃げ出した
        m.run(); // -> 同上。Monster型のrun()ではなく、Slime型のrun()が動作するため。
    }
}
