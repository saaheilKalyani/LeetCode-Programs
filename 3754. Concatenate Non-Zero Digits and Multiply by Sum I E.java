class Solution {
    public long sumAndMultiply(int n) {
        int no = 0; 
        while (n > 0) {
            int n1 = n % 10; 
            if (n1 != 0) {
                no = no * 10 + n1; 
            }
            n = n / 10; 
        }
        n=0;
        int sum = 0;  
        while ( no > 0) {
            int n2 = no % 10; 
            n = n * 10 + n2; 
            sum += n2; 
            no /= 10; 
        }
        return (long) n * sum; 
    }
}