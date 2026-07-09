class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int M = 1000000007;
        int m = s.length();
        
        // count_nz[i] stores the number of non-zero digits in s[0..i]
        int[] count_nzr = new int[m];
        int nz = 0;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != '0') {
                nz++;
            }
            count_nzr[i] = nz;
        }
        
        // k is the total number of non-zero digits in the string
        int k = nz;
        
        // 1-based prefix arrays for fast range calculations
        long[] P_sum = new long[k + 1];
        long[] P_val = new long[k + 1];
        long[] pow10 = new long[k + 1];
        pow10[0] = 1;
        
        int currIdx = 1;
        for (int i = 0; i < m; i++) {
            char c = s.charAt(i);
            if (c != '0') {
                int d = c - '0';
                P_sum[currIdx] = P_sum[currIdx - 1] + d;
                P_val[currIdx] = (P_val[currIdx - 1] * 10 + d) % M;
                pow10[currIdx] = (pow10[currIdx - 1] * 10) % M;
                currIdx++;
            }
        }
        
        int[] ans = new int[queries.length];
        
        // Process each query in O(1) time
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            
            // Map original string indices to our non-zero prefix arrays
            int u = (l > 0) ? count_nzr[l - 1] : 0; 
            int v = count_nzr[r] - 1;               
            
            // If there are no non-zero digits in the range [l, r]
            if (u > v) {
                ans[i] = 0;
                continue;
            }
            
            // 1-based indexing for the prefix arrays
            int start = u + 1;
            int end = v + 1;
            
            // Calculate sum of digits in O(1)
            long sum = P_sum[end] - P_sum[start - 1];
            
            // Calculate integer value modulo 10^9 + 7 in O(1)
            // + M ensures no negative values before the final modulo
            long subX = (P_val[start - 1] * pow10[end - start + 1]) % M;
            long x = (P_val[end] - subX + M) % M;
            
            // Final calculation
            long res = (x * (sum % M)) % M;
            ans[i] = (int) res;
        }
        
        return ans;
    }
}