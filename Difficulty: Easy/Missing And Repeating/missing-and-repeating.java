class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // Create a frequency array (hash array) of size n+1
        // to store the counts of numbers from 1 to n
        int[] freq = new int[n + 1];

        // Iterate through the input array and update frequencies
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int repeating = -1;
        int missing = -1;

        // Iterate through the frequency array to find the repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) { // If a number appears twice, it's the repeating number
                repeating = i;
            } else if (freq[i] == 0) { // If a number doesn't appear, it's the missing number
                missing = i;
            }

            // Once both are found, we can break early
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        result.add(repeating);
        result.add(missing);
        return result;
    }
}