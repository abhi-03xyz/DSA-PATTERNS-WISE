public class Leet80 {
      public int removeDuplicates(int[] nums) {
        int left =1,occ=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            occ++;
            else
            occ=1;

            if(occ<=2)
            {
                nums[left]=nums[i];
                left++;
            }
        }
        return left;
    }
}
