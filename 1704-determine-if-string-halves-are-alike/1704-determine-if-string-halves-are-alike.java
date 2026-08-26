class Solution {
    public boolean halvesAreAlike(String s) {
        int hl = s.length() / 2;
        return vowelCount(s.substring(0, hl)) == vowelCount(s.substring(hl));
    }
    public int vowelCount(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                cnt++;
            }
        }
        return cnt;
    }
}