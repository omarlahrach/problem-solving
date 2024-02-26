public class MaximumSubarraySum {
    private static final int[] ARRAY = {-1, 2, 4, -3, 5, 2, -5, 2};

    public static int algorithm1() {
        int n = ARRAY.length;
        int best = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a; b < n; b++) {
                int sum = 0;
                for (int k = a; k <= b; k++) {
                    sum += ARRAY[k];
                }
                best = Math.max(best, sum);
            }
        }
        return best;
    }
}
