class Binary {
    public static void main(String[] args) {
        int[]nums={1,2,3,5,34,53,23};
        int target=53;
        int left=0;
        int index=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target>nums[mid]){
                left=mid+1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }else{
                index=mid;
                break;
            }
        }
        System.out.println(index==-1?"Elements are not found":"Elements are found at index:"+index);
    }
}