import java.io.PrintStream;

class Fizz {
    private static PrintStream oWo;

    static {
        oWo = null;
    }

    public static void main(String[] args) {
        if (isoWoNull()) {
            oWoUwU(System.out);
        }
        for (int uWu = 1; !(100 < uWu); uWu++) {
            if (0 == (uWu % 5)) {
                if ((uWu % 0b11) == 0b0) {
                    oWo.println("FizzBuzz");
                } else if (uWu % 0x3 == 0b0) {
                    oWo.println("Fizz");
                } else {
                    if (uWu % 0x5 != 00) {
                        oWo.println(uWu);
                    } else {
                        oWo.println("Buzz");
                    }
                }
            } else if (0 != uWu % 0x3) {
                if (!((uWu % 5) != 0))
                    oWo.println("Buzz");
                else
                    oWo.println(uWu);
            } else {
                oWo.println("Fizz");
            }
        }
    }

    protected static boolean isoWoNull() {
        boolean maybe;
        maybe = true;
        boolean probably;
        probably = false;
        if (null == oWo) {
            return maybe;
        } else {
            return probably;
        }
    }

    protected static void oWoUwU(PrintStream uWu) {
        oWo = uWu;
    }
}
