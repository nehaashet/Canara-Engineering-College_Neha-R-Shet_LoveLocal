import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        List<Integer> arr=new ArrayList<>();
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr.add(temp);
            
        }
        System.out.print("Enter the size of the sliding window: ");
        int k=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<n-k+1; i++){
            int max = -105; //constraints mention the range is from -104 to 104
            
            for(int j=i; j<k+i; j++){
                max=Math.max(arr.get(j), max);
            }
            
            ans.add(max);
            // System.out.println(i);
        }
        
        System.out.println(ans);
    }
}