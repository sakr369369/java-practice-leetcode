package com.java.array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if ((nums[i] + nums[j]) == target) {
                    output[0] = i;
                    output[1] = j;

                    System.out.println("outpout = ["+ i +","+j +"] , sum = "+ (nums[i] + nums[j]));
                    break;
                }
            }
        }

        return output;
    }

    public  void test1(){
       int[]  nums = {2,7,11,15};
        int target = 9;
        new TwoSum().twoSum(nums, target);
     }
    public  void test2(){
        int[]  nums = {3,2,4};
        int target = 6;
        new TwoSum().twoSum(nums, target);
    }

    public  void test4(){
        int[]  nums = {3,2,3};
        int target = 6;
        new TwoSum().twoSum(nums, target);
    }



    public static void main(String[] args) {

      //  new TwoSum().test1();
        new TwoSum().test2();
        new TwoSum().test4();
    }
}
