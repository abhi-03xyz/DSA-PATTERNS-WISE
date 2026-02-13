public class RmvDuplArr {
      public int removeDuplicates(int[] nums) {
        int off=0,n=nums.length,cm=1,res=1;

        while(cm<n)
        {
            if(nums[cm]==nums[cm-1])
            {
                cm++;
                continue;
            }
            nums[off+1]=nums[cm++];
            off++;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
