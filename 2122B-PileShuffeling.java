import java.io.*;
import java.util.*;

public class Main {

    static class Pile {
        long a, b, c, d;
        Pile(long a, long b, long c, long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long ans = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                long d = Long.parseLong(st.nextToken());

                if (b <= d) {
                    ans += Math.max(0, a - c);
                } else {
                    ans += a;
                    ans += Math.max(0, b - d);
                }
            }

            System.out.println(ans);
        }
    }
}
