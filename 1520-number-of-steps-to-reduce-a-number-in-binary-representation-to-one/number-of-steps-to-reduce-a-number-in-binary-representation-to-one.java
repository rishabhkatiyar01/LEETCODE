class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        // Loop backwards from the last character down to the second character (index 1)
        for (int i = s.length() - 1; i > 0; i--) {
            // Get current bit value plus any carry over from the previous step
            int currentBit = (s.charAt(i) - '0') + carry;

            if (currentBit % 2 == 1) { 
                // Odd: Requires 2 operations (Add 1 to make it even, then Divide by 2)
                steps += 2;
                carry = 1; // Adding 1 to an odd binary digit creates a carry
            } else {
                // Even: Requires 1 operation (Just divide by 2)
                steps += 1;
                // carry remains what it was (or 0 if currentBit was 0)
            }
        }

        // At the end, if there is a leftover carry for the most significant bit, add it
        return steps + carry;
    }
}
