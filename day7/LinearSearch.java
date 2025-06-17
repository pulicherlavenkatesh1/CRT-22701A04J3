class LinearSearch{
    public static void main(String[] args) {
        System.out.println(LinearSearch(new int[]{10,19,2,3,1,5,34},2));
        System.out.println(LinearSearch(new int[]{10,19,2,3,1,5,34},5));
        System.out.println(LinearSearch(new int[]{10,19,2,3,1,5,34},8));
    }
    public static int LinearSearch(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])return i;
        }
        return -1;
    }
}