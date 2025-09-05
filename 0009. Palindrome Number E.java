class Solution {
    public static boolean isPalindrome(int x) {
        int number=0; 
        int temp=x; 
        while (temp > 0) {
            number=(10*number)+(temp%10);
            temp=temp/10; 
        }
        if (number == x) {
            return true; 
        }
        return false;
    }
    public static void main(String args[]) {
        int x=121;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }
}