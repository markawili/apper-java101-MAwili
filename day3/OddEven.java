class OddEven {
    static void countOddEven(int[] nums) {
        // Declare count for odd and even counts
        int evenCount = 0, oddCount = 0;
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if even or odd then add count
            if (nums[i] % 2 == 0) {
                evenCount++;   
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        countOddEven(nums);
    }
}
