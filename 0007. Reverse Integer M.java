class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int mod = x % 10;  // get last digit
            x /= 10;           // remove last digit

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && mod > 7)) {
                return 0; // overflow for positive
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && mod < -8)) {
                return 0; // overflow for negative
            }

            rev = rev * 10 + mod;
        }
        return rev;
    }
}