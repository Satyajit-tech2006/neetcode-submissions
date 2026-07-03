class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int n=height.length;
        int l=0,r=n-1;
        int leftmax=height[l],rightmax=height[r];
        int ans=0;
        while(l<r){
            if(leftmax<rightmax){
                l++;
                leftmax=Math.max(leftmax,height[l]);
                ans+=leftmax-height[l];
            }

            else{
                r--;
                rightmax=Math.max(rightmax,height[r]);
                ans+=rightmax-height[r];
            }
        }
        return ans;
    }
}
