package PracticeAug7FunctionalInterface;

public class Array123 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,0,1,2,3};
        Array123 array123 = new Array123();
        System.out.println(array123.array123(arr));
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }
}