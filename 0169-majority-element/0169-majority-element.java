class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el = 0;
        int n = nums.length;
        for(int i =0; i<n;i++){
            if(count==0){
                el = nums[i];
            }
            if(nums[i]==el){
                count++;
            }
            else{
                count--;
        }
        }
        
        return el;
    }
}