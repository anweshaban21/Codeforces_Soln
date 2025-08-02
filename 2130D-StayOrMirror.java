import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();

        while (t-- > 0) {
            int length = reader.nextInt();
            int[] perm = new int[length + 1];

            for (int i = 1; i <= length; i++) {
                perm[i] = reader.nextInt();
            }

            long[] rightInv = new long[length + 1];
            long[] leftGreater = new long[length + 1];
            Fenwick tree = new Fenwick(length);

            long totalInversions = 0;
            tree.reset();

            for (int i = length; i >= 1; i--) {
                rightInv[i] = tree.prefixSum(perm[i] - 1);
                totalInversions += rightInv[i];
                tree.insert(perm[i], 1);
            }

            tree.reset();
            for (int i = 1; i <= length; i++) {
                leftGreater[i] = tree.rangeSum(perm[i] + 1, length);
                tree.insert(perm[i], 1);
            }

            long benefit = 0;
            for (int i = 1; i <= length; i++) {
                long net = (long)(length - i) - rightInv[i] - leftGreater[i];
                if (net < 0) benefit += net;
            }

            long finalAnswer = totalInversions + benefit;
            System.out.println(finalAnswer + " ");
        }
    }
}
class Fenwick {
    private long[] bit;
    private int size;

    public Fenwick(int n) {
        size = n + 2;
        bit = new long[size];
    }

    public void insert(int index, int value) {
        for (; index < size; index += index & -index) {
            bit[index] += value;
        }
    }

    public long prefixSum(int index) {
        long res = 0;
        for (; index > 0; index -= index & -index) {
            res += bit[index];
        }
        return res;
    }

    public long rangeSum(int left, int right) {
        return prefixSum(right) - prefixSum(left - 1);
    }

    public void reset() {
        Arrays.fill(bit, 0);
    }
}
