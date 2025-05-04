import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        // sc.nextLine();
        // while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            //Queue<Integer> q=new LinkedList<>();
            int max=0;
            for (int i= 0; i<n;i++) {
                int t=sc.nextInt();
                int p=(int)Math.ceil(t/(m*1.0));
                arr[i]=p;
                max=Math.max(max,p);
                
            }
            int index=0;
            for(int i=n-1;i>=0;i--){
                if(arr[i]==max){
                    index=i+1;
                    break;
                }
            }
            
            
            System.out.println(index);
    }
            
            
            
}
            
            
    

 
  
