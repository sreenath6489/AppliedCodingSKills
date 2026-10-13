class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to long to avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Keep subtracting the largest possible multiple
        while (a >= b) {

            long temp = b;
            int multiple = 1;

            // Find the largest power-of-2 multiple of divisor
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        // Determine sign
        if ((dividend < 0) != (divisor < 0)) {
            result = -result;
        }

        return result;
    }
}