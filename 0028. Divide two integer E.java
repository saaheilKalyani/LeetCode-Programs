class Solution {

    public static final int MAX = (int)Math.pow(2, 30) - 1 + (int)Math.pow(2, 30);
    public static final int MIN = -(int)Math.pow(2, 30) - (int)Math.pow(2, 30);
    public int divide(int dividend, int divisor) {
        long result = (long)dividend/(long)divisor;
        if (result > (long)MAX)
        {
            return MAX;
        }
        else if (result < (long)MIN)
        {
            return MIN;
        }
        else
        {
            return (int)result;
        }
    }
}