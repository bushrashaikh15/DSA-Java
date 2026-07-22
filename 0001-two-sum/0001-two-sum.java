class Solution {

    // Function that returns the indices of the two numbers
    // whose sum is equal to target.
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap.
        // Key   -> Array element
        // Value -> Index of that element
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array one by one.
        for (int i = 0; i < nums.length; i++) {

            // Current element.
            int first = nums[i];

            // Calculate the number needed to make the target.
            // complement = target - current number
            int sec = target - first;

            // Check if the complement already exists in the HashMap.
            if (map.containsKey(sec)) {

                // If found,
                // map.get(sec) gives the index of the complement.
                // i is the current index.
                // Return both indices.
                return new int[]{map.get(sec), i};
            }

            // Complement not found.
            // Store current element and its index in the HashMap.
            map.put(first, i);
        }

        // This line is never reached because the problem guarantees
        // exactly one solution.
        return new int[]{};
    }
}