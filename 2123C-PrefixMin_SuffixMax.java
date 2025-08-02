import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test=input.nextInt();
        while(test>0){
            int n=input.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int minimum=Integer.MAX_VALUE;
            int maximum=Integer.MIN_VALUE;
            int min[]=new int[n];
            int max[]=new int[n];
            int i=0;
            int j=n-1;
            while(i!=n&&j!=-1){
               maximum =Math.max(maximum, arr[j]);
                minimum=Math.min(minimum, arr[i]);
                min[i]=minimum;
                max[j]=maximum;
                i++;
                j--;
            }
            // for(int p=0;p<n;p++){
            //     System.out.print(min[p]+" ");
            // }
            // System.out.println();
            // for(int p=0;p<n;p++){
            //     System.out.print(max[p]+" ");
            // }
            // System.out.println();
            for(int k=0;k<n;k++){
                if(arr[k]==min[k]||arr[k]==max[k]){
                    System.out.print('1');
                }
                else{
                    System.out.print('0');
                }

            }
            System.out.println();
            test--;
        }
    }
    
}
