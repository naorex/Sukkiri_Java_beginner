public class S06OrderCommand {
    public static void main (String[] args) {

        // Compare large number
        int a = 5;
        int b = 6;
        int m = Math.max(a, b);
        System.out.println(m); // => 6

        // String to Int
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println(n); // => 31

        // Create random number
        int r = new java.util.Random().nextInt(90); // 0 <= r < 90
        System.out.println(r);

        // Input String
        String s = new java.util.Scanner(System.in).nextLine();
        System.out.println(s);

        // Input Integer
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println(input);
    }
}
