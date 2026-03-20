import java.util.*;

public class main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long min = k * (k + 1) / 2;
            long max = k * (2 * n - k + 1) / 2;

            if(x >= min && x <= max)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
