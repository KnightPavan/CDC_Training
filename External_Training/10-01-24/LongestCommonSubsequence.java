import java.util.*;

public class LongestCommonSubsequence {

    public static ArrayList<String> lcs(String str, String store, int first, ArrayList<String> arr){
        if(first==str.length()){
            
            return arr;
        }

        for(int i=first;i<str.length();i++){
            arr.add(store+str.charAt(i));
            lcs(str, store+str.charAt(i), i+1, arr);

        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayList<String> s1= lcs("abc","",0, new ArrayList<String>());
        ArrayList<String> s2= lcs("acd","",0, new ArrayList<String>());

        HashMap<String, Integer> map = new HashMap<>();
        for(int k=0;k<s1.size();k++){
            map.put(s1.get(k), map.getOrDefault(s1.get(k),0)+1);
        }
        ArrayList<String> temp = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int k=0;k<s2.size();k++){
            if(map.containsKey(s2.get(k))  && s2.get(k).length()>max){
                temp.add(s2.get(k));
                max = s2.get(k).length();
            }else{
                map.put(s2.get(k), 1);
            }
            
        }

        System.out.println(temp.get(temp.size()-1));
    }
}
