// class Solution {
//     public String addSpaces(String s, int[] spaces) {
//         int n=s.length();
//         int m=spaces.length;
//         char[] output = new char[n+m];
//         int space=0;
//         int ind=0;
//         int j=0;
//         for(int i=0;i<n+m;i++){
//             if(space<m && spaces[space]==j){
//                 output[i] = ' ';
//                 space++;
//             }
//             else{
//                 output[i] = s.charAt(j);
//                 j++;
//             } 
//         }
// 		return new String(output);
//     }
// }
class Solution {
    public String addSpaces(String s, int[] spaces) {
    StringBuilder r = new StringBuilder();
    int j=0 ; 
    for(int i=0;i<s.length();i++){
        if(j<spaces.length && i==spaces[j]){
            r.append(' ');
            j++;
        }
        r.append(s.charAt(i));
    }
        return r.toString();
    }
}