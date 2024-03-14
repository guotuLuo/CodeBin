import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        for (int num:twoSum_hash(nums, 6)){
            System.out.println(num);
        }
    }

    // 1. 暴力枚举O(n^2d):从头开始遍历，记录当前位置和后面每一个位置上的数的和，判断是否等于target
    public static int[] twoSum(int[] nums, int target) {
        int[] temparr = new int[2];
        for(int i = 0;i< nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i] + nums[j]==target){
                    temparr[0] = i;
                    temparr[1] = j;
                    return temparr;
                }
        return temparr;
    }

    // 2. 哈希表，用key value分别存储数字和下标，当有数字x加入时，判断target-x是否在哈希表中，可以快速返回数字下标
    //    哈希表是索引为key的数组
    public static int[] twoSum_hash(int[] nums, int target) {
        int[] temparr = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashmap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(hashmap.containsKey(target - nums[i]) && ( i != hashmap.get(target - nums[i]))){
                temparr[0] = i;
                temparr[1] = hashmap.get(target - nums[i]);
                return temparr;
            }
        }
        return temparr;
    }
}
