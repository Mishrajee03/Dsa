class Solution {
    private boolean vowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++) {
            if (vowel(s.charAt(i))) {
                count1++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (vowel(s.charAt(i))) {
                count2++;
            }
        }

        return count1 == count2;
    }
}