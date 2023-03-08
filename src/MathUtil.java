public class MathUtil {
    public static double sqrt(double x) {
        if (x < 0.0)
            throw new ArithmeticException("Argument of square root must be non-negative");

        double a = x;
        double lastResult = 0.0;

        while (lastResult != a) {
            lastResult = a;
            a = (a + x / a) / 2.0;
        }

        return a;
    }

    public static void main(String[] args) {
        double x = 9.0;
        System.out.println(MathUtil.sqrt(x));
    }
}