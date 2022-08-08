public class task2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 2, 0, 0 };
        int val = 0;
        int calc = 0;
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (nums.length > 0) {
            if (nums[nums.length - 1] == val) {
                nums[nums.length - 1] = val - 1;
                calc++;
            }
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    i--;
                    calc++;
                }
            }
        }
        for (int i = 0; i < nums.length - calc; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < calc; i++) {
            System.out.print("_ ");
        }
        System.out.println();
        int k = nums.length - calc;
        System.out.printf("k = %d", k);
    }
}
