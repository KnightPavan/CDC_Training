import java.util.HashMap;
import java.util.HashSet;

public class Autodesk {
    public static void main(String args[]){
        String[] commands =  {"goto foldA","create fileA","create fileB","create fileA","goto foldB","create fileA","create fileB","create fileC","goto foldC","goto foldD","create fileA","goto foldA","create fileB"};
        String[] command = new String[1];

        // String command = "";
        HashMap<String, HashSet<String>> map = new HashMap<>();
        for(int i=0;i<commands.length;i++){
            String[] temp = commands[i].split(" ");

            if(temp[0].equals("goto")){
                if(map.containsKey(temp[1])){
                    command[0] = temp[1];
                }else{
                    HashSet<String> set = new HashSet<>();

                    map.put(temp[1],set);
                    command[0] = temp[1];
                }
            }else{
                HashSet<String> set = map.get(command[0]);
                set.add(temp[1]);
                map.put(command[0],set);
            }
        }
        int max = 0;
        String maxFolder = "";
        for(String key : map.keySet()){
            HashSet<String> set = map.get(key);
            if(set.size()>max){
                max = set.size();
                maxFolder = key;
            }
        }
        System.out.println("The folder with the most files is " + maxFolder + " with " + max);
    }
}
