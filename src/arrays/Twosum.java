package arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
public class Twosum {
    public static int[] FindTheBest(int[] nums, int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(FindTheBest(nums,target)));
    }
}
