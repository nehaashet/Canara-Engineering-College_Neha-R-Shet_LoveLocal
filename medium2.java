//input format example "n=3, arr=[3,2,3]"//
import java.util.*;
class Main{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        System.out.print("Enter length of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            int temp=sc.nextInt();
            arr.add(temp);
        }
        
        for(int i=0; i<n; i++){
            int value=hash.getOrDefault(arr.get(i), 0);
            value++;
            hash.put(arr.get(i), value);
        }
        int limit=n/3;
        Set<Integer> finalSet=new HashSet<>();
        for(int i=0; i<n; i++){
            if(hash.get(arr.get(i))>limit){
                finalSet.add(arr.get(i));
            }
        }
        
        System.out.println(finalSet);
    }
}
