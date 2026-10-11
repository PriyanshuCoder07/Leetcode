class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int max = 0;

        long k = (long) k1 + k2;

        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        if (k >= 0) {
            long sum = 0;

            for (int d : diff) {
                sum += d;
            }

            if (k >= sum) {
                return 0;
            }
        }

        int[] freq = new int[max + 1];

        for (int d : diff) {
            freq[d]++;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }

            int count = freq[d];
            int next = d - 1;

            long operationsNeeded = (long) count * (d - next);

            if (operationsNeeded <= k) {
                freq[next] += count;
                freq[d] = 0;
                k -= operationsNeeded;
            } else {
                long fullReductions = k / count;
                int remaining = (int) (k % count);

                int reducedValue = d - (int) fullReductions;

                freq[d] = 0;
                freq[reducedValue] += count - remaining;
                freq[reducedValue - 1] += remaining;

                k = 0;
            }
        }

        long answer = 0;

        for (int d = 1; d < freq.length; d++) {
            answer += (long) d * d * freq[d];
        }

        return answer;
    }
}