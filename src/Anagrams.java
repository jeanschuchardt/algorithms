import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {
    public static List<String> getAnagrams(String text) {
        List<String> result = new ArrayList<>();
        text = text.replace(".", "");
        text = text.toLowerCase();
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
    
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    
}
