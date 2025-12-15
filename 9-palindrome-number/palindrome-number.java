class Solution {
    public boolean isPalindrome(int x) {
        // Edge Case 1: Negative numbers are not palindromes
        // Edge Case 2: Numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // Loop until we have processed half of the digits
        // When 'x' becomes less than or equal to 'reversedHalf', we've processed half.
        while (x > reversedHalf) {
            // Add the last digit of x to reversedHalf
            reversedHalf = reversedHalf * 10 + x % 10;
            // Remove the last digit from x
            x /= 10;
        }

        // For even length (e.g., 1221): x (12) == reversedHalf (12)
        // For odd length (e.g., 121): x (1) == reversedHalf (12) / 10 -> (1)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}