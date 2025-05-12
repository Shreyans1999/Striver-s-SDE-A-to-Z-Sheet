class Solution {
    // Helper function to check palindrome recursively
    private boolean helper(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) == s.charAt(end)) {
            return helper(s, start + 1, end - 1);
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        // Convert string to lowercase
        s = s.toLowerCase();

        // Remove non-alphanumeric characters
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(c);
            }
        }

        // Call the helper function
        String cleanString = filtered.toString();
        return helper(cleanString, 0, cleanString.length() - 1);
    }
}
