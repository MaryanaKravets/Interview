package main.java;

public class TestPowTwo {
    /* Find all positive values power of two (without external utils) * ex. 1, 2, 4, 8, 16, 32, 64, 128, 256 */

    public static void main(String[] args) {
        for (int i = -256; i <= 256; i++) {
            if (isPowTwo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPowTwo(int val) {
        if (val <= 0) {
            return false;
        }

        while (val != 1) {
            if (val % 2 != 0) {
                return false;
            }
            val /= 2;
        }
        return true;
    }
}
