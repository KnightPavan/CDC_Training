import java.util.*;

// public class PatternMatching {
//     public static void main(String[] args) {
//         String str1 = "AAABAAAABAABAAAAB";
//         String str2 = "AAABAAAB";
//         int k = 0;
//         // ArrayList<Integer> arr = new ArrayList<>();
//         int index = -1;
//         for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)==str2.charAt(k)){
                
//                 if(k==str2.length()-1){
//                     index = i-k;
//                     break;
//                     // arr.add(index);
//                 }
//                 k++;
//             }else{
//                 k=0;
//             }
//         }
//         System.out.println((index==-1)?"No Pattern found" : index);
//     }
// }


// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         //Optimal approach
//         List<List<Integer>> ans=new ArrayList<>();
//         Arrays.sort(nums);
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(i!=0 && nums[i]==nums[i-1]) continue;
//             int j=i+1;
//             int k=n-1;

//             while(j<k){
//                 int sum=nums[i]+nums[j]+nums[k];
//                 if(sum<0){
//                     j++;
//                 }
//                 else if(sum>0){
//                     k--;
//                 }
//                 else{
//                     List<Integer> al=Arrays.asList(nums[i],nums[j],nums[k]);
//                     ans.add(al);
//                     j++;
//                     k--;
//                     while(j<k && nums[j]==nums[j-1]) j++;
//                     while(j<k && nums[k]==nums[k+1]) k--;

//                 }

//             }
//         }
//         return ans;
        
//     }
// }

// class Solution{
//     public static void main(String[] args){
//         ArrayList<Integer> arr = new ArrayList<>();
//         int i = 0;
//         while(true){
//             arr.add(i);
//             i++;
//         }
//     }
// }