class Solution {
    public String defangIPaddr(String address) {
        // String[] str = address.split("\\.");
        // StringBuilder sb = new StringBuilder(address.length());  
        // for (int i=0; i<str.length; i++) {
        //     if (i==str.length-1) {
        //          sb.append(str[i]);
        //     } else {
        //         sb.append(str[i]+"[.]");
        //     }
        // }
        // return sb.toString();
        return address.replace(".","[.]");
    }
}