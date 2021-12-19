import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

    private static List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

    private static Map<String,Integer> wordPrefixFreq(){
      Map<String,Integer> wordCountMap = new HashMap<>();
      WORDS.stream().map(w->w.substring(0,1)).forEach(prefix ->
              wordCountMap.merge(prefix,1,(oldValue,newValue)->(newValue+=oldValue)));


        return wordCountMap;
    }

    public static void main(String[] args) {
        final Map<String,Integer> map = wordPrefixFreq();
        map.keySet().forEach(k-> System.out.println(k+": "+ map.get(k)));
    }

}
