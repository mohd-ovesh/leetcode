class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int current1 = m-1;
        int current2 = n-1;
        int merged = m+n-1;

        while(current2>=0){
            if(current1>=0 && nums1[current1]>=nums2[current2]){
                nums1[merged--] = nums1[current1--];
            } else{
                nums1[merged--] = nums2[current2--];
            }
        }
    }
}

