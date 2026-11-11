class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         if (n == 0) {
            return;
        }
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,k,n-1);
        reverse(nums,0,k-1);
        


        

        
    }
    public void reverse(int[] nums,int st , int end){
        int temp = 0;
        while(st<end){
            temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
            
        }
    }
}