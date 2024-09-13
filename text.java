public class text {
    public static void main(String[] args) {
        //力扣算法第一题

        int farget = 13;
        int[] nums = {11,15,2,7,6,9,5};

        int[] sum = func(nums , farget);
        System.out.println(sum[0]);
        System.out.println(sum[1]);
    }

    private static int[] func(int[] nums, int farget) {
        int sum = 0;
        int[] result = {0,0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                sum = nums[i] + nums[j];
                //System.out.println(sum);
                if (sum == farget){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                sum = 0;
            }
        }

        return result;
    }
}