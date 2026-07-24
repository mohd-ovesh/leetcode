class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int[] merged = new int[m+n];
        int current1 = 0;
        int current2 = 0;
        int mergedPointer = 0;

        while(current1 < m || current2 < n){
            if(nums1[current1] >= nums2[current2]){
                merged[mergedPointer] = nums1[current1];
                mergedPointer++;
                current1++;
            } else{
                merged[mergedPointer] = nums2[current2];
                mergedPointer++;
                current2++;
            }   
        }

        while(current1<m){
       
                merged[mergedPointer] = nums1[current1];
                mergedPointer++;
                current1++;
           }

        while(current2<n){

                merged[mergedPointer] = nums2[current2];
                mergedPointer++;
                current2++;
           }
         
        for(int i =0;i<m+n;i++){
            nums1[i] = merged[i];
        }
    }
}
