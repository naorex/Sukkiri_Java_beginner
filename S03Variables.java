public class S03Variables {
    public static void main (String[] args) {

        // Variables

        // cosume memory size = 1 byte => int:-128 ~ +127
        byte glasses = 2;

        // cosume memory size = 2 byte => int:-32768 ~ +32767
        short age = 18;

        // (recommended for any use)
        // cosume memory size = 4 byte
        int salary = 150000;

            int a = 0x11;  // => Hex-adecimal (16進数)
            System.out.println(a); // => 17
            int b = 011;   // => Octal-number (8進数)
            System.out.println(b); // => 9
            int c = 0b11;  // => Binary-number (2進数)
            System.out.println(c); // => 3

        // cosume memory size = 8 byte
        long worldPeople = 6900000000L; // need "L" at the end

        float weight = 67.5F; // need "F" at the end

        // (recommended for any use)
        // consume more memory than float, but able to calculate precisely
        double height = 171.2;

        boolean isError = true;

        char zodiac = '辰'; // => use single quote

        String name = "すがわら"; // => use double quote

        // Const Variables

        final double PI = 3.14; // use BLOCK LETTER in general
        //PI = 10; // => raise Error

    }
}
