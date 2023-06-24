public class Solution {
    public static int solution(int[] x, int[] y) {
        int xorSum = 0;

        for (int num : x) {
            xorSum ^= num;
        }

        for (int num : y) {
            xorSum ^= num;
        }

        return xorSum;
    }

    public static void main(String[] args) {
        int[] x1 = {14, 27, 1, 4, 2, 50, 3, 1};
        int[] y1 = {2, 4, -4, 3, 1, 1, 14, 27, 50};
        System.out.println(solution(x1, y1));  // Output: -4

        int[] x2 = {13, 5, 6, 2, 5};
        int[] y2 = {5, 2, 5, 13};
        System.out.println(solution(x2, y2));  // Output: 6
    }
}
