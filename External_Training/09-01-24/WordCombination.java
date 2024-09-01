
public class WordCombination {
    static int count = 0;
    public static void main(String[] args) {
        String str= "abc";
        wordCombo(str,"",str.length());
    }

    // private static void wordCombo(String string, int i, int j, int k) {
    //     if(i>1 || j>1 || k>1) return;
    //     if(i==1 && j==1 &&k==1){
    //         count++;
    //         System.out.println(count+". "+string);
    //         return;
    //     }
    //     wordCombo(string+'a', i+1, j, k);
    //     wordCombo(string+'b', i, j+1, k);
    //     wordCombo(string+'c', i, j, k+1);
    // }
    private static void wordCombo(String string, String str, int l) {
        if(string.length() == 0) {
            System.out.println(count+". "+str);
            return;
        }

        // char[] c = str.toCharArray();
        
        
        // System.out.println(temp);
        for(int i=0;i<string.length();i++){
            String temp = string.substring(0, i) + string.substring(i+1);
            // String temp = string.substring(1,string.length());
            wordCombo(temp, str+string.charAt(i), l);
        }
        
        
    }
}
