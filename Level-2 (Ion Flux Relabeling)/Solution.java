public class Solution {
    public static int[] solution(int h, int[] q) {
        int treeSize = (int) Math.pow(2, h) - 1;
        int[] result = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            int converter = q[i];
            int parent = treeSize;
            int level = h;

            while (converter != parent && level > 1) {
                int leftChild = parent - (1 << (level - 2));
                int rightChild = parent - 1;

                if (converter > leftChild && converter > rightChild) {
                    result[i] = -1;
                    break;
                }

                if (converter <= leftChild) {
                    parent = leftChild;
                } else {
                    parent = rightChild;
                }

                level--;
            }

            if (converter == parent) {
                result[i] = parent - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result1 = solution(3, new int[]{7, 3, 5, 1});
        for (int num : result1) {
            System.out.print(num + " ");
        }
        // Output: -1 7 6 3

        System.out.println();

        int[] result2 = solution(5, new int[]{19, 14, 28});
        for (int num : result2) {
            System.out.print(num + " ");
        }
        // Output: 21 15 29
    }
}
