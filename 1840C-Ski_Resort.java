import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long q=sc.nextLong();
            //int one=0,zero=0;
            long a[]=new long[n];
            long count=0;
            long ans=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                if(a[i]<=q)
                    count++;
                else
                    count=0;
                
                ans+=Math.max(0,count-k+1);
            }
            System.out.println(ans);
            //System.out.println(c+" "+d);
            
            
            
        
            
            // for(int i=0;i<n;i++){
            //     a[i]=sc.nextInt();
            //     sum+=a[i];
            // }
            
            
            
        }
    }
}
 
  
