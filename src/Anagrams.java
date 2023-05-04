import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {
    public static List<String> getAnagrams(String text) {
        List<String> result = new ArrayList<>();
        text = text.replace(".", "");
        text = text.replaceAll("[^a-zA-Z ]", "");
        
        String[] split = text.split(" ");
        HashMap<Integer, Object> words = new HashMap<>();
        
        for (String s : split) {
            if (words.containsKey(s.length())) {
                List<String> strings = (List<String>) words.get(s.length());
                strings.add(s);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(s);
                words.put(s.length(), arrayList);
            }
            
            int i = 1;
        }
        
        for (Map.Entry<Integer, Object> item : words.entrySet()) {
            List<String> stringList = (List<String>) item.getValue();
            if (stringList.size() > 1) {
                for (int i = 0; i < stringList.size(); i++) {
                    for (int j = i+1; j< stringList.size(); j++) {
                        boolean anagram = Anagrams.isAnagram(stringList.get(i), stringList.get(j));
                        if (anagram) {
                            result.add(stringList.get(i));
                            result.add(stringList.get(j));
                        }
                    }
                }
                
            }
        }
        
        
        return result.stream().sorted().collect(Collectors.toList());
    }
    
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        // In order for two String to be anagrams, they must have the same length.
        if(s1.length() != s2.length()) {
            return false;
        }
        // If s2 does not contain even one of s1's chars return false.
        for(int i = 0; i < s1.length(); i++) {
            if(!s2.contains("" + s1.charAt(i))) {
                return false;
            }
        }
        return true;
        
        
    }
    
    
}
