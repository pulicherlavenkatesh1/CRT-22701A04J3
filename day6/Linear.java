class Linear {
    public static void main(String[] args) {
        int[]nums={10,19,2,3,1,9,8};
        int target=1;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])
            index=i;
        }
        System.out.println(index==-1?"Elemens are not found":"Elemens are found a index:"+index);
    }
}