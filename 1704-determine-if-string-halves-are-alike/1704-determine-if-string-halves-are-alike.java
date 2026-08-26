// class Solution {
//     public boolean halvesAreAlike(String s) {
//         int hl = s.length() / 2;
//         return vowelCount(s.substring(0, hl)) == vowelCount(s.substring(hl));
//     }
//     public int vowelCount(String s) {
//         int cnt = 0;
//         for (char c : s.toCharArray()) {
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
// }
class Solution{
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int cnt1=0;
        int cnt2=0;
        String vowels = "aeiouAEIOU";
        for (int i=0;i<mid;i++) {
            if (vowels.indexOf(s.charAt(i))!=-1) {
                cnt1++;
            }
        }
        for (int i=mid;i<s.length();i++) {
            if (vowels.indexOf(s.charAt(i))!=-1) {
                cnt2++;
            }
        }
        return cnt1==cnt2;
    }
}