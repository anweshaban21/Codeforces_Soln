import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //sc.nextLine();
        //while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[7];
            int sum=0;
            for(int i=0;i<7;i++){
                arr[i]=sc.nextInt();
                //sum+=arr[i];
            }
            int i=0;
            while(sum<n){
                sum+=arr[i%7];
                if(sum>=n){
                    break;
                }
                i++;
            }
            System.out.println(i%7+1);
            //System.out.println(c+" "+d);
            
            
            
        
            
            // for(int i=0;i<n;i++){
            //     a[i]=sc.nextInt();
            //     sum+=a[i];
            // }
            
            
            
        }
    }
 
  
