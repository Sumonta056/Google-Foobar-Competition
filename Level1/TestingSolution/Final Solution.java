public class Solution {
    public static int solution(int[] x, int[] y) {
        // Your code here

        int xorSum = 0;

        for (int num : x) {
            xorSum ^= num;
        }

        for (int num : y) {
            xorSum ^= num;
        }

        return xorSum;
    }
}