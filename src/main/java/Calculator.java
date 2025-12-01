public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }


        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int a = 2;
        int b = 4;
        int c = 14;

        int right = dif(c, b);
        int x = div(right, a);
        return x;
    }
    public int solverQuadratic() {
        int a = 1;
        int b = -3;
        int c = 2;

        int D = dif(times(b, b), times(4, times(a, c)));

        if (D < 0) {
            return 0;
        }

        int sqrtD = (int) Math.sqrt(D);
        int x1 = div(add(-b, sqrtD), times(2, a));

        return x1;
    }
}
