class Solution {
    public static int findClosest(int x, int y, int z) {
        int cntx=0, cnty=0;
        while (x!=z) {
            if (x < z) {
                x++;  
            } else {
                x--;  
            }
            cntx++;
        }
        while (y!=z) {
            if (y<z) {
                y++;
            } else {
                y--; 

            }
            cnty++; 
        }
        if (cntx == cnty) {
            return 0;
        } else if (cntx < cnty) {
            return 1;
        } else {
            return 2;
        }
    }
    public static void main(String args[]) {
        int x=2, y=5, z=6;
        int cnt = findClosest(x,y,z);
        System.out.println(cnt);
    }
}