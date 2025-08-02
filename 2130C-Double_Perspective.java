import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int edgeCount = sc.nextInt();
            List<int[]> edges = new ArrayList<>();

            for (int i = 0; i < edgeCount; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                int weight = end - start;
                edges.add(new int[]{weight, start, end, i + 1});
            }

            edges.sort((a, b) -> Integer.compare(b[0], a[0]));

            UnionFind uf = new UnionFind(2 * edgeCount + 10);
            List<Integer> selected = new ArrayList<>();

            for (int[] edge : edges) {
                if (uf.merge(edge[1], edge[2])) {
                    selected.add(edge[3]);
                }
            }

            System.out.println(selected.size());
            for (int idx : selected) {
                System.out.print(idx + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
class UnionFind {
    private int[] parent, size;

    public UnionFind(int count) {
        parent = new int[count + 1];
        size = new int[count + 1];
        for (int i = 0; i <= count; i++) {
            parent[i] = i;
            size[i] = 0;
        }
    }

    public int getRoot(int node) {
        if (parent[node] != node) {
            parent[node] = getRoot(parent[node]);
        }
        return parent[node];
    }

    public boolean merge(int u, int v) {
        u = getRoot(u);
        v = getRoot(v);
        if (u == v) return false;
        if (size[u] < size[v]) {
            int tmp = u;
            u = v;
            v = tmp;
        }
        parent[v] = u;
        if (size[u] == size[v]) {
            size[u]++;
        }
        return true;
    }
}
