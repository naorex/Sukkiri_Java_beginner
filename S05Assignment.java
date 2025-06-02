public class S05Assignment {
    public static void main (String[] args) {
        float f = 3;
        double d = f; // assign float object to double class
        // this can be done because prepared memory size for double object is bigger than that for float object.
        // opposite will raise error.

        System.out.println(f); // => 3.0
        System.out.println(d); // => 3.0

        // however, it can be forced to do by case operator.
        int age = (int)3.2;
        System.out.println(age); // => 3
    }
}
