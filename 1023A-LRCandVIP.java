import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            //int m=sc.nextInt();
            int arr[]=new int[n];
            int arr2[]=new int[n];
            //Queue<Integer> q=new LinkedList<>();
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                
                
            }
            arr2=arr.clone();
            Arrays.sort(arr2);
            if(arr2[0]==arr2[n-1]){
                System.out.println("NO");
                
            }
            else{
                System.out.println("YES");
                for(int i=0;i<n-1;i++){
                    map.put(arr2[i],1);
                    
                }
                map.put(arr2[n-1],2);
                for(int a:arr){
                    int x=map.get(a);
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
            
            //System.out.println(index);
    }
            
            
            
}
            
            
    

 
  
