package com.java.array;

import java.util.HashMap;
import java.util.Map;

class TwoSum2 {
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {

                System.out.println( i + "  -- -----complement---- = "+ complement +"  ,, map.key/value =   " +nums[i] + " = "+i + "--get = "+map.get(complement));
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);

            System.out.println( i + "  -- -----complement---- = "+ complement +"  ,, map.key/value =   " +nums[i] + " = "+i + "--get = "+map.get(complement));


        }

        return null; // This line will never be reached because exactly one solution exists.
    }
    public  void test1(){
        int[]  nums = {2,15,11,7};
        int target = 9;
        int[] output = new TwoSum2().twoSum2(nums, target);
        System.out.println( output[0] + "  - "+ output[1]);
    }
    public  void test2(){
        int[]  nums = {3,2,4};
        int target = 6;
        new TwoSum2().twoSum2(nums, target);
    }

    public  void test3(){
        int[]  nums = {2,15,11,7};
        int target = 9;
        int[] output = new TwoSum2().twoSum2(nums, target);
        System.out.println( output[0] + "  - "+ output[1]);
    }
    public  void test4(){
        int[]  nums = {3,2,3};
        int target = 6;
        int[] output = new TwoSum2().twoSum2(nums, target);
        System.out.println( output[0] + "  - "+ output[1]);
    }



    public static void main(String[] args) {

         new TwoSum2().test1();
     //    new TwoSum2().test3();
       // new TwoSum2().test2();
      //  new TwoSum2().test4();
    }
}