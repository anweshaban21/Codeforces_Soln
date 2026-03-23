import java.util.*;

public class main{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            //long a = sc.nextLong();
            //long b = sc.nextLong();
            int n = sc.nextInt();
            
            int x[]=new int[n];
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
            //Arrays.sort(x);
            // long ans=0L;
            // ans=b;
            // for(int i=0;i<n;i++){
            //     ans+=Math.min(x[i],a-1);
                
            // }
            
            if(n%2==0){
            System.out.println(2);
            System.out.println(1+" "+n);
            System.out.println(1+" "+n);
            }
            else{
            System.out.println(4);
            System.out.println(1+" "+2);
            System.out.println(1+" "+2);
            System.out.println(2+" "+n);
            System.out.println(2+" "+n);
            }

            
        }
    }
}
