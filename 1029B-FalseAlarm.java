import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int count=0;
            int turn=0;
            for(int i=0;i<n;){
                if(a[i]==0){
                   count++;
                   i++;
                }
                else{
                    if(turn==0){
                   count+=x;
                   i+=x;
                   turn++;
                    }
                    else{
                        break;
                    }
                }
            }
            if(count>=n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            

                
            
            
        }
    }
}
