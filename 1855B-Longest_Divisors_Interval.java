import java.util.*;

public class main{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            //long a = sc.nextLong();
            long n = sc.nextLong();
            //int n = sc.nextInt();
            
            // int x[]=new int[n];
            // for(int i=0;i<n;i++){
            //     x[i]=sc.nextInt();
            // }
            //Arrays.sort(x);
            // long ans=0L;
            long ans=n+1;
            for(long i=1;i<=n;i++){
                if(n%i!=0){
                    ans=i;
                    break;
                }
                
            }
            
            
            System.out.println(ans-1);
            

            
        }
    }
}
