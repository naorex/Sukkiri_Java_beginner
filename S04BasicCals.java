public class S04BasicCals {
    public static void main (String[] args) {
        int a = 2;

        a += 1; // a = a + 1
        System.out.println(a); // => 3

        a = 100;
        a++; // +1 incliment
        System.out.println(a); // => 101

        // !! NOTICE !!
        int x = 10;
        int y = 10;
        System.out.println(++x + 50); // => 61, 1+60+50 then print
        System.out.println(y++ + 50); // => 60, 10+50 print then 60+1
    }
}
