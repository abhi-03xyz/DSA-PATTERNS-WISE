public class Leet977 {
     public int[] sortedSquares(int[] nums) {
        
        int n=nums.length;
        int arr[]=new int[n];
        int st=0,end=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(Math.abs(nums[st])>=Math.abs(nums[end]))
            {
                arr[i]=nums[st]*nums[st];
                st++;
            }else{
                arr[i]=nums[end]*nums[end];
                end--;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        
    }
}
