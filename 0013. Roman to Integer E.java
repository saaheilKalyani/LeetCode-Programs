class Solution {
    public static int getValue(char r) {
        switch(r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10; 
            case 'L': return 50; 
            case 'C': return 100; 
            case 'D': return 500; 
            case 'M': return 1000; 
        }
        return 0;
    }
    public static int romanToInt(String s) {
        int total=0;  
        for (int i=0; i<s.length(); i++) {
            int no=getValue(s.charAt(i));
            if (i+1 < s.length() && no < getValue(s.charAt(i+1))) {
                total -= no; 
            }
            else {
                total += no;
            }   
        }
        return total; 
    }
    public static void main(String args[]) {
        String s="III";
        int no=romanToInt(s); 
        System.out.println(no);
    }
}