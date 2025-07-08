import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        label: while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            
            int min=a[0];
            int res=min;
            
            res+=Math.min(a[1],min);

                
            
            System.out.println(res);
        }
    }
}

    
            
