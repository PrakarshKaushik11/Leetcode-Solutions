import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) {
            return 0;
        }

        int n = nums.length;

        // Minimum possible maximum gap
        int gap = (int) Math.ceil((double) (max - min) / (n - 1));

        int[] bucketMin = new int[n];
        int[] bucketMax = new int[n];
        boolean[] used = new boolean[n];

        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        for (int num : nums) {
            int index = (num - min) / gap;

            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);
            used[index] = true;
        }

        int result = 0;
        int previousMax = min;

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                continue;
            }

            result = Math.max(result, bucketMin[i] - previousMax);
            previousMax = bucketMax[i];
        }

        return result;
    }
}