import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        label: while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            char S[]=s.toCharArray();
            //int x[]=new int[n];
            int c=0;
            for(char ch:S){
                if(ch=='1')
                    c++;
            }
            

            //int ans=Math.min(st,end)+Math.abs(x[0]-x[n-1]);
            
            

             String ans=(c<=k || 2*k>n)?"Alice":"Bob";   
            
            System.out.println(ans);
        }
    }
public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);  
  }
}

    
            
