class Solution {
    public int maxSubArray(int[] nums) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int start = 0;
    int sub_start = -1;
    int sub_end = -1;
    for(int i = 0; i<nums.length;i++){
        
        if(sum<=0){
            start = i;
        }
        sum+=nums[i];
        if(sum>max){
            max=sum;
            sub_start = start;
            sub_end = i;
            

        }
        if(sum<0){
            sum=0;
        }
    }
    return max;
        
    }
}