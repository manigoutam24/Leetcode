class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;

        for (int j = s.length() - 1; j > i; j--) {
            if (s.charAt(j) == s.charAt(i)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}