class Solution {
    public int lengthOfLongestSubstring(String s) {

        int hash[] = new int[256];

        for (int i = 0; i < 256; i++) {
            hash[i] = -1;  // intially all marked as not seen
        }

        int l = 0;
        int r = 0;
        int maxlen = 0;
        int n = s.length();

        while (r < n) {

            char ch = s.charAt(r);

            if (hash[ch] >= l) {  // greater than or equal to 1 means it apearing more than one 
                l = hash[ch] + 1;
            }

            hash[ch] = r; // it is to update the latest index of r pointer

           maxlen = Math.max(maxlen, r-l+1);

            r = r + 1;
        }

        return maxlen;
    }
}